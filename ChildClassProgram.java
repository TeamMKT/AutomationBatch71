package module2;
class A2
{
	A2(double a)
	{
		System.out.println("Constructor 3");
	}
}
class A1 extends A2
{
	A1(int a)
	{
		super(90.87);
		System.out.println("Constructor 2");
	}
}
public class ChildClassProgram extends A1 
{
	ChildClassProgram()
	{
		super(100);
		System.out.println("Constructor 1");
	}
	public static void main(String[] args) 
	{
		new ChildClassProgram();
	}
}
