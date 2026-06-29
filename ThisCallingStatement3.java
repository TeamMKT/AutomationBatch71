package module1.basic.javaconcepts;
/*
 * ThisCallingStatement:
 * Calling one cons from another cons within the same class is called as This 
 * calling sttament.
 * This() should be the 1st line in every cons.
 * This() should be written explcitely only.
 * 
 *
 */
public class ThisCallingStatement3 
{
	ThisCallingStatement3(int a)
	{
		System.out.println("1st Constructor");
	}
	ThisCallingStatement3(String a)
	{
		this(100);
		System.out.println("2st Constructor");
	}
	ThisCallingStatement3()
	{
		this("Automation");
		System.out.println("5th Constructor");
	}
	public static void main(String[] args) 
	{
		new ThisCallingStatement3();

	}
}
