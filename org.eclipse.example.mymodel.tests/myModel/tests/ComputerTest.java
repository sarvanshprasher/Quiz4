/**
 */
package myModel.tests;

import org.junit.Test;

import junit.framework.TestCase;
import junit.textui.TestRunner;




/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Computer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComputerTest {

	
	/**
	 * The fixture for this Computer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Computer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ComputerTest.class);
	}

	/**
	 * Constructs a new Computer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Computer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Computer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Computer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Computer getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */

	
	@Test
	public void testComputerMemoryPreference() {
		
		Computer computer = MyModelFactory.eInstance.createComputer();
		
		Memory memory = MyModelFactory.eInstance.createMemory();
		
		computer.getMemories().add(memory);
		
		assertEquals(computer.getMemories().get(0),memory);
		
		
	}
	
	@Test
	public void testComputerCpuPreference() {
		
		Computer computer = MyModelFactory.eInstance.createComputer();
		
		CPU cpu = MyModelFactory.eInstance.createCPU();
		
		computer.setCpu(cpu);
		
		assertEquals(computer.getCpu,cpu);
		
		
	}


} //ComputerTest
