import java.util.*;

import javax.swing.Spring;

public class School{ static  Scanner sc = new Scanner(System.in);

	public static void main (String args[]) {
		
		int rollno1= 1 ;
		String name1 = "XYZ SINGH" ;
		String fathername1 = "XYZ1 SINGH";
		int classes1 = 10 ;
		String section1 = "C";
		
		//student TWO details 
		int rollno2= 2;
		String name2 = "ABC SINGH" ;
		String fathername2 = "ABC1 SINGH";
		int classes2 = 9 ;
		String section2 = "C";	
		
		

		 boolean isRunning = true;
		 while(isRunning) {
		System.out.println("**************");
		System.out.println("SCHOOL MANAGEMENT SYSTEM");
		System.out.println("**************");
		System.out.println("1= TEACHER PORTAL");
		System.out.println("2=STUDENT PORTAL");
		System.out.println("ENTER YOUR PORTAL NUMBER 1 OR 2 = \n");
		int choice1 = sc.nextInt();
		
		switch (choice1) {
		case 1 -> System.out.println("TEACHER PROTAL OPENED");
		case 2 -> System.out.println("STUDENT PROTAL OPENED")
		;
		}
		
		
		
		
		
		System.out.println("1 = STUDENT 1 INFO");
		System.out.println("2 = STUDENT 2 INFO ");
		
		System.out.println("ENTER YOUR CHOICE 1 OR 2 = \n");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1 -> studentone(rollno1,name1,fathername1,classes1,section1);
		case 2 -> studenttwo(rollno2,name2,fathername2,classes2,section2);
		default -> System.out.println("INVALID INFO");
		}
		
		
	 }  System.out.println("THANK U ");
	   
	
		//STUDENT PROFILE
		//student ONE DETAILS 
		
		
		}
	static void studentone( int roll, String name, String fathername , int classes , String section  ){
		   System.out.printf("the roll no of student 1 is = %d \n"+"The name of student is: %s \n", roll, name );
		   System.out.printf("the father name of the student 1 is = %s \n" +"the class of the student 1 is = %d \n"+ "the section of the student 1 is = %s \n", fathername, classes , section );
	   }
	
	static void studenttwo( int roll, String name, String fathername , int classes , String section  ){
		   System.out.printf("the roll no of student 2 is = %d \n"+"The name of student is: %s \n", roll, name );
		   System.out.printf("the father name of the student 2 is = %s \n" +"the class of the student 2 is = %d \n"+ "the section of the student 2 is = %s \n", fathername ,classes, section);
		   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}