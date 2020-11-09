/*
Name: Willi Blanco
Course ID: CS 320 Q5397

Descriptions: Every model test will get tested in this test suite.
*/
package main.java.medical.com.medicalApplication.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AllergeyTest.class, DoctorTest.class, EmployeeTest.class, MedicalRecordTest.class, MedicationTest.class,
		PatientHistoryTest.class, PatientTest.class, TreatmentTest.class })
public class AllModelTests {

}
