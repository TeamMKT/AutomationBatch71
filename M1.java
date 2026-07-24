package module2;
class M3
{
	M3(String c)
	{
		this();
		System.out.println("Cons 6");
	}
	M3()
	{
		System.out.println("Cons 5");
	}
}
class M2 extends M3
{
	M2()
	{
		this(12.22);
		System.out.println("Cons 4");
	}
	M2(double x)
	{
		super("MKT");
		System.out.println("Cons 3");
	}
}
public class M1 extends M2
{
	M1()
	{
		this('D');
		System.out.println("Cons 2");
	}
	M1(char x)
	{
		System.out.println("Cons 1");
	}
	public static void main(String[] args) 
	{
		new M1();
	}
}
