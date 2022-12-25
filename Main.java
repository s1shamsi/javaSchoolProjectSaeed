package objchain;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean option = true ;
		boolean option2 = true ;
		boolean option3 = true ;
		boolean option4 = true ;
		
		ArrayList<Department> dep1 = new ArrayList<Department>();
		Scanner sc = new Scanner(System.in);
		School school1 = new School();
		System.out.println("    Bismillah Al-rahman Al-rahim    ");
		System.out.println("welcome to S.CodeLine school system");
		System.out.println("This system is just simple system");

		System.out.print("Please Enter School Name : ");
		school1.setName(sc.nextLine());
		System.out.print("Please Enter School Location : ");
		school1.setLocation(sc.nextLine());
		
		while(option) {
	
			Department dep = new Department();
			System.out.print("Please Enter Department Name : ");
			dep.setNameOfDepatment(sc.next());
			System.out.print("Please Enter Department Floor : ");
			dep.setNumOfFloors(sc.nextInt());
			
			while(option2) {
				
				Teacher t = new Teacher();
				System.out.print("Please Enter Teacher name : ");
				t.setNameOfTeacher(sc.next());
				System.out.print("Please Enter Teacher ID : ");
				t.setIdOfTeacher(sc.nextInt());
				while(option3) {
					Student st = new Student();
					System.out.print("Please Enter Student name : ");
					st.setNameOfStudent(sc.next());
					System.out.print("Please Enter Student ID : ");
					st.setIdOfStudent(sc.nextInt());
			
					t.studentList.add(st);
				
				    while(option4) {
					
					Course cr = new Course();
					System.out.print("Please Enter Course name : ");
					cr.setNameOfCourse(sc.next());
					System.out.print("Please Enter Course Id : ");
					cr.setIdOfCourse(sc.next());
					System.out.print("Please Enter Mark : ");
					cr.markCourse.setTheMark(sc.nextInt());
					st.coList.add(cr);
					System.out.print("Press 1 to add course, Press 2 if you dont want to add course ");
					if(sc.nextInt()!= 1) {
						option4 = false;
					}
					
					
				}
				    System.out.print("Press 1 to add student, Press 2 if you dont want to add student ");
					if(sc.nextInt()!= 1) {
						option3 = false;
					
					}
					option4 = true;
					
				        }
				
				dep.arr2.add(t);
				
				System.out.print("Press 1 to add Teacher, Press 2 if you dont want to add Teacher");
				option3 = true;
				if(sc.nextInt()!= 1) {
					option2 = false;
				
				}
			}
			dep1.add(dep);
			System.out.print("Please Enter 1 to add more departments 2 to print the report");
			option2 = true;
			if(sc.nextInt()!= 1) {
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
				System.out.println("===============  Department  =================");

				for( Department department :dep1) {
					
					System.out.println(" Department name is " + department.getNameOfDepatment());
					System.out.println(" Department Floor No. is " + department.getNumOfFloors());
					System.out.println("===============     Teachers  =================");
					for(Teacher t : department.arr2) {
						  System.out.println("===============   Teacher Details   =================");
						System.out.println(" Teacher name is : " + t.getNameOfTeacher());
						System.out.println(" Teacher id is : :" + t.getIdOfTeacher());
						System.out.println("===============   Students   =================");
						for(Student s : t.studentList) {
							//System.out.println("================== Student Details =====================");
							System.out.println(" Student name is : " + s.getNameOfStudent());
							System.out.println(" Student id is : :" + s.getIdOfStudent());
							
							System.out.println("================================================");
							  System.out.println("===============   Courses   =================");
							  for(Course c : s.coList) {
								
								  System.out.println("===============   Course Details  =================");
								System.out.println(" Course name is : " + c.getNameOfCourse());
								System.out.println(" Course ID is : :" + c.getIdOfCourse());
								System.out.println(" mathMark is : " + c.markCourse.getTheMark());
								System.out.println("================================================");
								System.out.println("================================================");
						}
						}
					}
					
					System.out.println("================================================");
				}
			
				System.out.println("================================================");
				System.out.println("====== Thank you for using our system! =========");
				System.out.println("============== Alhamdulillah ===================");
				System.out.println("============== La Ilaha Illallah ===============");
				System.out.println("=============== Allahu Akbar ===================");
			}
			
		}
		sc.close();
	}

}
