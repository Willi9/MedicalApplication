/*
Name: Willi Blanco
Course ID: CS 320 Q5397

Descriptions: Here we are testing all of the methods in the MedicationTest class.
*/
package main.java.medical.com.medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class MedicationTest {
	private Medication clazz;
	
	@Before
	public void before() {
		this.clazz = new Medication("Medicine","1-1-2020","12-12-2020","10 ml");
	}

	@Test
	public void testSetName() {
		assertTrue(clazz.getName().equals("Medicine"));
	}
	
	@Test
	public void testSetStartDate() {
		assertTrue(clazz.getStartDate().contentEquals("1-1-2020"));
	}
	
	@Test
	public void testSetEndDate() {
		assertTrue(clazz.getEndDate().equals("12-12-2020"));
	}
	
	@Test 
	public void testDose() {
		assertTrue(clazz.getDose().equals("10 ml"));
	}
}
