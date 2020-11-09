/*
Name: Willi Blanco
Course ID: CS 320 Q5397

Descriptions: We are going to test all of the methods in the class Allergey. 
*/

package  main.java.medical.com.medicalApplication.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class AllergeyTest {
	
	private Allergey clazz;
	
	@Before
	
	public void before() {
		this.clazz = new Allergey ("Nut Allergy");
	}

	@Test
	public void testsetName() {
		assertTrue(clazz.getName().equals("Nut Allergy"));
		
	}
}
