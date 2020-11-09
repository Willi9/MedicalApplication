/*
Name: Willi Blanco
Course ID: CS 320 Q5397

Descriptions: This is the Test Suite to test all of the Services at the same time.
*/

package main.java.medical.com.medicalApplication.services;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DoctorServiceTest.class, MedicalRescordServiceTest.class })
public class ServicesTest {

}

