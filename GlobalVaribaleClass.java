package module1.basic.javaconcepts;
public class GlobalVaribaleClass 
{
	static int a=100;//global variable
	static int b=50;//global variable
	static void add()
	{
		int sum=a+b;//Local variable
		System.out.println(sum);
	}
	static void sub()
	{
		int c=a-b;//Local variable
		System.out.println(c);
	}
	static void mul()
	{
		int c=a*b;//Local variable
		System.out.println(c);
	
	}
	static void div()
	{
		int c=a%b;//Local variable
		System.out.println(c);
	
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		
	}
}
