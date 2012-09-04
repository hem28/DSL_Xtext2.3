/**
 */
package org.xtext.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.myDsl.Event#getOuts <em>Outs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.myDsl.MyDslPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends Item
{
  /**
   * Returns the value of the '<em><b>Outs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outs</em>' containment reference.
   * @see #setOuts(Outparam)
   * @see org.xtext.myDsl.MyDslPackage#getEvent_Outs()
   * @model containment="true"
   * @generated
   */
  Outparam getOuts();

  /**
   * Sets the value of the '{@link org.xtext.myDsl.Event#getOuts <em>Outs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Outs</em>' containment reference.
   * @see #getOuts()
   * @generated
   */
  void setOuts(Outparam value);

} // Event
