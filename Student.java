package objchain;

import java.util.ArrayList;
import java.util.Scanner;

import objchain.Course;

public class Student {

	Course course1 = new Course();
	ArrayList<Course> coList = new ArrayList<Course>(); //array list for course class 
	private String nameOfStudent;
	private int IdOfStudent;
	Scanner Sc = new Scanner(System.in);
	 public void setNameOfStudent(String name) { //set the name of student 
	this.nameOfStudent = name;
	/*System.out.println("Enter Teacher name");
	name = Sc.nextLine();*/
	}
		public String getNameOfStudent() {  //save student name in memory and print when it is needed
			 
				return nameOfStudent;
				}
		 public void setIdOfStudent(int Id) { //set student id 
				this.IdOfStudent = Id;
				/*System.out.println("Enter ID Of Teacher");
			    Id = Sc.nextInt();*/
				}
	 public int getIdOfStudent() { // save student id and print when it is needed
	
	return IdOfStudent;
	}
	
}
