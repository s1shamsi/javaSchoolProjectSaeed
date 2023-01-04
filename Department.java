//package objchain;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
public class Department implements Serializable {
	
	Department (String depID)
	{
System.out.println("Dep ID= " + depID );
	}
	
	String nameOfDepatment;
	
	ArrayList<Teacher> arr2 = new ArrayList<Teacher>();
	int numOfFloors;
	Teacher Tec = new Teacher();
	transient Scanner Sc = new Scanner(System.in);
	 public void setNameOfDepatment(String name) {
	this.nameOfDepatment = name;
	/*System.out.println("Enter department name");
	 name = Sc.nextLine();*/
	}
	
	 public void setNumOfFloors(int Number) {
			this.numOfFloors = Number;
			/*System.out.println("enter Floor Number");
			 Number = Sc.nextInt();*/
			}	
	 public String getNameOfDepatment() {
	
		
		return nameOfDepatment ;
		}
		 
		 
	 public int getNumOfFloors() {

	return numOfFloors;
	}
	
	}

