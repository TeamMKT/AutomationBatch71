package module2;
public class AccessSpecifierCase1 
{
	public static int a=10;
	protected static int b=20;
	static int c=30;
	private static int d=40;

	public static void add()
	{
		
	}
	protected static void sub()
	{
		
	}
	static void mul()
	{
		
	}
	private static void div()
	{
		
	}
	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		add();
		div();
		mul();
		sub();
		
	}
}
