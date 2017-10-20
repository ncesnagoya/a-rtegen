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
/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucPartition;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.OsIocCommunication;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.ImplementationDataType;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxy;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.ComSendProxyInteraction;
import jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.InteractionPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Com Send Proxy Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendProxyInteractionImpl#getRequesterPartition <em>Requester Partition</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendProxyInteractionImpl#getSignalDataType <em>Signal Data Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendProxyInteractionImpl#getOsIocCommunication <em>Os Ioc Communication</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendProxyInteractionImpl#getOsIocCommunicationForComplexValue <em>Os Ioc Communication For Complex Value</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.interaction.impl.ComSendProxyInteractionImpl#getProxy <em>Proxy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComSendProxyInteractionImpl extends InteractionImpl implements ComSendProxyInteraction {
	/**
	 * The cached value of the '{@link #getRequesterPartition() <em>Requester Partition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequesterPartition()
	 * @generated
	 * @ordered
	 */
	protected EcucPartition requesterPartition;

	/**
	 * The cached value of the '{@link #getSignalDataType() <em>Signal Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalDataType()
	 * @generated
	 * @ordered
	 */
	protected ImplementationDataType signalDataType;

	/**
	 * The cached value of the '{@link #getOsIocCommunication() <em>Os Ioc Communication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsIocCommunication()
	 * @generated
	 * @ordered
	 */
	protected OsIocCommunication osIocCommunication;

	/**
	 * The cached value of the '{@link #getOsIocCommunicationForComplexValue() <em>Os Ioc Communication For Complex Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsIocCommunicationForComplexValue()
	 * @generated
	 * @ordered
	 */
	protected OsIocCommunication osIocCommunicationForComplexValue;

	/**
	 * The cached value of the '{@link #getProxy() <em>Proxy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxy()
	 * @generated
	 * @ordered
	 */
	protected ComSendProxy proxy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComSendProxyInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.COM_SEND_PROXY_INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucPartition getRequesterPartition() {
		if (requesterPartition != null && ((EObject)requesterPartition).eIsProxy()) {
			InternalEObject oldRequesterPartition = (InternalEObject)requesterPartition;
			requesterPartition = (EcucPartition)eResolveProxy(oldRequesterPartition);
			if (requesterPartition != oldRequesterPartition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION, oldRequesterPartition, requesterPartition));
			}
		}
		return requesterPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcucPartition basicGetRequesterPartition() {
		return requesterPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequesterPartition(EcucPartition newRequesterPartition) {
		EcucPartition oldRequesterPartition = requesterPartition;
		requesterPartition = newRequesterPartition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION, oldRequesterPartition, requesterPartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataType getSignalDataType() {
		if (signalDataType != null && ((EObject)signalDataType).eIsProxy()) {
			InternalEObject oldSignalDataType = (InternalEObject)signalDataType;
			signalDataType = (ImplementationDataType)eResolveProxy(oldSignalDataType);
			if (signalDataType != oldSignalDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE, oldSignalDataType, signalDataType));
			}
		}
		return signalDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDataType basicGetSignalDataType() {
		return signalDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignalDataType(ImplementationDataType newSignalDataType) {
		ImplementationDataType oldSignalDataType = signalDataType;
		signalDataType = newSignalDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE, oldSignalDataType, signalDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIocCommunication getOsIocCommunication() {
		if (osIocCommunication != null && ((EObject)osIocCommunication).eIsProxy()) {
			InternalEObject oldOsIocCommunication = (InternalEObject)osIocCommunication;
			osIocCommunication = (OsIocCommunication)eResolveProxy(oldOsIocCommunication);
			if (osIocCommunication != oldOsIocCommunication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.COM_SEND_PROXY_INTERACTION__OS_IOC_COMMUNICATION, oldOsIocCommunication, osIocCommunication));
			}
		}
		return osIocCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIocCommunication basicGetOsIocCommunication() {
		return osIocCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsIocCommunication(OsIocCommunication newOsIocCommunication) {
		OsIocCommunication oldOsIocCommunication = osIocCommunication;
		osIocCommunication = newOsIocCommunication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.COM_SEND_PROXY_INTERACTION__OS_IOC_COMMUNICATION, oldOsIocCommunication, osIocCommunication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIocCommunication getOsIocCommunicationForComplexValue() {
		if (osIocCommunicationForComplexValue != null && ((EObject)osIocCommunicationForComplexValue).eIsProxy()) {
			InternalEObject oldOsIocCommunicationForComplexValue = (InternalEObject)osIocCommunicationForComplexValue;
			osIocCommunicationForComplexValue = (OsIocCommunication)eResolveProxy(oldOsIocCommunicationForComplexValue);
			if (osIocCommunicationForComplexValue != oldOsIocCommunicationForComplexValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.COM_SEND_PROXY_INTERACTION__OS_IOC_COMMUNICATION_FOR_COMPLEX_VALUE, oldOsIocCommunicationForComplexValue, osIocCommunicationForComplexValue));
			}
		}
		return osIocCommunicationForComplexValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsIocCommunication basicGetOsIocCommunicationForComplexValue() {
		return osIocCommunicationForComplexValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsIocCommunicationForComplexValue(OsIocCommunication newOsIocCommunicationForComplexValue) {
		OsIocCommunication oldOsIocCommunicationForComplexValue = osIocCommunicationForComplexValue;
		osIocCommunicationForComplexValue = newOsIocCommunicationForComplexValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.COM_SEND_PROXY_INTERACTION__OS_IOC_COMMUNICATION_FOR_COMPLEX_VALUE, oldOsIocCommunicationForComplexValue, osIocCommunicationForComplexValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendProxy getProxy() {
		if (proxy != null && ((EObject)proxy).eIsProxy()) {
			InternalEObject oldProxy = (InternalEObject)proxy;
			proxy = (ComSendProxy)eResolveProxy(oldProxy);
			if (proxy != oldProxy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.COM_SEND_PROXY_INTERACTION__PROXY, oldProxy, proxy));
			}
		}
		return proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComSendProxy basicGetProxy() {
		return proxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProxy(ComSendProxy newProxy, NotificationChain msgs) {
		ComSendProxy oldProxy = proxy;
		proxy = newProxy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionPackage.COM_SEND_PROXY_INTERACTION__PROXY, oldProxy, newProxy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxy(ComSendProxy newProxy) {
		if (newProxy != proxy) {
			NotificationChain msgs = null;
			if (proxy != null)
				msgs = ((InternalEObject)proxy).eInverseRemove(this, InteractionPackage.COM_SEND_PROXY__INTERACTION, ComSendProxy.class, msgs);
			if (newProxy != null)
				msgs = ((InternalEObject)newProxy).eInverseAdd(this, InteractionPackage.COM_SEND_PROXY__INTERACTION, ComSendProxy.class, msgs);
			msgs = basicSetProxy(newProxy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.COM_SEND_PROXY_INTERACTION__PROXY, newProxy, newProxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__PROXY:
				if (proxy != null)
					msgs = ((InternalEObject)proxy).eInverseRemove(this, InteractionPackage.COM_SEND_PROXY__INTERACTION, ComSendProxy.class, msgs);
				return basicSetProxy((ComSendProxy)otherEnd, msgs);
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
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__PROXY:
				return basicSetProxy(null, msgs);
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
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION:
				if (resolve) return getRequesterPartition();
				return basicGetRequesterPartition();
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE:
				if (resolve) return getSignalDataType();
				return basicGetSignalDataType();
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__OS_IOC_COMMUNICATION:
				if (resolve) return getOsIocCommunication();
				return basicGetOsIocCommunication();
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__OS_IOC_COMMUNICATION_FOR_COMPLEX_VALUE:
				if (resolve) return getOsIocCommunicationForComplexValue();
				return basicGetOsIocCommunicationForComplexValue();
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__PROXY:
				if (resolve) return getProxy();
				return basicGetProxy();
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
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION:
				setRequesterPartition((EcucPartition)newValue);
				return;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE:
				setSignalDataType((ImplementationDataType)newValue);
				return;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__OS_IOC_COMMUNICATION:
				setOsIocCommunication((OsIocCommunication)newValue);
				return;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__OS_IOC_COMMUNICATION_FOR_COMPLEX_VALUE:
				setOsIocCommunicationForComplexValue((OsIocCommunication)newValue);
				return;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__PROXY:
				setProxy((ComSendProxy)newValue);
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
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION:
				setRequesterPartition((EcucPartition)null);
				return;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE:
				setSignalDataType((ImplementationDataType)null);
				return;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__OS_IOC_COMMUNICATION:
				setOsIocCommunication((OsIocCommunication)null);
				return;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__OS_IOC_COMMUNICATION_FOR_COMPLEX_VALUE:
				setOsIocCommunicationForComplexValue((OsIocCommunication)null);
				return;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__PROXY:
				setProxy((ComSendProxy)null);
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
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__REQUESTER_PARTITION:
				return requesterPartition != null;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__SIGNAL_DATA_TYPE:
				return signalDataType != null;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__OS_IOC_COMMUNICATION:
				return osIocCommunication != null;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__OS_IOC_COMMUNICATION_FOR_COMPLEX_VALUE:
				return osIocCommunicationForComplexValue != null;
			case InteractionPackage.COM_SEND_PROXY_INTERACTION__PROXY:
				return proxy != null;
		}
		return super.eIsSet(featureID);
	}

} //ComSendProxyInteractionImpl
