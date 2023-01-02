

import java.util.Scanner;

//import firstTask.Mark;

public class Course {

	Mark markCourse = new Mark();
	
	private String nameOfCourse;
	private String IdOfCourse;
	Scanner Sc = new Scanner(System.in);
	 public void setNameOfCourse(String name) { // set the name of course 
	this.nameOfCourse = name;
	/*System.out.println("Enter Teacher name");
	name = Sc.nextLine();*/
	}
		public String getNameOfCourse() {   //save the course and print it when needed
			 
				return nameOfCourse;
				}
		 public void setIdOfCourse(String id) {
				this.IdOfCourse = id;
				/*System.out.println("Enter ID Of Teacher");
			    Id = Sc.nextInt();*/
				}
	 public String getIdOfCourse() {
	
	return IdOfCourse;
	}
	

}
