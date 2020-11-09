/*
Name: Willi Blanco
Course ID: CS 320 Q5397

Descriptions: All of the methods in the class Treatment will be tested in this test
*/

package main.java.medical.com.medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class TreatmentTest {
	
	private Treatment clazz;
	
	@Before
	public void before() {
		this.clazz = new Treatment("1-1-2020","Trypophobia","Fear of holes");
	}
	
	
	@Test
	public void testGetTreatmentDate() {
		assertTrue(clazz.getTreatmentDate().contentEquals("1-1-2020"));
	}
	
	@Test
	public void testGetDiagnose() {
		assertTrue(clazz.getDiagnose().equals("Trypophobia"));
	}
	
	@Test
	public void testGetDescription() {
		assertTrue(clazz.getDescription().contentEquals("Fear of holes"));
	}

}
