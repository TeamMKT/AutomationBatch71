package module1.basic.javaconcepts;

import java.util.Scanner;

public class CircumferanceOfCircle
{
	public static void main(String[] args) 
	{
	
		//2*pi/r
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the Radius of your Circle");
		double r=	s1.nextDouble();
		double area=2*Math.PI*r;
		System.out.println("Area of circle i s->"+area);
		s1.close();
	}
}
