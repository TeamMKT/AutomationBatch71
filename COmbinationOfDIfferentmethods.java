package module1.basic.javaconcepts;

public class COmbinationOfDIfferentmethods 
{
	static void add()
	{
		System.out.println("Addition");
		
	}
	void sub()
	{
		
		System.out.println("Subtraction");
	}
	void mul()
	{
		sub();
		System.out.println("Multplication");
	}
	public static void main(String[] args) 
	{
		COmbinationOfDIfferentmethods c1=new COmbinationOfDIfferentmethods();
		c1.sub();
	}
}
