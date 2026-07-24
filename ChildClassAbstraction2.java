package module2;
 class ParentClassA1  //Concerte Class
{
	static void C() //concrete Method
	{
		System.out.println("This Logic 1 I am exposing");
	}
}
abstract class ParentClassB1 extends ParentClassA1    //abstract class
{
	abstract void B();
	 void D() //concrete Method
	{
			System.out.println("This Logic 2 I am exposing");
	}
}//50% abstraction
public class ChildClassAbstraction2 extends ParentClassB1  //Concerte Class
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
	}

	void B() 
	{
		System.out.println("Actual Logic A");
	}
	
}
