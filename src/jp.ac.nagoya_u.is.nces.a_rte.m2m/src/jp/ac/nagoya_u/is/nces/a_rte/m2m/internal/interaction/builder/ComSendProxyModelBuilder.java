/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
 *
 *  上記著作権者は，以下の(1)〜(4)の条件を満たす場合に限り，本ソフトウェ
 *  ア（本ソフトウェアを改変したものを含む．以下同じ）を使用・複製・改
 *  変・再配布（以下，利用と呼ぶ）することを無償で許諾する．
 *  (1) 本ソフトウェアをソースコードの形で利用する場合には，上記の著作
 *      権表示，この利用条件および下記の無保証規定が，そのままの形でソー
 *      スコード中に含まれていること．
 *  (2) 本ソフトウェアを，ライブラリ形式など，他のソフトウェア開発に使
 *      用できる形で再配布する場合には，再配布に伴うドキュメント（利用
 *      者マニュアルなど）に，上記の著作権表示，この利用条件および下記
 *      の無保証規定を掲載すること．
 *  (3) 本ソフトウェアを，機器に組み込むなど，他のソフトウェア開発に使
 *      用できない形で再配布する場合には，次のいずれかの条件を満たすこ
 *      と．
 *    (a) 再配布に伴うドキュメント（利用者マニュアルなど）に，上記の著
 *        作権表示，この利用条件および下記の無保証規定を掲載すること．
 *    (b) 再配布の形態を，別に定める方法によって，TOPPERSプロジェクトに
 *        報告すること．
 *  (4) 本ソフトウェアの利用により直接的または間接的に生じるいかなる損
 *      害からも，上記著作権者およびTOPPERSプロジェクトを免責すること．
 *      また，本ソフトウェアのユーザまたはエンドユーザからのいかなる理
 *      由に基づく請求からも，上記著作権者およびTOPPERSプロジェクトを
 *      免責すること．
 *
 *  本ソフトウェアは，AUTOSAR（AUTomotive Open System ARchitecture）仕
 *  様に基づいている．上記の許諾は，AUTOSARの知的財産権を許諾するもので
 *  はない．AUTOSARは，AUTOSAR仕様に基づいたソフトウェアを商用目的で利
 *  用する者に対して，AUTOSARパートナーになることを求めている．
 *
 *  本ソフトウェアは，無保証で提供されているものである．上記著作権者お
 *  よびTOPPERSプロジェクトは，本ソフトウェアに関して，特定の使用目的
 *  に対する適合性も含めて，いかなる保証も行わない．また，本ソフトウェ
 *  アの利用により直接的または間接的に生じたいかなる損害に関しても，そ
 *  の責任を負わない．
 *
 *  $Id $
 */
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.interaction.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.PERIODIC_PROXY_COM_SEND_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;

import java.util.ArrayList;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInSwc;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ImmediateComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionRoot;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuSender;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.PeriodicComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ProxyComSendImplementation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.collect.Lists;

public class ComSendProxyModelBuilder {
	private final InteractionModelBuildContext context;

	public ComSendProxyModelBuilder(InteractionModelBuildContext context) {
		this.context = context;
	}

	public void build() throws ModelException {
		if (!this.context.cache.masterBswPartition.isPresent()) {
			return;
		}

		buildPeriodicComSendProxy(this.context.cache.interactionRoot);
		buildImmediateComSendProxy(this.context.cache.interactionRoot);
	}

	private void buildPeriodicComSendProxy(InteractionRoot targetInteractionRoot) throws ModelException {
		// 周期通信用のプロキシを構築
		PeriodicComSendProxy periodicComSendProxy = createPeriodicComSendProxy();
		targetInteractionRoot.getInteractionEnd().add(periodicComSendProxy);

		// 周期通信用のプロキシCOM通信の連携を構築
		buildComSendProxyInteractions(targetInteractionRoot, periodicComSendProxy, PERIODIC_PROXY_COM_SEND_IMPLEMENTATION);

		// 連携がない場合，プロキシを削除
		if (periodicComSendProxy.getInteraction().isEmpty()) {
			EcoreUtil.remove(periodicComSendProxy);
		}
	}

	private PeriodicComSendProxy createPeriodicComSendProxy() {
		PeriodicComSendProxy periodicComSendProxy = InteractionFactory.eINSTANCE.createPeriodicComSendProxy();
		periodicComSendProxy.setOwnerPartition(this.context.cache.masterBswPartition.get());
		return periodicComSendProxy;
	}

	private void buildImmediateComSendProxy(InteractionRoot InteractionRoot) throws ModelException {
		// 即時通信用のプロキシCOM通信の連携を構築
		ImmediateComSendProxy immediateComSendProxy = createImmediateComSendProxy();
		InteractionRoot.getInteractionEnd().add(immediateComSendProxy);

		// 即時通信用のプロキシCOM通信の連携を構築
		buildComSendProxyInteractions(InteractionRoot, immediateComSendProxy, IMMEDIATE_PROXY_COM_SEND_IMPLEMENTATION);

		// 連携がない場合，プロキシを削除
		if (immediateComSendProxy.getInteraction().isEmpty()) {
			EcoreUtil.remove(immediateComSendProxy);
		}
	}

	private ImmediateComSendProxy createImmediateComSendProxy() {
		ImmediateComSendProxy immediateComSendProxy = InteractionFactory.eINSTANCE.createImmediateComSendProxy();
		immediateComSendProxy.setOwnerPartition(this.context.cache.masterBswPartition.get());
		return immediateComSendProxy;
	}

	private void buildComSendProxyInteractions(InteractionRoot targetInteractionRoot, ComSendProxy comSendProxy, EClass sourceSendImplementationKind) throws ModelException {
		List<ProxyComSendImplementation> sourceSendImplementations = this.context.query.<ProxyComSendImplementation> findByKind(sourceSendImplementationKind);
		List<ProxyComSendImplementation> primitiveImplementations = new ArrayList<ProxyComSendImplementation>();
		
		// プロキシ連携を構築
		List<ComSendProxyInteraction> peridicProxyInteractions = Lists.newArrayList();
		for (ProxyComSendImplementation proxyComSendImplementation : sourceSendImplementations) {
			InternalEcuSender sender = proxyComSendImplementation.getParent().getInternalEcuSenders().get(0);

			ImplementationDataType implDataType = sender.getSource().getPrototype().getImplementationDataType();
			implDataType = implDataType.getLeafImplementationDataType();
			ComSendProxyInteraction proxyInteraction = InteractionFactory.eINSTANCE.createComSendProxyInteraction();
			proxyInteraction.setRequesterPartition(sender.getOwnerPartition());
			proxyInteraction.setSignalDataType(getAppropriateType(implDataType));
			
			// Complex型はシグナルにも依存するかつ、IOCが2つ必要なのに1つは流用されるため、処理が複雑になる。
			// IOCは出力ソース内に定義はでないため、間引かずにaddする。ただし、MockOsIoc内で重複しないように制御する。
			if (implDataType.getBaseType() == null) {
				proxyComSendImplementation.setProxyInteraction(proxyInteraction);
				comSendProxy.getInteraction().add(proxyInteraction);
				targetInteractionRoot.getInteraction().add(proxyInteraction);
			} else {
				peridicProxyInteractions.add(proxyInteraction);
				primitiveImplementations.add(proxyComSendImplementation);
			}
		}

		// primitiveがないならreturn
		if (peridicProxyInteractions.isEmpty()) {
			return;
		}
		
		List<ComSendProxyInteraction> uniquePeridicProxyInteractions = this.context.query.uniqueByKeys(peridicProxyInteractions, COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION,
				COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE);
		targetInteractionRoot.getInteraction().addAll(uniquePeridicProxyInteractions);

		// プロキシに連携をひもづけ
		comSendProxy.getInteraction().addAll(uniquePeridicProxyInteractions);

		// 実装に使用するプロキシ連携を設定
		for (ProxyComSendImplementation sourceProxyComSendImplementation : primitiveImplementations) {
			InternalEcuSender sender = sourceProxyComSendImplementation.getParent().getInternalEcuSenders().get(0);
			VariableDataInstanceInSwc dataInstanceInSwc = sender.getSource().getPrototype();

			ImplementationDataType implDataType = dataInstanceInSwc.getImplementationDataType();
			implDataType = implDataType.getLeafImplementationDataType();

			ComSendProxyInteraction proxyInteraction = this.context.query.selectSingle(uniquePeridicProxyInteractions, ref(COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION, sender.getOwnerPartition())
					.AND(ref(COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE, getAppropriateType(implDataType))));
			sourceProxyComSendImplementation.setProxyInteraction(proxyInteraction);
		}
	}

	private ImplementationDataType getAppropriateType(ImplementationDataType sourceImplementationDataType) {
		if (sourceImplementationDataType.getBaseType() != null) {
			return getAppropriateType(sourceImplementationDataType.getBaseType().getBaseTypeSize());
		}
		return sourceImplementationDataType;
	}

	public ImplementationDataType getAppropriateType(int baseTypeSize) {
		if (baseTypeSize <= 8) {
			return this.context.cache.uint8Type;
		} else if (baseTypeSize <= 16) {
			return this.context.cache.uint16Type;
		} else {
			return this.context.cache.uint32Type;
		}
	}
}