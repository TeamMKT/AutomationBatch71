package module1.basic.javaconcepts;
public class AccessingStaticMethod 
{
	
	public static void main(String[] args) 
	{
		System.out.println("This is Main Method");
		add();
		sub();
	}
	static void add()
	{
		int a=109;
		int b=50;
		int c=a+b;
		System.out.println(c);	}
	static void sub()
	{
		int a=109;
		int b=50;
		int c=a-b;
		System.out.println(c);	
}
}
