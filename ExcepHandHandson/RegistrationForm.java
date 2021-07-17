package ExcepHandHandson;

import java.util.InputMismatchException;
import java.util.Scanner;

import Date15.InvalidAmountException;

public class RegistrationForm {
	
	public void registrationFrom() throws AgeException{
	
	System.out.println("Enter the student details to register : ");
	System.out.println("Enter Name : ");
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
//	String Name= sc.nextLine();
//	System.out.println("Enter Name : "+Name);
	String PrimaryEmailid=sc.nextLine();
	System.out.println("Enter mailId "+PrimaryEmailid);
	String Sex= sc.nextLine();
	System.out.println("Please check your mail again : "+Sex);

	String c=PrimaryEmailid;
	
	try {
        System.out.println("Enter Age: ");
        Integer age = sc.nextInt(); 
        if(35 < age && age > 23 )
        	throw new AgeException("You not eligible for taking admission in University");
        else 
        	System.out.println("This details you entered : "+" "+Sex+" "+c+" "+age);
     } 
     catch (InputMismatchException ex) {
        System.out.println("input is not with in integer range ");
     }
	}
	public static void main(String[] args) throws AgeException, RegistrationException {
		System.out.println("Welcome to Best University.");
		RegistrationForm r =new RegistrationForm();
		r.registrationFrom();
		Student s =new Student();
		s.registerStudent();
		s.registerForExam();
		Registratar z = new Registratar();
		z.getRegistrar();
	}
}
