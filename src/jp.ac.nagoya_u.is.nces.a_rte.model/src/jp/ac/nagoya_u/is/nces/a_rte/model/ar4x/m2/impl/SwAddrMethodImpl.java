/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2014 by Eiwa System Management, Inc., JAPAN
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
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.MemoryAllocationKeywordPolicyType;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.SwAddrMethod;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sw Addr Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwAddrMethodImpl#getMemoryAllocationKeywordPolicy <em>Memory Allocation Keyword Policy</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.SwAddrMethodImpl#getSectionInitializationPolicy <em>Section Initialization Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwAddrMethodImpl extends ArElementImpl implements SwAddrMethod {
	/**
	 * The default value of the '{@link #getMemoryAllocationKeywordPolicy() <em>Memory Allocation Keyword Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryAllocationKeywordPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final MemoryAllocationKeywordPolicyType MEMORY_ALLOCATION_KEYWORD_POLICY_EDEFAULT = MemoryAllocationKeywordPolicyType.ADDR_METHOD_SHORT_NAME;

	/**
	 * The cached value of the '{@link #getMemoryAllocationKeywordPolicy() <em>Memory Allocation Keyword Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryAllocationKeywordPolicy()
	 * @generated
	 * @ordered
	 */
	protected MemoryAllocationKeywordPolicyType memoryAllocationKeywordPolicy = MEMORY_ALLOCATION_KEYWORD_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSectionInitializationPolicy() <em>Section Initialization Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionInitializationPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String SECTION_INITIALIZATION_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSectionInitializationPolicy() <em>Section Initialization Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionInitializationPolicy()
	 * @generated
	 * @ordered
	 */
	protected String sectionInitializationPolicy = SECTION_INITIALIZATION_POLICY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwAddrMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.SW_ADDR_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryAllocationKeywordPolicyType getMemoryAllocationKeywordPolicy() {
		return memoryAllocationKeywordPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryAllocationKeywordPolicy(MemoryAllocationKeywordPolicyType newMemoryAllocationKeywordPolicy) {
		MemoryAllocationKeywordPolicyType oldMemoryAllocationKeywordPolicy = memoryAllocationKeywordPolicy;
		memoryAllocationKeywordPolicy = newMemoryAllocationKeywordPolicy == null ? MEMORY_ALLOCATION_KEYWORD_POLICY_EDEFAULT : newMemoryAllocationKeywordPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_ADDR_METHOD__MEMORY_ALLOCATION_KEYWORD_POLICY, oldMemoryAllocationKeywordPolicy, memoryAllocationKeywordPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSectionInitializationPolicy() {
		return sectionInitializationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionInitializationPolicy(String newSectionInitializationPolicy) {
		String oldSectionInitializationPolicy = sectionInitializationPolicy;
		sectionInitializationPolicy = newSectionInitializationPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.SW_ADDR_METHOD__SECTION_INITIALIZATION_POLICY, oldSectionInitializationPolicy, sectionInitializationPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2Package.SW_ADDR_METHOD__MEMORY_ALLOCATION_KEYWORD_POLICY:
				return getMemoryAllocationKeywordPolicy();
			case M2Package.SW_ADDR_METHOD__SECTION_INITIALIZATION_POLICY:
				return getSectionInitializationPolicy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case M2Package.SW_ADDR_METHOD__MEMORY_ALLOCATION_KEYWORD_POLICY:
				setMemoryAllocationKeywordPolicy((MemoryAllocationKeywordPolicyType)newValue);
				return;
			case M2Package.SW_ADDR_METHOD__SECTION_INITIALIZATION_POLICY:
				setSectionInitializationPolicy((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case M2Package.SW_ADDR_METHOD__MEMORY_ALLOCATION_KEYWORD_POLICY:
				setMemoryAllocationKeywordPolicy(MEMORY_ALLOCATION_KEYWORD_POLICY_EDEFAULT);
				return;
			case M2Package.SW_ADDR_METHOD__SECTION_INITIALIZATION_POLICY:
				setSectionInitializationPolicy(SECTION_INITIALIZATION_POLICY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case M2Package.SW_ADDR_METHOD__MEMORY_ALLOCATION_KEYWORD_POLICY:
				return memoryAllocationKeywordPolicy != MEMORY_ALLOCATION_KEYWORD_POLICY_EDEFAULT;
			case M2Package.SW_ADDR_METHOD__SECTION_INITIALIZATION_POLICY:
				return SECTION_INITIALIZATION_POLICY_EDEFAULT == null ? sectionInitializationPolicy != null : !SECTION_INITIALIZATION_POLICY_EDEFAULT.equals(sectionInitializationPolicy);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (memoryAllocationKeywordPolicy: ");
		result.append(memoryAllocationKeywordPolicy);
		result.append(", sectionInitializationPolicy: ");
		result.append(sectionInitializationPolicy);
		result.append(')');
		return result.toString();
	}

} //SwAddrMethodImpl
