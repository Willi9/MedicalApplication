/*
Name: Willi Blanco
Course ID: CS 320 Q5397

Descriptions: Here we are testing all the methods that are used in the Medical Record class.
*/

package main.java.medical.com.medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;

public class MedicalRecordTest {
	
	private MedicalRecord clazz;
	private Patient patient = new Patient("Willi Test", "1");
	private PatientHistory history = new PatientHistory();
	
	@Before
	public void before() {
		this.clazz = new MedicalRecord(patient);
		this.history = new PatientHistory();

	}
	

	@Test
	public void testGetPatient() {
		assertTrue(clazz.getPatient().equals(patient));
	}
	
	public void testGetPatientHistory() {
		assertTrue(clazz.getHistory().equals(history));
	}

}
