/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2016 by Eiwa System Management, Inc., JAPAN
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
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl;

import java.util.Collection;

import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetActivationOperation;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Os Event Set Executable Task Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsEventSetExecutableTaskBodyImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsEventSetExecutableTaskBodyImpl#getOsEventId <em>Os Event Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsEventSetExecutableTaskBodyImpl#getChecksOsEventId <em>Checks Os Event Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.impl.OsEventSetExecutableTaskBodyImpl#getEventVariable <em>Event Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OsEventSetExecutableTaskBodyImpl extends TaskBodyImpl implements OsEventSetExecutableTaskBody {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<OsEventSetActivationOperation> operation;

	/**
	 * The cached value of the '{@link #getOsEventId() <em>Os Event Id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsEventId()
	 * @generated
	 * @ordered
	 */
	protected EList<String> osEventId;

	/**
	 * The default value of the '{@link #getChecksOsEventId() <em>Checks Os Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecksOsEventId()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CHECKS_OS_EVENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChecksOsEventId() <em>Checks Os Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecksOsEventId()
	 * @generated
	 * @ordered
	 */
	protected Boolean checksOsEventId = CHECKS_OS_EVENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEventVariable() <em>Event Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable eventVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsEventSetExecutableTaskBodyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModulePackage.Literals.OS_EVENT_SET_EXECUTABLE_TASK_BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OsEventSetActivationOperation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<OsEventSetActivationOperation>(OsEventSetActivationOperation.class, this, ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOsEventId() {
		if (osEventId == null) {
			osEventId = new EDataTypeUniqueEList<String>(String.class, this, ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OS_EVENT_ID);
		}
		return osEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getChecksOsEventId() {
		return checksOsEventId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChecksOsEventId(Boolean newChecksOsEventId) {
		Boolean oldChecksOsEventId = checksOsEventId;
		checksOsEventId = newChecksOsEventId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__CHECKS_OS_EVENT_ID, oldChecksOsEventId, checksOsEventId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getEventVariable() {
		if (eventVariable != null && ((EObject)eventVariable).eIsProxy()) {
			InternalEObject oldEventVariable = (InternalEObject)eventVariable;
			eventVariable = (Variable)eResolveProxy(oldEventVariable);
			if (eventVariable != oldEventVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__EVENT_VARIABLE, oldEventVariable, eventVariable));
			}
		}
		return eventVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetEventVariable() {
		return eventVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventVariable(Variable newEventVariable) {
		Variable oldEventVariable = eventVariable;
		eventVariable = newEventVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__EVENT_VARIABLE, oldEventVariable, eventVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OPERATION:
				return getOperation();
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OS_EVENT_ID:
				return getOsEventId();
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__CHECKS_OS_EVENT_ID:
				return getChecksOsEventId();
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__EVENT_VARIABLE:
				if (resolve) return getEventVariable();
				return basicGetEventVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends OsEventSetActivationOperation>)newValue);
				return;
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OS_EVENT_ID:
				getOsEventId().clear();
				getOsEventId().addAll((Collection<? extends String>)newValue);
				return;
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__CHECKS_OS_EVENT_ID:
				setChecksOsEventId((Boolean)newValue);
				return;
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__EVENT_VARIABLE:
				setEventVariable((Variable)newValue);
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
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OPERATION:
				getOperation().clear();
				return;
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OS_EVENT_ID:
				getOsEventId().clear();
				return;
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__CHECKS_OS_EVENT_ID:
				setChecksOsEventId(CHECKS_OS_EVENT_ID_EDEFAULT);
				return;
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__EVENT_VARIABLE:
				setEventVariable((Variable)null);
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
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OPERATION:
				return operation != null && !operation.isEmpty();
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__OS_EVENT_ID:
				return osEventId != null && !osEventId.isEmpty();
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__CHECKS_OS_EVENT_ID:
				return CHECKS_OS_EVENT_ID_EDEFAULT == null ? checksOsEventId != null : !CHECKS_OS_EVENT_ID_EDEFAULT.equals(checksOsEventId);
			case ModulePackage.OS_EVENT_SET_EXECUTABLE_TASK_BODY__EVENT_VARIABLE:
				return eventVariable != null;
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
		result.append(" (osEventId: ");
		result.append(osEventId);
		result.append(", checksOsEventId: ");
		result.append(checksOsEventId);
		result.append(')');
		return result.toString();
	}

} //OsEventSetExecutableTaskBodyImpl
