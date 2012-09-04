/**
 */
package org.xtext.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.myDsl.Operation#getIns <em>Ins</em>}</li>
 *   <li>{@link org.xtext.myDsl.Operation#getOuts <em>Outs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.myDsl.MyDslPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends Item
{
  /**
   * Returns the value of the '<em><b>Ins</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.myDsl.Inparam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ins</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ins</em>' containment reference list.
   * @see org.xtext.myDsl.MyDslPackage#getOperation_Ins()
   * @model containment="true"
   * @generated
   */
  EList<Inparam> getIns();

  /**
   * Returns the value of the '<em><b>Outs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.myDsl.Outparam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outs</em>' containment reference list.
   * @see org.xtext.myDsl.MyDslPackage#getOperation_Outs()
   * @model containment="true"
   * @generated
   */
  EList<Outparam> getOuts();

} // Operation
