package objchain;
import java.util.ArrayList;
import java.util.Scanner;
//import objchain.Student;

public class Teacher {

	Student student1 = new Student();
	ArrayList<Student> studentList = new ArrayList<Student>(); ///Student array list
	
	private String nameOfTeacher;
	private int IdOfTeacher;
	Scanner Sc = new Scanner(System.in);
	 public void setNameOfTeacher(String name) {
	this.nameOfTeacher = name;
	/*System.out.println("Enter Teacher name");
	name = Sc.nextLine();*/
	}
		public String getNameOfTeacher() {
			 
				return nameOfTeacher;
				}
		 public void setIdOfTeacher(int Id) {
				this.IdOfTeacher = Id;
				/*System.out.println("Enter ID Of Teacher");
			    Id = Sc.nextInt();*/
				}
	 public int getIdOfTeacher() {
	
	return IdOfTeacher;
	}
	

}
