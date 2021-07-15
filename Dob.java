package HandsOn;

import java.util.Scanner;

public class Dob {
	public void checkBirthYear() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day: ");
		int day = sc.nextInt();
		System.out.println("Enter Month: ");
		int month = sc.nextInt();
		System.out.println("Enter Year: ");
		int year = sc.nextInt();

		System.out.println("Check your details : " + day + " " + month + " " + year + " ");

		switch (year) {
		case 1990 - 1995:
			System.out.println("You are early 90's born !!!");
			break;
		case 1996 - 2000:
			System.out.println("You are late 90's born !!!");
			break;
		case 2001 - 2010:
			System.out.println("You are new decade !!!");
			break;
		case 2011 - 2021:
			System.out.println("You are recently born !!!");
			break;
		default:
			System.out.println("Invalid details please check again..!!");

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dob d = new Dob();
		d.checkBirthYear();
	}

}
