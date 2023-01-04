//package objchain;

import java.io.Serializable;
import java.util.Scanner;

public class Mark implements Serializable {

	
	private int theMark;
	//private String gOfMark;
	int mark;
	transient Scanner Sc = new Scanner(System.in);
	 public void setTheMark(int mark) { // set the mark
	this.theMark = mark;
	/*System.out.println("Enter Teacher name");
	name = Sc.nextLine();*/
	}
		public int getTheMark() { //save the mark in memory
			 
				return theMark;
				}
}
	


