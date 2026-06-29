package module1.basic.javaconcepts;
/*
 * ThisCallingStatement:
 * Calling one cons from another cons within the same class is called as This 
 * calling sttament.
 * This() should be the 1st line in every cons.
 * This() should be written explcitely only.
 * 
 * This() is also called as COnstructor Chaining.
 *
 */
public class ThisCallingStatement 
{
	ThisCallingStatement(int a)
	{
		this("Automation");
		System.out.println("1st Constructor");
	}
	ThisCallingStatement(String a)
	{
		this(100,"Manual",'X');
		System.out.println("2st Constructor");
	}
	ThisCallingStatement(int a,String b,char c)
	{  this("stbymkt@Gmail.com","manish@1121");
		System.out.println("3rd Constructor");
	}
	ThisCallingStatement(String UN,String PWD)
	{
		this();
		System.out.println("4th Constructor");
	}
	ThisCallingStatement()
	{
		System.out.println("5th Constructor");
		
	}

	public static void main(String[] args) 
	{
		new ThisCallingStatement(100);
        
	}
}
