package module1.basic.javaconcepts;
public class IfBlockProgram2 
{
	public static void main(String[] args) 
	{
		int a=100;
		int b=200;
		System.out.println("Start");
		if(a>60)//true
		{
			System.out.println("Conditional Statement 1");
		}
		if(a>=60)//true
		{
			System.out.println("Conditional Statement 2");
		}
		if(a<=60)//false
		{
			System.out.println("Conditional Statement 3");
		}
		if(a==b)//false
		{
			System.out.println("Conditional Statement 4");
		}
		if(a!=60)//true
		{
			System.out.println("Conditional Statement 5");
		}
		if(a<60)//false
		{
			System.out.println("Conditional Statement 6");
		}
		System.out.println("End");

	}
}
