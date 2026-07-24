package module2;
public class StringFunction4 
{
	public static void main(String[] args) 
	{
		String a="Automation";
		System.out.println(a.repeat(4));
		//check if the String starts with A
		boolean b1=	a.matches("A(.*)");
		System.out.println(b1);
		
		//check if the string ends with n
		boolean b2=	a.matches("(.*)n");
		System.out.println(b2);
		//check if in the given String it contains cart
		
		//this can be done using contains method
		
		//chec if strings starts with https
		String url="www.amazon.in";

		boolean b5=	url.matches("https(.*)");
		System.out.println(b5);
	}	
	
}
