package module1.basic.javaconcepts;

import java.util.Scanner;

public class StudentDetailsUsingScanner2 
{
	
	public static void main(String[] args) //local Variable
	{
		Scanner s1=new Scanner(System.in);
	for(int i=1;i<=5;i++)
	{
		System.out.println("Please Enter your Name");
		String name=	s1.next();
		System.out.println("Your name is-> "+name);
		System.out.println("Please Enter your Age");
		int age=	s1.nextInt();
		System.out.println("Your age is-> "+age);
		System.out.println("Thank You");	
	}
	s1.close();
	}
}
