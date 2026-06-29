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
public class ThisCallingStatement2 
{
	ThisCallingStatement2(int a)
	{
		this("admin","admin");
		System.out.println("1st Constructor");
	}
	ThisCallingStatement2(String a)
	{
		
		System.out.println("2st Constructor");
	}
	ThisCallingStatement2(int a,String b,char c)
	{  
		this("API");
		System.out.println("3rd Constructor");
	}
	ThisCallingStatement2(String UN,String PWD)
	{
		this(100,"MANUAL",'K');
		System.out.println("4th Constructor");
	}
	ThisCallingStatement2()
	{
		this(100);
		System.out.println("5th Constructor");
	}
	public static void main(String[] args) 
	{
		new ThisCallingStatement2();

	}
}
