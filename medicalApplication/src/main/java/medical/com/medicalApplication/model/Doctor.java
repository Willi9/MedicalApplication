package main.java.medical.com.medicalApplication.model;
/**
 * 
 * This class represents the Doctor data model in the system
 *
 */
public class Doctor {
	private String name;
	private String id;
	
	public Doctor(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Doctor Name:"+ name + " ID: "+id;
	}	
}
