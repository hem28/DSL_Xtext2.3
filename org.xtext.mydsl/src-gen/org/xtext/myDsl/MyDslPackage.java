/**
 */
package org.xtext.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.myDsl.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.myDsl.impl.InterfaceImpl
   * @see org.xtext.myDsl.impl.MyDslPackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAME = 0;

  /**
   * The feature id for the '<em><b>Ns URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NS_URI = 1;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__ITEMS = 2;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.myDsl.impl.ItemImpl <em>Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.myDsl.impl.ItemImpl
   * @see org.xtext.myDsl.impl.MyDslPackageImpl#getItem()
   * @generated
   */
  int ITEM = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__NAME = 0;

  /**
   * The number of structural features of the '<em>Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.myDsl.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.myDsl.impl.OperationImpl
   * @see org.xtext.myDsl.impl.MyDslPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = ITEM__NAME;

  /**
   * The feature id for the '<em><b>Ins</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__INS = ITEM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Outs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OUTS = ITEM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = ITEM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.myDsl.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.myDsl.impl.EventImpl
   * @see org.xtext.myDsl.impl.MyDslPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = ITEM__NAME;

  /**
   * The feature id for the '<em><b>Outs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__OUTS = ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.myDsl.impl.InparamImpl <em>Inparam</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.myDsl.impl.InparamImpl
   * @see org.xtext.myDsl.impl.MyDslPackageImpl#getInparam()
   * @generated
   */
  int INPARAM = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPARAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPARAM__TYPE = 1;

  /**
   * The number of structural features of the '<em>Inparam</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.myDsl.impl.OutparamImpl <em>Outparam</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.myDsl.impl.OutparamImpl
   * @see org.xtext.myDsl.impl.MyDslPackageImpl#getOutparam()
   * @generated
   */
  int OUTPARAM = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPARAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPARAM__TYPE = 1;

  /**
   * The number of structural features of the '<em>Outparam</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPARAM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.myDsl.BuiltinType <em>Builtin Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.myDsl.BuiltinType
   * @see org.xtext.myDsl.impl.MyDslPackageImpl#getBuiltinType()
   * @generated
   */
  int BUILTIN_TYPE = 6;


  /**
   * Returns the meta object for class '{@link org.xtext.myDsl.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see org.xtext.myDsl.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.myDsl.Interface#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.myDsl.Interface#getName()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.myDsl.Interface#getNsURI <em>Ns URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ns URI</em>'.
   * @see org.xtext.myDsl.Interface#getNsURI()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_NsURI();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.myDsl.Interface#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.xtext.myDsl.Interface#getItems()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Items();

  /**
   * Returns the meta object for class '{@link org.xtext.myDsl.Item <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item</em>'.
   * @see org.xtext.myDsl.Item
   * @generated
   */
  EClass getItem();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.myDsl.Item#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.myDsl.Item#getName()
   * @see #getItem()
   * @generated
   */
  EAttribute getItem_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.myDsl.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see org.xtext.myDsl.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.myDsl.Operation#getIns <em>Ins</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ins</em>'.
   * @see org.xtext.myDsl.Operation#getIns()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Ins();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.myDsl.Operation#getOuts <em>Outs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outs</em>'.
   * @see org.xtext.myDsl.Operation#getOuts()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Outs();

  /**
   * Returns the meta object for class '{@link org.xtext.myDsl.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.xtext.myDsl.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.myDsl.Event#getOuts <em>Outs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Outs</em>'.
   * @see org.xtext.myDsl.Event#getOuts()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Outs();

  /**
   * Returns the meta object for class '{@link org.xtext.myDsl.Inparam <em>Inparam</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inparam</em>'.
   * @see org.xtext.myDsl.Inparam
   * @generated
   */
  EClass getInparam();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.myDsl.Inparam#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.myDsl.Inparam#getName()
   * @see #getInparam()
   * @generated
   */
  EAttribute getInparam_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.myDsl.Inparam#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.myDsl.Inparam#getType()
   * @see #getInparam()
   * @generated
   */
  EAttribute getInparam_Type();

  /**
   * Returns the meta object for class '{@link org.xtext.myDsl.Outparam <em>Outparam</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Outparam</em>'.
   * @see org.xtext.myDsl.Outparam
   * @generated
   */
  EClass getOutparam();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.myDsl.Outparam#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.myDsl.Outparam#getName()
   * @see #getOutparam()
   * @generated
   */
  EAttribute getOutparam_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.myDsl.Outparam#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.xtext.myDsl.Outparam#getType()
   * @see #getOutparam()
   * @generated
   */
  EAttribute getOutparam_Type();

  /**
   * Returns the meta object for enum '{@link org.xtext.myDsl.BuiltinType <em>Builtin Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Builtin Type</em>'.
   * @see org.xtext.myDsl.BuiltinType
   * @generated
   */
  EEnum getBuiltinType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.myDsl.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.myDsl.impl.InterfaceImpl
     * @see org.xtext.myDsl.impl.MyDslPackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

    /**
     * The meta object literal for the '<em><b>Ns URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__NS_URI = eINSTANCE.getInterface_NsURI();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__ITEMS = eINSTANCE.getInterface_Items();

    /**
     * The meta object literal for the '{@link org.xtext.myDsl.impl.ItemImpl <em>Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.myDsl.impl.ItemImpl
     * @see org.xtext.myDsl.impl.MyDslPackageImpl#getItem()
     * @generated
     */
    EClass ITEM = eINSTANCE.getItem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM__NAME = eINSTANCE.getItem_Name();

    /**
     * The meta object literal for the '{@link org.xtext.myDsl.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.myDsl.impl.OperationImpl
     * @see org.xtext.myDsl.impl.MyDslPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Ins</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__INS = eINSTANCE.getOperation_Ins();

    /**
     * The meta object literal for the '<em><b>Outs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__OUTS = eINSTANCE.getOperation_Outs();

    /**
     * The meta object literal for the '{@link org.xtext.myDsl.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.myDsl.impl.EventImpl
     * @see org.xtext.myDsl.impl.MyDslPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Outs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__OUTS = eINSTANCE.getEvent_Outs();

    /**
     * The meta object literal for the '{@link org.xtext.myDsl.impl.InparamImpl <em>Inparam</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.myDsl.impl.InparamImpl
     * @see org.xtext.myDsl.impl.MyDslPackageImpl#getInparam()
     * @generated
     */
    EClass INPARAM = eINSTANCE.getInparam();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPARAM__NAME = eINSTANCE.getInparam_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPARAM__TYPE = eINSTANCE.getInparam_Type();

    /**
     * The meta object literal for the '{@link org.xtext.myDsl.impl.OutparamImpl <em>Outparam</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.myDsl.impl.OutparamImpl
     * @see org.xtext.myDsl.impl.MyDslPackageImpl#getOutparam()
     * @generated
     */
    EClass OUTPARAM = eINSTANCE.getOutparam();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPARAM__NAME = eINSTANCE.getOutparam_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPARAM__TYPE = eINSTANCE.getOutparam_Type();

    /**
     * The meta object literal for the '{@link org.xtext.myDsl.BuiltinType <em>Builtin Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.myDsl.BuiltinType
     * @see org.xtext.myDsl.impl.MyDslPackageImpl#getBuiltinType()
     * @generated
     */
    EEnum BUILTIN_TYPE = eINSTANCE.getBuiltinType();

  }

} //MyDslPackage
