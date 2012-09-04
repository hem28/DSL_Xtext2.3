/**
 */
package org.xtext.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.myDsl.Inparam;
import org.xtext.myDsl.MyDslPackage;
import org.xtext.myDsl.Operation;
import org.xtext.myDsl.Outparam;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.myDsl.impl.OperationImpl#getIns <em>Ins</em>}</li>
 *   <li>{@link org.xtext.myDsl.impl.OperationImpl#getOuts <em>Outs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends ItemImpl implements Operation
{
  /**
   * The cached value of the '{@link #getIns() <em>Ins</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIns()
   * @generated
   * @ordered
   */
  protected EList<Inparam> ins;

  /**
   * The cached value of the '{@link #getOuts() <em>Outs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOuts()
   * @generated
   * @ordered
   */
  protected EList<Outparam> outs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationImpl()
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
    return MyDslPackage.Literals.OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Inparam> getIns()
  {
    if (ins == null)
    {
      ins = new EObjectContainmentEList<Inparam>(Inparam.class, this, MyDslPackage.OPERATION__INS);
    }
    return ins;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Outparam> getOuts()
  {
    if (outs == null)
    {
      outs = new EObjectContainmentEList<Outparam>(Outparam.class, this, MyDslPackage.OPERATION__OUTS);
    }
    return outs;
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
      case MyDslPackage.OPERATION__INS:
        return ((InternalEList<?>)getIns()).basicRemove(otherEnd, msgs);
      case MyDslPackage.OPERATION__OUTS:
        return ((InternalEList<?>)getOuts()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.OPERATION__INS:
        return getIns();
      case MyDslPackage.OPERATION__OUTS:
        return getOuts();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.OPERATION__INS:
        getIns().clear();
        getIns().addAll((Collection<? extends Inparam>)newValue);
        return;
      case MyDslPackage.OPERATION__OUTS:
        getOuts().clear();
        getOuts().addAll((Collection<? extends Outparam>)newValue);
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
      case MyDslPackage.OPERATION__INS:
        getIns().clear();
        return;
      case MyDslPackage.OPERATION__OUTS:
        getOuts().clear();
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
      case MyDslPackage.OPERATION__INS:
        return ins != null && !ins.isEmpty();
      case MyDslPackage.OPERATION__OUTS:
        return outs != null && !outs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OperationImpl
