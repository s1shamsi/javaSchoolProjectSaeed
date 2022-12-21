package objchain;

import java.util.ArrayList;
import java.util.Scanner;

import objchain.Course;

public class Student {

	Course course1 = new Course();
	ArrayList<Course> coList = new ArrayList<Course>();
	private String nameOfStudent;
	private int IdOfStudent;
	Scanner Sc = new Scanner(System.in);
	 public void setNameOfStudent(String name) {
	this.nameOfStudent = name;
	/*System.out.println("Enter Teacher name");
	name = Sc.nextLine();*/
	}
		public String getNameOfStudent() {
			 
				return nameOfStudent;
				}
		 public void setIdOfStudent(int Id) {
				this.IdOfStudent = Id;
				/*System.out.println("Enter ID Of Teacher");
			    Id = Sc.nextInt();*/
				}
	 public int getIdOfStudent() {
	
	return IdOfStudent;
	}
	
}
