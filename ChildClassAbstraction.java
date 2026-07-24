package module2;
abstract class ParentClassA
{
	abstract void A();
	static void C() //concrete Method
	{
		System.out.println("This Logic 1 I am exposing");
	}
}//50% abstraction
abstract class ParentClassB extends ParentClassA
{
	abstract void B();
	 void D() //concrete Method
	{
			System.out.println("This Logic 2 I am exposing");
	}
}//50% abstraction
public class ChildClassAbstraction extends ParentClassB
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
	}

	void B() 
	{
		System.out.println("Actual Logic A");
	}
	void A() 
	{
		System.out.println("Actual Logic B");
	}
}
