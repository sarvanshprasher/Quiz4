/**
 */
package myModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link myModel.Computer#getBrand <em>Brand</em>}</li>
 *   <li>{@link myModel.Computer#getCpu <em>Cpu</em>}</li>
 *   <li>{@link myModel.Computer#getMemories <em>Memories</em>}</li>
 * </ul>
 *
 * @see myModel.MyModelPackage#getComputer()
 * @model
 * @generated
 */
public interface Computer extends EObject {
	/**
	 * Returns the value of the '<em><b>Brand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brand</em>' attribute.
	 * @see #setBrand(String)
	 * @see myModel.MyModelPackage#getComputer_Brand()
	 * @model
	 * @generated
	 */
	String getBrand();

	/**
	 * Sets the value of the '{@link myModel.Computer#getBrand <em>Brand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brand</em>' attribute.
	 * @see #getBrand()
	 * @generated
	 */
	void setBrand(String value);

	/**
	 * Returns the value of the '<em><b>Cpu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu</em>' containment reference.
	 * @see #setCpu(CPU)
	 * @see myModel.MyModelPackage#getComputer_Cpu()
	 * @model containment="true"
	 * @generated
	 */
	CPU getCpu();

	/**
	 * Sets the value of the '{@link myModel.Computer#getCpu <em>Cpu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu</em>' containment reference.
	 * @see #getCpu()
	 * @generated
	 */
	void setCpu(CPU value);

	/**
	 * Returns the value of the '<em><b>Memories</b></em>' containment reference list.
	 * The list contents are of type {@link myModel.Memory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memories</em>' containment reference list.
	 * @see myModel.MyModelPackage#getComputer_Memories()
	 * @model containment="true" required="true" upper="4"
	 * @generated
	 */
	EList<Memory> getMemories();

} // Computer
