package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String StudentID;
	private String firstName;
	private String lastName;
	private int year;
	private String courses="";
	private int tuitionBalance=0;
	private static int costOfCourse= 600;
	private static int id=1000;
	
	
	//Constructor  : prompts user to enter students name and year
	
	public Student()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName=in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName=in.nextLine();
		
		System.out.println("1- Fresher\n2 for 2nd year\n3 -3rd year\n4- Senior\nEnter student class year: ");
		this.year=in.nextInt();
		setStudentID();
		//System.out.println(firstName +" "+lastName+ " "+year + " "+ StudentID);
		
		
		
	}
	
	//Generate an id
	
	private void setStudentID()
	{
		//year+id
		id++;
		this.StudentID= year + "" +id;
	}
	
	//Enroll in courses
	
	public void enroll()
	{
		//get inside a loop, user hits 0
		do {
		System.out.print("Enter course to enroll (Q to quit):");
		Scanner in=new Scanner(System.in);
		String course=in.nextLine();
		if(!course.equals("Q"))
		{
			courses= courses +"\n   " +course;
			tuitionBalance= tuitionBalance+costOfCourse;
		}
		else{break;}
		} while(1!=0);
		
		//System.out.println("ENROLLED IN:"+ courses);
		//System.out.println("TUITION FEES: "+tuitionBalance);
	}
	
	//View balance 
	
	public void viewBalance(){
		System.out.println("Your balance is:$" + tuitionBalance);
	}
	
	//Pay tuition
	
	public void payTuition()
	{ 
		viewBalance();
		System.out.print("Enter your payment : $");
		Scanner in=new Scanner(System.in);
		int payment=in.nextInt();
		tuitionBalance= tuitionBalance - payment;
		System.out.println("Thank you for your payment of $"+ payment);
		viewBalance();
	}
	//Show status
	
	public String toString() {
		return "Name: "+firstName + " "+lastName+
				"\nGrade Year: "+ " "+ year+
				"\nStudentID: "+" "+StudentID+
				"\nCourses Enrolled: "+ courses +
				"\nBalance : $"+tuitionBalance;
	}

}
