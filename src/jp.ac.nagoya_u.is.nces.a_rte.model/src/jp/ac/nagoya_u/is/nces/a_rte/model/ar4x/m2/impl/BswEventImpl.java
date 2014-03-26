/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2014 by Eiwa System Management, Inc., JAPAN
 *
 *  �嵭����Ԥϡ��ʲ���(1)��(4)�ξ������������˸¤ꡤ�ܥ��եȥ���
 *  �����ܥ��եȥ���������Ѥ�����Τ�ޤࡥ�ʲ�Ʊ���ˤ���ѡ�ʣ������
 *  �ѡ������ۡʰʲ������ѤȸƤ֡ˤ��뤳�Ȥ�̵���ǵ������롥
 *  (1) �ܥ��եȥ������򥽡��������ɤη������Ѥ�����ˤϡ��嵭������
 *      ��ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ��꤬�����Τޤޤη��ǥ���
 *      ����������˴ޤޤ�Ƥ��뤳�ȡ�
 *  (2) �ܥ��եȥ������򡤥饤�֥������ʤɡ�¾�Υ��եȥ�������ȯ�˻�
 *      �ѤǤ�����Ǻ����ۤ�����ˤϡ������ۤ�ȼ���ɥ�����ȡ�����
 *      �ԥޥ˥奢��ʤɡˤˡ��嵭�����ɽ�����������Ѿ�浪��Ӳ���
 *      ��̵�ݾڵ����Ǻܤ��뤳�ȡ�
 *  (3) �ܥ��եȥ������򡤵�����Ȥ߹���ʤɡ�¾�Υ��եȥ�������ȯ�˻�
 *      �ѤǤ��ʤ����Ǻ����ۤ�����ˤϡ����Τ����줫�ξ�����������
 *      �ȡ�
 *    (a) �����ۤ�ȼ���ɥ�����ȡ����Ѽԥޥ˥奢��ʤɡˤˡ��嵭����
 *        �ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ����Ǻܤ��뤳�ȡ�
 *    (b) �����ۤη��֤��̤�������ˡ�ˤ�äơ�TOPPERS�ץ��������Ȥ�
 *        ��𤹤뤳�ȡ�
 *  (4) �ܥ��եȥ����������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������뤤���ʤ�»
 *      ������⡤�嵭����Ԥ����TOPPERS�ץ��������Ȥ����դ��뤳�ȡ�
 *      �ޤ����ܥ��եȥ������Υ桼���ޤ��ϥ���ɥ桼������Τ����ʤ���
 *      ͳ�˴�Ť����ᤫ��⡤�嵭����Ԥ����TOPPERS�ץ��������Ȥ�
 *      ���դ��뤳�ȡ�
 *
 *  �ܥ��եȥ������ϡ�AUTOSAR��AUTomotive Open System ARchitecture�˻�
 *  �ͤ˴�Ť��Ƥ��롥�嵭�ε����ϡ�AUTOSAR����Ū�⻺������������Τ�
 *  �Ϥʤ���AUTOSAR�ϡ�AUTOSAR���ͤ˴�Ť������եȥ�����������Ū����
 *  �Ѥ���Ԥ��Ф��ơ�AUTOSAR�ѡ��ȥʡ��ˤʤ뤳�Ȥ���Ƥ��롥
 *
 *  �ܥ��եȥ������ϡ�̵�ݾڤ��󶡤���Ƥ����ΤǤ��롥�嵭����Ԥ�
 *  ���TOPPERS�ץ��������Ȥϡ��ܥ��եȥ������˴ؤ��ơ�����λ�����Ū
 *  ���Ф���Ŭ������ޤ�ơ������ʤ��ݾڤ�Ԥ�ʤ����ޤ����ܥ��եȥ���
 *  �������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������������ʤ�»���˴ؤ��Ƥ⡤��
 *  ����Ǥ�����ʤ���
 *
 *  $Id $
 */
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl;

import java.util.Collection;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPackage;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.RteBswEventToTaskMapping;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswEvent;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswInternalBehavior;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.BswSchedulableEntity;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bsw Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswEventImpl#getStartsOnEvent <em>Starts On Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswEventImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.impl.BswEventImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BswEventImpl extends IdentifiableImpl implements BswEvent {
	/**
	 * The cached value of the '{@link #getStartsOnEvent() <em>Starts On Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartsOnEvent()
	 * @generated
	 * @ordered
	 */
	protected BswSchedulableEntity startsOnEvent;

	/**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected EList<RteBswEventToTaskMapping> config;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BswEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M2Package.Literals.BSW_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswSchedulableEntity getStartsOnEvent() {
		if (startsOnEvent != null && ((EObject)startsOnEvent).eIsProxy()) {
			InternalEObject oldStartsOnEvent = (InternalEObject)startsOnEvent;
			startsOnEvent = (BswSchedulableEntity)eResolveProxy(oldStartsOnEvent);
			if (startsOnEvent != oldStartsOnEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M2Package.BSW_EVENT__STARTS_ON_EVENT, oldStartsOnEvent, startsOnEvent));
			}
		}
		return startsOnEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswSchedulableEntity basicGetStartsOnEvent() {
		return startsOnEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartsOnEvent(BswSchedulableEntity newStartsOnEvent, NotificationChain msgs) {
		BswSchedulableEntity oldStartsOnEvent = startsOnEvent;
		startsOnEvent = newStartsOnEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M2Package.BSW_EVENT__STARTS_ON_EVENT, oldStartsOnEvent, newStartsOnEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartsOnEvent(BswSchedulableEntity newStartsOnEvent) {
		if (newStartsOnEvent != startsOnEvent) {
			NotificationChain msgs = null;
			if (startsOnEvent != null)
				msgs = ((InternalEObject)startsOnEvent).eInverseRemove(this, M2Package.BSW_SCHEDULABLE_ENTITY__EVENT, BswSchedulableEntity.class, msgs);
			if (newStartsOnEvent != null)
				msgs = ((InternalEObject)newStartsOnEvent).eInverseAdd(this, M2Package.BSW_SCHEDULABLE_ENTITY__EVENT, BswSchedulableEntity.class, msgs);
			msgs = basicSetStartsOnEvent(newStartsOnEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.BSW_EVENT__STARTS_ON_EVENT, newStartsOnEvent, newStartsOnEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RteBswEventToTaskMapping> getConfig() {
		if (config == null) {
			config = new EObjectWithInverseResolvingEList<RteBswEventToTaskMapping>(RteBswEventToTaskMapping.class, this, M2Package.BSW_EVENT__CONFIG, EcucPackage.RTE_BSW_EVENT_TO_TASK_MAPPING__RTE_BSW_EVENT);
		}
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BswInternalBehavior getParent() {
		if (eContainerFeatureID() != M2Package.BSW_EVENT__PARENT) return null;
		return (BswInternalBehavior)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(BswInternalBehavior newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, M2Package.BSW_EVENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(BswInternalBehavior newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != M2Package.BSW_EVENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, M2Package.BSW_INTERNAL_BEHAVIOR__EVENT, BswInternalBehavior.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M2Package.BSW_EVENT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.BSW_EVENT__STARTS_ON_EVENT:
				if (startsOnEvent != null)
					msgs = ((InternalEObject)startsOnEvent).eInverseRemove(this, M2Package.BSW_SCHEDULABLE_ENTITY__EVENT, BswSchedulableEntity.class, msgs);
				return basicSetStartsOnEvent((BswSchedulableEntity)otherEnd, msgs);
			case M2Package.BSW_EVENT__CONFIG:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConfig()).basicAdd(otherEnd, msgs);
			case M2Package.BSW_EVENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((BswInternalBehavior)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M2Package.BSW_EVENT__STARTS_ON_EVENT:
				return basicSetStartsOnEvent(null, msgs);
			case M2Package.BSW_EVENT__CONFIG:
				return ((InternalEList<?>)getConfig()).basicRemove(otherEnd, msgs);
			case M2Package.BSW_EVENT__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case M2Package.BSW_EVENT__PARENT:
				return eInternalContainer().eInverseRemove(this, M2Package.BSW_INTERNAL_BEHAVIOR__EVENT, BswInternalBehavior.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M2Package.BSW_EVENT__STARTS_ON_EVENT:
				if (resolve) return getStartsOnEvent();
				return basicGetStartsOnEvent();
			case M2Package.BSW_EVENT__CONFIG:
				return getConfig();
			case M2Package.BSW_EVENT__PARENT:
				return getParent();
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
			case M2Package.BSW_EVENT__STARTS_ON_EVENT:
				setStartsOnEvent((BswSchedulableEntity)newValue);
				return;
			case M2Package.BSW_EVENT__CONFIG:
				getConfig().clear();
				getConfig().addAll((Collection<? extends RteBswEventToTaskMapping>)newValue);
				return;
			case M2Package.BSW_EVENT__PARENT:
				setParent((BswInternalBehavior)newValue);
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
			case M2Package.BSW_EVENT__STARTS_ON_EVENT:
				setStartsOnEvent((BswSchedulableEntity)null);
				return;
			case M2Package.BSW_EVENT__CONFIG:
				getConfig().clear();
				return;
			case M2Package.BSW_EVENT__PARENT:
				setParent((BswInternalBehavior)null);
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
			case M2Package.BSW_EVENT__STARTS_ON_EVENT:
				return startsOnEvent != null;
			case M2Package.BSW_EVENT__CONFIG:
				return config != null && !config.isEmpty();
			case M2Package.BSW_EVENT__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

} //BswEventImpl