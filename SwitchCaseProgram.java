package module1.basic.javaconcepts;

import java.util.Scanner;

public class SwitchCaseProgram 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("Please Press 1 for Chrome,");
		System.out.print(" Press 2 for Edge,");
		System.out.print(" Press 3 for Firefox & ");
		System.out.println(" Press 4 for Safari");

		int choice=	s1.nextInt();
		switch(choice)
		{
		case 1:
				System.out.println("Launching Chrome Browser");
				break;
		case 2:
			System.out.println("Launching Edge Browser");
			break;
		case 3:
			System.out.println("Launching Firefox Browser");
			break;

		case 4:
			System.out.println("Launching Safari Browser");
			break;

		default:
			System.out.println("Sorry yoour selection is wrong");

			
		}
		
		s1.close();
	}
}
