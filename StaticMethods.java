package module1.basic.javaconcepts;
/*Method Overloading:
 * Developing multiple methods with the same name but variation in the argument list
 * or parameter
 *We can overload both static as well as non static method 
 *
 */
public class StaticMethods 
{
	static void add(int a,int b)//local variable
	{
		int sum=a+b;
		System.out.println(sum);
	}
	static void add(double a,double b)//local variable
	{
		double sum=a+b;
		System.out.println(sum);
	}
	static void add(double a,int b)//local variable
	{
		double sum=a+b;
		System.out.println(sum);
	}
	static void add(int a,double b)//local variable
	{
		double sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		add(100,200);
		add(1.1,200.9345);
		add(10,9.8);
		add(10.6,100);
	} 
}
