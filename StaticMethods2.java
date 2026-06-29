package module1.basic.javaconcepts;
public class StaticMethods2 
{
	static void add(int a,int b,double c)//local variable
	{
		int sum=a+b;
		System.out.println(sum);
	}
	static void add(double a,double b,double c)//local variable
	{
		double sum=a+b;
		System.out.println(sum);
	}
	static void add(double a,int b,String name)//local variable
	{
		double sum=a+b;
		System.out.println(sum);
		System.out.println(name);
	}
	
	public static void main(String[] args) 
	{
		add(100,200,3.14);
		add(1.1,200.9345,3.14);
		add(10.1,9,"My Name is Ram");
	} 
}
