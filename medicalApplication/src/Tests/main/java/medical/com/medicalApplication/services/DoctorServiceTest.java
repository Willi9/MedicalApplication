/*
Name: Willi Blanco
Course ID: CS 320 Q5397

Descriptions: We will test every method used in the DoctorService class. These test are more complex due to being service tests.
*/
package main.java.medical.com.medicalApplication.services;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.medical.com.medicalApplication.model.Doctor;

import org.junit.Before;

import java.util.List;

public class DoctorServiceTest {
	
	private List<Doctor> doctor;
	
	@Before
	public void setUp() throws Exception {
		DoctorService.getReference().addDoctor("Willi Blanco1", "1");
		this.doctor = DoctorService.getReference().getAllDoctors();
		

	}

	@Test
	public void testAddDoctor() {
		assertTrue(DoctorService.getReference().addDoctor("Kevin D", "9"));
		assertTrue(DoctorService.getReference().addDoctor("Haylee", "10"));
	}
	
	@Test
	public void testGetAllDoctors() {
		assertTrue(DoctorService.getReference().getAllDoctors().equals(doctor));
	}
	
}
 