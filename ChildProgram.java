package module2;
interface A
{
	void method2();
}
interface B extends A
{
	void method1();
}
public class ChildProgram implements B
{
	public static void main(String[] args) 
	{
		
	}

	public void method2() 
	{
		System.out.println("Real Logic will be here 1");
	}
	public void method1() 
	{
		System.out.println("Real Logic will be here 2");
	}
}
