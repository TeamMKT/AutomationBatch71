package module1.basic.javaconcepts;
/*
 * ConstructorOverloading:
 * Developing multiple constructor  but variation in the argument list
 * or parameter
 */
public class ConstructorOverloading 
{
	ConstructorOverloading(int a)
	{
		System.out.println("1st Constructor");
	}
	ConstructorOverloading(String a)
	{
		System.out.println("2st Constructor");
	}
	ConstructorOverloading(int a,String b,char c)
	{
		System.out.println("3rd Constructor");
	}
	ConstructorOverloading(String a,String b)
	{
		System.out.println("4th Constructor");
	}
	public static void main(String[] args) 
	{
		new ConstructorOverloading(100);
		new ConstructorOverloading("Automation");
		new ConstructorOverloading(100,"Manual",'x');
		new ConstructorOverloading("SDET","QA");
	}
}
