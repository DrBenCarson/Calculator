import java.io.*;
import java.util.*;
public class Tester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner iHateXav=new Scanner(System.in);
		System.out.println("Make your arithmetic selection from the following choices.");
		
		System.out.println("   Enter      Addition for Addition");
		System.out.println("   Enter      Subtraction for Subtraction");
		System.out.println("   Enter      Multiplication for Multiplication");
		System.out.println("   Enter      Divison for Division");
		
		System.out.println(" Enter your choice ");
		String choice = iHateXav.nextLine();
		
		
		Scanner iHeartXav=new Scanner(System.in);
		System.out.println("Enter a number: ");
		double zz=iHeartXav.nextDouble();
		System.out.println("Enter a second number: ");
		double yy=iHeartXav.nextDouble();
		
		switch (choice)
		{
		case "Addition":
			System.out.println((zz + yy));
			break;
		case "Subtraction": 
			System.out.println((zz - yy));
			break;
		case "Multiplication":
			System.out.println((zz * yy));
			break;
		case "Division":
			System.out.println((zz/yy));
			break;
		default: 
			System.out.println("Please enter an \"Addition\", \"Subtraction\", \"Multiplication\", or \"Division\" only for your math choice");
			break;
	}
	}
}
