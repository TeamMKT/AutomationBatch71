package module1.basic.javaconcepts;
public class TypesOfVariable2 
{
	static double area=21.5;//static Global variable
	int a=100;//Instance variable
	public static void main(String[] args)
	{
		 int b=10;//Local variable
		 b=100;//value of local variable is updated
		 System.out.println(b);
		 
		 area=90;
		 System.out.println(area);
		 TypesOfVariable2 t1=new TypesOfVariable2();
		 System.out.println(t1.a=87654);
		 
	}
}
