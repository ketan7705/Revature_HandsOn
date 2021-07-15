package Date15;

import java.util.Scanner;

public class ExcepHand {
	public void addNumbers(){
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the Number :");
			int n;
			int m;
			for (int j = 0; j < 5; j++) {
				Scanner a = new Scanner(System.in);
				n = a.nextInt();
				m = a.nextInt();
				int Result = n + m;
				System.out.println("Calaculation Result is :" + Result);
			}
			
			
			System.out.println("!! Enter Again to do the calculation.!!");
		}
	}
	public void substraction(){
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the Number :");
			int n;
			int m;
			for (int j = 0; j < 5; j++) {
				Scanner a = new Scanner(System.in);
				n = a.nextInt();
				m = a.nextInt();
				int Result = n - m;
				System.out.println("Calaculation Result is :" + Result);
			}
			
			System.out.println("!! Enter Again to do the calculation.!!");
		}
	}
	public void multiplication(){
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the Number :");
			int n;
			int m;
			for (int j = 0; j < 5; j++) {
				Scanner a = new Scanner(System.in);
				n = a.nextInt();
				m = a.nextInt();
				int Result = n * m;
				System.out.println("Calaculation Result is :" + Result);
			}
			
			System.out.println("!! Enter Again to do the calculation.!!");
		}
	}
	public void division(){
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the Number :");
			for (int j = 0; j < 5; j++) {
				Scanner a = new Scanner(System.in);
				int n = a.nextInt();
				int m = a.nextInt();
				try {
					int Result = n / m;
					System.out.println("Calaculation Result is :" + Result);
				} catch (ArithmeticException e) {
					System.out.println("Can't divide a number by 0");
				} 
			}
			System.out.println("!! Enter Again to do the calculation.!!");
		}
	}
	public static void main(String[] args) {
		ExcepHand excepHand = new ExcepHand();
		System.out.println("Enter the Number what u gona do :");

        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Divison");
        for (int i = 0; i < 5; i++) {
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
			try {
				switch (choice) {
				case 1:
					excepHand.addNumbers();
					break;
				case 2:
					excepHand.substraction();
					break;
				case 3:
					excepHand.multiplication();
					break;
				case 4:
					excepHand.division();
					break;
				default:
					System.out.println("Please enter valid choice");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("##Enter Number only##");
				System.out.println("Please select option again 1 to 4.");
			} 
		} 
			
		
		
	}
}
