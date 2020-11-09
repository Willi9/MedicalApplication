/*
Name: Willi Blanco
Course ID: CS 320 Q5397

Descriptions: Every method in the class PatientTest will be tested in this test.
*/
package main.java.medical.com.medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class PatientTest {
	private Patient clazz;
	
	@Before
	public void before (){
		this.clazz = new Patient("Willi Blanco","9");
	} 

	@Test
	public void testSetName() {
		assertTrue(clazz.getName().equals("Willi Blanco"));
	}
	
	@Test
	public void testSetId () {
		assertTrue(clazz.getId().equals("9"));
	}

}
