/*
Name: Willi Blanco
Course ID: CS 320 Q5397

Descriptions: We are testing every single method in the Doctor class
*/

package main.java.medical.com.medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class DoctorTest {
	
	private Doctor clazz;
	
	@Before
	public void before() {
		this.clazz = new Doctor ("Mario","1-1");
	}

	@Test
	public void testsetName() {
		assertTrue(clazz.getName().equals("Mario"));
		}
	
	@Test
	public void testsetId() {
		assertTrue(clazz.getId().equals("1-1"));
	}

}
