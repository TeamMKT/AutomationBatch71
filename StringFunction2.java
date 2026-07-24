package module2;
public class StringFunction2 
{
	public static void main(String[] args) 
	{
		String a="Automation";
		
		
		String newa=	a.concat(" Testing");
		System.out.println(a);
		System.out.println(newa);//immutable 
		
		System.out.println(a.substring(2));
		
		System.out.println(a.substring(2,5));
		System.out.println(a.substring(1,5));//alwasy remember
		//any method that has 2 parameter where both the paraemter 
		//are index based it will alwasys work as last index-1

	}
}
