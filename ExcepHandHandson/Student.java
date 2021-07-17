package ExcepHandHandson;

import java.util.Scanner;

public class Student {
	String admissionId;
	String result;
	public void registerStudent() {
		System.out.println("Congrats ..!! The Student are successfully register ");
		System.out.println("This is admissionId : " + Math.random());
		System.out.println("Passed the Examination");
	}
	public void registerForExam() {
		System.out.println("Enter below details to appear for exam..!!");
		System.out.println("Enter Full name : ");
		Scanner sc = new Scanner(System.in);
		String sem = sc.nextLine();
		System.out.println("Enter Current Semster details : "+sem);
		String PrimaryEmailid = sc.nextLine();
		System.out.println("Enter Roll No : "+PrimaryEmailid);
		String a = sc.next();
		System.out.println("Check your roll no again : "+a);
		sc.close();
		System.out.println("Check Details : \n "+PrimaryEmailid+" "+sem);
		
	}
	public void appearForExam() {
		System.out.println("Your appeared for the exam..!!");
	}

}
