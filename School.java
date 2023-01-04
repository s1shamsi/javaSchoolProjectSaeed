import java.io.Serializable;

//package objchain;
//import java.util.Scanner;
public class School implements Serializable {

	private String nameOfSchool;
	private  String locationOfSchool;
	//Department Dep = new Department();
	
	public void setName(String name) {
	this.nameOfSchool = name;
	}
	public String getName() {
		
		return nameOfSchool;
		}
	
	public void setLocation(String ls) {
	this.locationOfSchool = ls;
	}
	public String getLocation() {
	
		return locationOfSchool;
		}
}
