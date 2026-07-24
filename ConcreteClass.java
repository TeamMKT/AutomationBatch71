package module2;
abstract class AbstractClass
{
	abstract void add();
}
public class ConcreteClass extends AbstractClass
{
	public static void main(String[] args) 
	{
		
	}
	void add() 
	{
		System.out.println("Actual Logic");
	}
}
