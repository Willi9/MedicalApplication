/*
Name: Willi Blanco
Course ID: CS 320 Q5397

Descriptions: Every method that is used in the class PatientHistory class we'll be tested in this test.
*/
package main.java.medical.com.medicalApplication.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Before;

public class PatientHistoryTest {
	
	private PatientHistory pHistory;
	private List <Treatment> treatments;
	private List <Medication> medication;
	private List<Allergey> allergy;
	
	
	@Before
	public void before() {
		this.pHistory = new PatientHistory();
		this.allergy = new ArrayList<Allergey> ();
		allergy.add(new Allergey("dogs"));
		
		this.treatments = new ArrayList<Treatment>();
		treatments.add(new Treatment("2-2-2020","Trypophobia","Fear of holes"));
		
		this.medication = new ArrayList<Medication>();
		medication.add(new Medication("water","2-2-2020","12-12-2020","1 cup"));
	}
	
	@Test
	public void testGetAllergies() {
		assertTrue(pHistory.getAlergies().equals(allergy));
	}
	
	@Test 
	public void testGetAllTreatments() {
		assertTrue(pHistory.getAllTreatments().equals(treatments));
	}
	
	@Test
	public void testGetAllMedications() {
		assertTrue(pHistory.getAllMedications().equals(medication));
	}

}
