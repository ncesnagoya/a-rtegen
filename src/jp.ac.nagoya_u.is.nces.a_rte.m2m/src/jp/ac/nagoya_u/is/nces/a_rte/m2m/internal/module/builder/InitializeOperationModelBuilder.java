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
package jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.module.builder;

import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage.Literals.COM_SIGNAL_GROUP;
import static jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.InstancePackage.Literals.SW_COMPONENT_INSTANCE_IN_SYSTEM;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_START__VARIABLEDATAINSTANCEINCOMPOSITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAPROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.ex.ExPackage.Literals.VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_START__VARIABLEDATAPROTOTYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.CYCLE_COUNTER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.FILTER_BUFFER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.IOC_VALUE_BUFFER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.RECEIVE_INTERACTION___RECEIVES_FROM_MULTIPLE_CORES;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.RECEIVE_INTERACTION___RECEIVES_INTER_CORE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.RTE_VALUE_BUFFER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.START_OFFSET_COUNTER_IMPLEMENTATION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.VALUE_BUFFER_IMPLEMENTATION__PARENT;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage.Literals.VARIABLE_IMPLEMENTATION__OWNER_PARTITION;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.GLOBAL_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IOC_EMPTY_QUEUE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.IOC_WRITE_API;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.MODULE_OBJECT__SOURCE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_BUFFER_QUEUED_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.STRUCT_TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage.Literals.VARIABLE__TYPE;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.hasOp;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.isKindOf;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.ref;
import static jp.ac.nagoya_u.is.nces.a_rte.model.util.EObjectConditions.refExists;

import java.util.Collection;
import java.util.List;

import javax.lang.model.type.ArrayType;

import jp.ac.nagoya_u.is.nces.a_rte.m2m.internal.common.util.Identifiers;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.ComSignalGroup;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.SwComponentInstanceInSystem;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.instance.VariableDataInstanceInComposition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.AtomicSwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwBaseType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwComponentType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.VariableDataPrototype;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.BswSchedulableEntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.CycleCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.FilterBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InternalEcuReceiver;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.IocValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ReceiveInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RteValueBufferImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.RunnableEntityStartInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.StartOffsetCounterImplementation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Core;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InitializeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocEmptyQueueApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocInitializeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocWriteApi;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PointerType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.PrimitiveType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StructType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableInitializeOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.EmfUtils;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

@SuppressWarnings("unused")
public class InitializeOperationModelBuilder {

	private ModuleModelBuildContext context;
	private ExcludeOperationModelBuilder excludeOperationBuilder;

	public InitializeOperationModelBuilder(ModuleModelBuildContext context) {
		this.context = context;
		this.excludeOperationBuilder = new ExcludeOperationModelBuilder(context);
	}

	public VariableInitializeOperation createRteVariableInitializeOperationAtStart(Core sourceCore) throws ModelException {
		VariableInitializeOperation variableInitializeOperation = ModuleFactory.eINSTANCE.createVariableInitializeOperation();
		for (Partition partition : sourceCore.getPartition()) {
			EcucPartition sourcePartition = (EcucPartition) partition.getSingleSource();

			buildRteBufferInitVariables(variableInitializeOperation, sourcePartition, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_START__VARIABLEDATAINSTANCEINCOMPOSITION);
			buildFilterBufferInitVariables(variableInitializeOperation, sourcePartition);
			buildRunnableEntityInitVariables(variableInitializeOperation, sourcePartition);
			buildIrvInitVariables(variableInitializeOperation, sourcePartition, VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_START__VARIABLEDATAPROTOTYPE);
		}
		return variableInitializeOperation;
	}

	public VariableInitializeOperation createSchmVariableInitializeOperationAtStart(Core sourceCore) throws ModelException {
		VariableInitializeOperation variableInitializeOperation = ModuleFactory.eINSTANCE.createVariableInitializeOperation();
		for (Partition partition : sourceCore.getPartition()) {
			EcucPartition sourcePartition = (EcucPartition) partition.getSingleSource();
			buildBswSchedulableEntityInitVariables(variableInitializeOperation, sourcePartition);
		}
		return variableInitializeOperation;
	}

	public VariableInitializeOperation createRteVariableInitializeOperationAtPartitionRestart(EcucPartition sourcePartition) throws ModelException {
		VariableInitializeOperation variableInitializeOperation = ModuleFactory.eINSTANCE.createVariableInitializeOperation();
		buildRteBufferInitVariables(variableInitializeOperation, sourcePartition, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAINSTANCEINCOMPOSITION);
		buildRunnableEntityInitVariables(variableInitializeOperation, sourcePartition);
		buildIrvInitVariables(variableInitializeOperation, sourcePartition, VARIABLE_DATA_PROTOTYPE_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAPROTOTYPE);
		buildExcludeOperation(variableInitializeOperation);
		return variableInitializeOperation;
	}

	private void buildRteBufferInitVariables(VariableInitializeOperation targetInitializeOperation, EcucPartition sourcePartition, EOperation initPredicateOperation) throws ModelException {
		for (RteValueBufferImplementation valueBufferImplementation : this.context.query.<RteValueBufferImplementation> find(isKindOf(RTE_VALUE_BUFFER_IMPLEMENTATION).AND(
				ref(VARIABLE_IMPLEMENTATION__OWNER_PARTITION, sourcePartition)))) {

			InternalEcuReceiver receiver = valueBufferImplementation.getParent().getInternalEcuReceivers().get(0);
			VariableDataInstanceInComposition dataInstanceInComposition = receiver.getSource();

			if (this.context.query.get(dataInstanceInComposition, initPredicateOperation)) {
				GlobalVariable rteBufferVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, valueBufferImplementation);
				targetInitializeOperation.getInitVariable().add(rteBufferVariable);
			}
		}
	}

	private void buildFilterBufferInitVariables(VariableInitializeOperation targetInitializeOperation, EcucPartition sourcePartition) throws ModelException {
		for (FilterBufferImplementation filterBufferImplementation : this.context.query.<FilterBufferImplementation> find(isKindOf(FILTER_BUFFER_IMPLEMENTATION).AND(
				ref(VARIABLE_IMPLEMENTATION__OWNER_PARTITION, sourcePartition)))) {

			GlobalVariable rteBufferVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, filterBufferImplementation);
			targetInitializeOperation.getInitVariable().add(rteBufferVariable);
		}
	}

	private void buildRunnableEntityInitVariables(VariableInitializeOperation targetInitializeOperation, EcucPartition sourcePartition) throws ModelException {
		for (StartOffsetCounterImplementation counterImplementation : this.context.query.<StartOffsetCounterImplementation> find(isKindOf(START_OFFSET_COUNTER_IMPLEMENTATION).AND(
				ref(VARIABLE_IMPLEMENTATION__OWNER_PARTITION, sourcePartition)))) {
			if (counterImplementation.getParent().getStartInteraction().get(0) instanceof RunnableEntityStartInteraction) {
				GlobalVariable initVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, counterImplementation);
				targetInitializeOperation.getInitVariable().add(initVariable);
			}
		}

		for (CycleCounterImplementation counterImplementation : this.context.query.<CycleCounterImplementation> find(isKindOf(CYCLE_COUNTER_IMPLEMENTATION).AND(
				ref(VARIABLE_IMPLEMENTATION__OWNER_PARTITION, sourcePartition)))) {
			if (counterImplementation.getParent().getStartInteraction().get(0) instanceof RunnableEntityStartInteraction) {
				GlobalVariable initVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, counterImplementation);
				targetInitializeOperation.getInitVariable().add(initVariable);
			}
		}
	}
	
	private void buildIrvInitVariables(VariableInitializeOperation targetInitializeOperation, EcucPartition sourcePartition, EOperation initPredicateOperation) throws ModelException {
		if (sourcePartition == null) {
			// noPartitionの場合は、queryでSwComponentInstanceInSystemを取得する
			for (SwComponentInstanceInSystem swInstanceInSystem : this.context.query.<SwComponentInstanceInSystem> findByKind(SW_COMPONENT_INSTANCE_IN_SYSTEM)) {
				setInitVariable(targetInitializeOperation, initPredicateOperation, swInstanceInSystem.getPrototype().getType());
			}
		} else {
			for (SwComponentInstanceInSystem swInstanceInSystem : sourcePartition.getEcucPartitionSoftwareComponent()) {
				setInitVariable(targetInitializeOperation, initPredicateOperation, swInstanceInSystem.getPrototype().getType());
			}
		}
	}

	private void setInitVariable(VariableInitializeOperation targetInitializeOperation, EOperation initPredicateOperation, SwComponentType swComponentType)
			throws ModelException {
		if (!(swComponentType instanceof AtomicSwComponentType)) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			return;
		}
		if (((AtomicSwComponentType) swComponentType).getInternalBehavior() == null) { // COVERAGE 常に未達(不具合混入時のみ到達するコードなので，未カバレッジで問題ない)
			return;
		}
		for (VariableDataPrototype dataPrototype : ((AtomicSwComponentType) swComponentType).getInternalBehavior().getExplicitInterRunnableVariable()) {
			GlobalVariable initVariable = getInitVariableForIrv(dataPrototype, initPredicateOperation);
			if (initVariable != null) {
				targetInitializeOperation.getInitVariable().add(initVariable);
			}
		}
	}

	private GlobalVariable getInitVariableForIrv(VariableDataPrototype dataPrototype, EOperation initPredicateOperation) throws ModelException {
		if (this.context.query.get(dataPrototype, initPredicateOperation)) {
			return this.context.builtQuery.findDest(RTE_BUFFER_VARIABLE_SET, dataPrototype);
		}
		return null;
	}

	private void buildBswSchedulableEntityInitVariables(VariableInitializeOperation targetInitializeOperation, EcucPartition sourcePartition) throws ModelException {
		for (StartOffsetCounterImplementation counterImplementation : this.context.query.<StartOffsetCounterImplementation> find(isKindOf(START_OFFSET_COUNTER_IMPLEMENTATION).AND(
				ref(VARIABLE_IMPLEMENTATION__OWNER_PARTITION, sourcePartition)))) {
			if (counterImplementation.getParent().getStartInteraction().get(0) instanceof BswSchedulableEntityStartInteraction) {
				GlobalVariable initVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, counterImplementation);
				targetInitializeOperation.getInitVariable().add(initVariable);
			}
		}

		for (CycleCounterImplementation counterImplementation : this.context.query.<CycleCounterImplementation> find(isKindOf(CYCLE_COUNTER_IMPLEMENTATION).AND(
				ref(VARIABLE_IMPLEMENTATION__OWNER_PARTITION, sourcePartition)))) {
			if (counterImplementation.getParent().getStartInteraction().get(0) instanceof BswSchedulableEntityStartInteraction) {
				GlobalVariable initVariable = this.context.builtQuery.findDest(GLOBAL_VARIABLE, counterImplementation);
				targetInitializeOperation.getInitVariable().add(initVariable);
			}
		}
	}

	private void buildExcludeOperation(VariableInitializeOperation targetInitializeOperation) {
		List<RteBufferVariableSet> rteBufferVariableSets = this.context.query.selectByKind(targetInitializeOperation.getInitVariable(), RTE_BUFFER_VARIABLE_SET);
		boolean isRteBufferWithStatusExists = this.context.query.exists(rteBufferVariableSets, refExists(RTE_BUFFER_VARIABLE_SET__STATUS_VARIABLE));
		boolean isQueueExists = this.context.query.exists(targetInitializeOperation.getInitVariable(), isKindOf(RTE_BUFFER_QUEUED_VARIABLE));
		boolean isComplexTypeExists = false;
		boolean isFloat64 = false;

		for (RteBufferVariableSet variableSet : rteBufferVariableSets) {
			Type type = variableSet.getValueVariable().getType();
			if (! (type instanceof PrimitiveType || type instanceof PointerType)) {
				isComplexTypeExists = true;
				break;
			}
			if (type instanceof PrimitiveType) {
				SwBaseType baseType = ((ImplementationDataType)type.getSingleSource()).getBaseType();
				if (baseType != null
						&& Identifiers.BASE_TYPE_ENCODING_IEEE754.equals(baseType.getBaseTypeEncoding())
						&& type.getSize() == 64) {
					isFloat64 = true;
					break;
				}
			}
		}

		if (isQueueExists || isRteBufferWithStatusExists || isComplexTypeExists || isFloat64) {
			boolean accessedInterCore = anyVariableAccessedInterCore(targetInitializeOperation);
			targetInitializeOperation.setExcludeOperation(this.excludeOperationBuilder.createExcludeOperationForRteInternalLock(accessedInterCore));
		}
	}

	private boolean anyVariableAccessedInterCore(VariableInitializeOperation targetInitializeOperation) {
		List<EObject> sources = this.context.query.collect(targetInitializeOperation.getInitVariable(), MODULE_OBJECT__SOURCE);
		List<RteValueBufferImplementation> sourceBufferImplementations = this.context.query.selectByKind(sources, RTE_VALUE_BUFFER_IMPLEMENTATION);
		List<ReceiveInteraction> receiveInteractions = this.context.query.collect(sourceBufferImplementations, VALUE_BUFFER_IMPLEMENTATION__PARENT);
		return this.context.query.exists(receiveInteractions, hasOp(RECEIVE_INTERACTION___RECEIVES_INTER_CORE, true));
	}

	public IocInitializeOperation createIocInitializeOperationAtPartitionRestart(EcucPartition sourcePartition) throws ModelException {
		IocInitializeOperation iocInitializeOperation = ModuleFactory.eINSTANCE.createIocInitializeOperation();
		buildInitIocApis(iocInitializeOperation, sourcePartition, VARIABLE_DATA_INSTANCE_IN_COMPOSITION_EX___INIT_AT_PARTITION_RESTART__VARIABLEDATAINSTANCEINCOMPOSITION);
		return iocInitializeOperation;
	}

	private void buildInitIocApis(IocInitializeOperation targetInitializeOperation, EcucPartition sourcePartition, EOperation initPredicateOperation) throws ModelException {
		for (IocValueBufferImplementation valueBufferImplementation : this.context.query.<IocValueBufferImplementation> find(isKindOf(IOC_VALUE_BUFFER_IMPLEMENTATION).AND(
				ref(VARIABLE_IMPLEMENTATION__OWNER_PARTITION, sourcePartition)))) {

			InternalEcuReceiver receiver = valueBufferImplementation.getParent().getInternalEcuReceivers().get(0);
			VariableDataInstanceInComposition dataInstanceInComposition = receiver.getSource();

			if (this.context.query.get(dataInstanceInComposition, initPredicateOperation)) {
				if (dataInstanceInComposition.getPrototype().isEventSemantics()) {
					IocEmptyQueueApi iocEmptyQueueApi = this.context.builtQuery.findDest(IOC_EMPTY_QUEUE_API, valueBufferImplementation.getOsIocCommunication());
					targetInitializeOperation.getInitIocApi().add(iocEmptyQueueApi);
				} else {
					IocWriteApi iocWriteApi = this.context.builtQuery.findDest(IOC_WRITE_API, valueBufferImplementation.getOsIocCommunication().getLoopbackSenderProperties());
					targetInitializeOperation.getInitIocApi().add(iocWriteApi);
				}
			}
		}
	}
}
