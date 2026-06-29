package module1.basic.javaconcepts;
public class TypesOfVariable 
{
	static double pi=3.14;//static Global variable
	int a=100;//Instance variable
	public static void main(String[] args)
	{
		 int b=10;//Local variable
		 System.out.println(b);
		 
		 System.out.println(pi);
		 TypesOfVariable t1=new TypesOfVariable();
		 System.out.println(t1.a);
		 
	}
}
