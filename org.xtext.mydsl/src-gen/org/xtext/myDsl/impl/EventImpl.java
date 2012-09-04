/**
 */
package org.xtext.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.myDsl.Event;
import org.xtext.myDsl.MyDslPackage;
import org.xtext.myDsl.Outparam;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.myDsl.impl.EventImpl#getOuts <em>Outs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends ItemImpl implements Event
{
  /**
   * The cached value of the '{@link #getOuts() <em>Outs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOuts()
   * @generated
   * @ordered
   */
  protected Outparam outs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Outparam getOuts()
  {
    return outs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOuts(Outparam newOuts, NotificationChain msgs)
  {
    Outparam oldOuts = outs;
    outs = newOuts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.EVENT__OUTS, oldOuts, newOuts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOuts(Outparam newOuts)
  {
    if (newOuts != outs)
    {
      NotificationChain msgs = null;
      if (outs != null)
        msgs = ((InternalEObject)outs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EVENT__OUTS, null, msgs);
      if (newOuts != null)
        msgs = ((InternalEObject)newOuts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.EVENT__OUTS, null, msgs);
      msgs = basicSetOuts(newOuts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EVENT__OUTS, newOuts, newOuts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.EVENT__OUTS:
        return basicSetOuts(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.EVENT__OUTS:
        return getOuts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.EVENT__OUTS:
        setOuts((Outparam)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.EVENT__OUTS:
        setOuts((Outparam)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.EVENT__OUTS:
        return outs != null;
    }
    return super.eIsSet(featureID);
  }

} //EventImpl
