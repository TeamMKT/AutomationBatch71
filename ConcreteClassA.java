package module2;
interface J1
{
	void method4();
	void method5();
}
abstract class D1 implements J1
{
	abstract void method1();
	abstract void method2();
	static void method3()
	{
		System.out.println("Logic that needs to be exposed");
	}
}
public class ConcreteClassA extends D1
{
	static void method7()
	{
		System.out.println("Logic 5");
	}
	void method8()
	{
		System.out.println("Logic 6");
	}
	public static void main(String[] args) 
	{
		
	}
	public void method4() 
	{
		System.out.println("Actual Logic 1");
	}
	public void method5() 
	{
		System.out.println("Actual Logic 2");
	}
	void method1() 
	{
		System.out.println("Actual Logic 3");
	}
	void method2() 
	{
		System.out.println("Actual Logic 4");	
	}
}
