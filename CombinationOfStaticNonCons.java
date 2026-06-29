package module1.basic.javaconcepts;
public class CombinationOfStaticNonCons 
{
	static void add()
	{
		System.out.println("Addition");
	}
	 void sub()
	{
			System.out.println("Subtraction");
	}
	CombinationOfStaticNonCons()
	{
		System.out.println("Constructor");

	}
	public static void main(String[] args) 
	{
		add();
		CombinationOfStaticNonCons c1=new CombinationOfStaticNonCons();
		c1.sub();
	}
}
