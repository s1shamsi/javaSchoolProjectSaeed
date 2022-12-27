package objchain;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		boolean option = true ; //for loop 1
		boolean option2 = true ; //for loop 2
		boolean option3 = true ; //for loop 3
		boolean option4 = true ; //for loop 4
		
		ArrayList<Department> dep1 = new ArrayList<Department>(); //array list for department 
		Stack<String>  stack = new Stack<>();
		Scanner sc = new Scanner(System.in); //start a scanner to add things by user
		
		School school1 = new School();
		
		System.out.println("              Bismillah Al-rahman Al-rahim    ");
		System.out.println("\n");
		System.out.println("          welcome to S.CodeLine school system");
		System.out.println("           This system is just simple system");
		System.out.println("\n");
		System.out.println("\n");
		System.out.print("Please Enter School Name : ");
		String S1 = sc.nextLine();
		school1.setName(S1);
		stack.push(S1);
		System.out.print("Please Enter School Location : ");
		String S2 = sc.nextLine();
		school1.setLocation(S2);
		stack.push(S2);
		System.out.println("\n");
		
		
		
		while(option) {  //loop start with add department 
	
			Department dep = new Department("MUS1");
			System.out.print("Please Enter Department Name : ");
			String d1 = sc.next();
			dep.setNameOfDepatment(d1);
			stack.push(d1);
			System.out.print("Please Enter Department Floor : ");
			int d2 = sc.nextInt();
			dep.setNumOfFloors(d2);
			String d = Integer.toString(d2);
			stack.push(d);
			System.out.println("\n");
		
			while(option2) { //loop 1 in loop to add teacher
				
				Teacher t = new Teacher();
				System.out.print("Please Enter Teacher name : ");
				String t1 = sc.next();
				t.setNameOfTeacher(t1);
				stack.push(t1);
				System.out.print("Please Enter Teacher ID : ");
				int t2 = sc.nextInt();
				t.setIdOfTeacher(t2);
				String t3 = Integer.toString(t2);
				stack.push(t3);
				System.out.println("\n");
				
				while(option3) {                           //loop2 in loop 1 for add course
					
					Student st = new Student();
					System.out.print("Please Enter Student name : ");
					String st1 = sc.next();
					st.setNameOfStudent(st1);
					stack.push(st1);
					System.out.print("Please Enter Student ID : ");
					int st2 = sc.nextInt();
					st.setIdOfStudent(st2);
					
					String s = Integer.toString(st2);
					stack.push(s);
					t.studentList.add(st);
					System.out.println("\n");
					
				    while(option4) {                        //loop3 in loop 2 for add course 
					
					Course cr = new Course();
					System.out.print("Please Enter Course name : ");
					String c1 = sc.next();
					cr.setNameOfCourse(c1);
					stack.push(c1);
					System.out.print("Please Enter Course Id : ");
					String c2 = sc.next();
					cr.setIdOfCourse(c2);
					stack.push(c2);
					System.out.print("Please Enter Mark : ");
					int c3 = sc.nextInt();
					cr.markCourse.setTheMark(c3);
					String c = Integer.toString(c3);
					stack.push(c);
					st.coList.add(cr);
					
					System.out.print("Press 1 to add course, Press 2 if you dont want to add course "); //repeat or end the course loop
					if(sc.nextInt()!= 1) {
						option4 = false;
					}
					
					
				}
				    System.out.print("Press 1 to add student, Press 2 if you dont want to add student ");//repeat or end the student loop
					if(sc.nextInt()!= 1) {
						option3 = false;
					
					}
					option4 = true;
					
				        }
				
				dep.arr2.add(t);
				
				System.out.print("Press 1 to add Teacher, Press 2 if you dont want to add Teacher");//repeat or end the teacher loop
				option3 = true;
				if(sc.nextInt()!= 1) {
					option2 = false;
				
				}
			}
			dep1.add(dep);
			System.out.print("Please Enter 1 to add more departments 2 to print the report"); //repeat or end the department loop or print the report
			option2 = true;
			
			if(sc.nextInt()!= 1) { //print school details 
				option = false;
				System.out.println("\n");
				System.out.println("============================================");
				System.out.println("============================================");
				System.out.println("=========== School System Report ===========");
				System.out.println("============================================");
				System.out.println("============================================");
				System.out.println("\n");
				System.out.println(" School name is :" + school1.getName());
				System.out.println(" School Location is :" + school1.getLocation());
				System.out.println("\n");
				System.out.println("===============  Department  =================");
				System.out.println("\n");

				for( Department department :dep1) { // print department details 
					
					System.out.println(" Department name is " + department.getNameOfDepatment());
					System.out.println(" Department Floor No. is " + department.getNumOfFloors());
					System.out.println("\n");
					System.out.println("===============     Teachers  =================");
					System.out.println("\n");
					for(Teacher t : department.arr2) { //print teacher details 
						  System.out.println("===============   Teacher Details   =================");
						System.out.println(" Teacher name is : " + t.getNameOfTeacher());
						System.out.println(" Teacher id is : :" + t.getIdOfTeacher());
						System.out.println("\n");
						System.out.println("===============   Students   =================");
						System.out.println("\n");
						for(Student s : t.studentList) { //print student details 
							//System.out.println("================== Student Details =====================");
							System.out.println(" Student name is : " + s.getNameOfStudent());
							System.out.println(" Student id is : :" + s.getIdOfStudent());
							
							System.out.println("================================================");
							System.out.println("\n");
							  System.out.println("===============   Courses   =================");
							  System.out.println("\n");
							  for(Course c : s.coList) { //print course details and mark 
								
								  System.out.println("===============   Course Details  =================");
								System.out.println(" Course name is : " + c.getNameOfCourse());
								System.out.println(" Course ID is : :" + c.getIdOfCourse());
								System.out.println(" Course Mark is : " + c.markCourse.getTheMark());
								System.out.println("================================================");
								System.out.println("================================================");
						}
						}
					}
					
					System.out.println("================================================");
				}
			///athkar ending
				System.out.println("================================================");
				System.out.println("======= Thank you for using our system! ========");
				System.out.println("============== Alhamdulillah ===================");
				System.out.println("============= La Ilaha Illallah ================");
				System.out.println("=============== Allahu Akbar ===================");
				System.out.println("\n");
				//System.out.println("        This Athkar not taliban!!!     ");
			}
		  
		}
	
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("this is your history list");
			writer.write("\n");
			writer.write(" School name is :" + stack.get(0));
			writer.write("\n");
			writer.write(" School Location is :" + stack.get(1));
			writer.write("\n");
			writer.write(" Department name is:" + stack.get(2));
			writer.write("\n");
			writer.write(" Department Floor No. is" +stack.get(3));
			writer.write("\n");
			writer.write(" Teacher name is : " +stack.get(4));
			writer.write("\n");
			writer.write(" Teacher id is : " + stack.get(5));
			writer.write("\n");
			writer.write(" Student name is : " +stack.get(6));
			writer.write("\n");
			writer.write(" Student id is : " + stack.get(7));
			writer.write("\n");
			writer.write(" Course name is : " + stack.get(8));
			writer.write("\n");
			writer.write(" Course ID is : " + stack.get(9));
			writer.write("\n");
			
			writer.write(" Course Mark is : " + stack.get(10));
				//
				// System.out.println(" School name is :" + v.indexOf("11"));
			//}
			
			writer.close();
			}
			catch (IOException o) {
				o.printStackTrace();			
		}
		 File file = new File("C:\\Users\\Lenovo\\eclipse-workspace\\objchain\\output.txt");
		 
		   
		        // Creating an object of BufferedReader class
		        BufferedReader br = null;
				try {
					br = new BufferedReader(new FileReader(file));
				} catch (FileNotFoundException e) {
			
					e.printStackTrace();
				}
		 
		    
		        String st;
		        // Condition holds true till
		  
		        try {
		        	System.out.println("This is read from file system");
		        	System.out.println("\n");
					while ((st = br.readLine()) != null)
 
					    // Print the string
					
					    System.out.println(st);
				} catch (IOException e) {
			
					e.printStackTrace();
				}
		    }
		}
	
		//sc.close();
		/*stack.pop();
		 System.out.println(stack); 
*/
	



