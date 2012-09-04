/**
 */
package org.xtext.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inparam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.myDsl.Inparam#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.myDsl.Inparam#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.myDsl.MyDslPackage#getInparam()
 * @model
 * @generated
 */
public interface Inparam extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.myDsl.MyDslPackage#getInparam_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.myDsl.Inparam#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.myDsl.BuiltinType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.xtext.myDsl.BuiltinType
   * @see #setType(BuiltinType)
   * @see org.xtext.myDsl.MyDslPackage#getInparam_Type()
   * @model
   * @generated
   */
  BuiltinType getType();

  /**
   * Sets the value of the '{@link org.xtext.myDsl.Inparam#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.xtext.myDsl.BuiltinType
   * @see #getType()
   * @generated
   */
  void setType(BuiltinType value);

} // Inparam
