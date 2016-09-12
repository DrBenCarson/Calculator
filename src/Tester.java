import java.io.*;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner iHateXav=new Scanner(System.in);
		System.out.println("Make your arithmetic selection from the following choices.");
		
		System.out.println("         a or A for Addition");
		System.out.println("         s or S for Subtraction");
		System.out.println("         m or M for Multiplication");
		System.out.println("         d or D for Division");
		
		System.out.println(" Enter your choice ");
		String choice = iHateXav.nextLine();
		char ch=choice.charAt(0);
		
		Scanner xavIsNice=new Scanner(System.in);
		System.out.println("Enter a number: ");
		double zz=xavIsNice.nextDouble();
		System.out.println("Enter a second number: ");
		double yy=xavIsNice.nextDouble();
		
		switch (ch)
		{
		case 'a':
			System.out.println((zz + yy));
			break;
		case 'A':
			System.out.println((zz + yy));
			break;
		case 's': 
			System.out.println((zz - yy));
			break;
		case 'S':
			System.out.println((zz-yy));
			break;
		case 'm':
			System.out.println((zz * yy));
			break;
		case 'M':
			System.out.println((zz * yy));
			break;
		case 'd':
			System.out.println((zz/yy));
			break;
		case 'D':
			System.out.println((zz/yy));
			break;
		default: 
			System.out.println("Please enter an a,A,s,S,d,D,m, or M only for your math choice");
			break;
		}
	}

}
