/*
Name: Willi Blanco
Course ID: CS 320 Q5397

Descriptions: Every method in the class MedicalRescordService will be tested in this test. 
*/

package main.java.medical.com.medicalApplication.services;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import main.java.medical.com.medicalApplication.model.MedicalRecord;
import main.java.medical.com.medicalApplication.model.Patient;

import org.junit.Before;

public class MedicalRescordServiceTest {
	
	private MedicalRecord medRec;
	private Patient patient;
	private List<Patient> patientList;
	
	
	@Before
	public void setUp() throws Exception {
		this.patientList = new ArrayList<Patient>();
		
		this.patient = new Patient("Willi Blanco", "1");
		this.patientList = MedicalRescordService.getReference().getAllPatients();
		this.medRec = new MedicalRecord(patient);
		
	}
	

	@Test
	public void testAddPatient() {
		assertTrue(MedicalRescordService.getReference().addPatient("Willi","2"));
		assertTrue(MedicalRescordService.getReference().addPatient("Kevin", "3"));
	}
	
	@Test 
	public void testGetPatient() {
		assertTrue(MedicalRescordService.getReference().getPatient("1").equals(patient));
	}
	
	@Test
	public void testGetMedicalRecord() {
		assertTrue(MedicalRescordService.getReference().getMedicalRecord("1").equals(medRec));
	}
	
	@Test 
	public void testGetAllPatients() {
		assertTrue(MedicalRescordService.getReference().getAllPatients().equals(patientList));
	}
	
	@Test
	public void testGetPatientwithAllergies() {
		assertTrue(MedicalRescordService.getReference().getPatientsWithAllergies("Soy").equals(patientList));
	}

}
