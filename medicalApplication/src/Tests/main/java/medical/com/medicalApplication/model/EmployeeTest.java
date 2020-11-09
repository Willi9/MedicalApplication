/*
Name: Willi Blanco
Course ID: CS 320 Q5397

Descriptions: We are testing all the methods of the class Employee
*/
package main.java.medical.com.medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class EmployeeTest {
	
	private Employee clazz;
	
	@Before
	public void before() {
		this.clazz = new Employee("Willi Blanco", "9");
		this.clazz.getPassword().equals("Tacos");
	}

	@Test
	public void testGetName() {
		assertTrue(clazz.getName().equals("Willi Blanco"));
	}
	
	@Test
	public void testGetId() {
		assertTrue(clazz.getId().equals("Tacos"));
	}
	
	@Test 
	public void testGetPassword() {
		assertTrue(clazz.getPassword().equals("Tacos"));
	}

}
