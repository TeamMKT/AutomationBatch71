package module2;
public class StringFunction 
{
	public static void main(String[] args) 
	{
		String a="Automation";
//Indexing->      0123456789
		int count=	a.length();
		System.out.println(count);
		
		String a1=	a.toLowerCase();
		System.out.println(a1);
		String a2=	a.toUpperCase();
		System.out.println(a2);
		
		//a.trim();
		char a3=a.charAt(3);
		System.out.println(a3);
		int indexofA=	a.indexOf('o');
		System.out.println(indexofA);
		int indexofV=	a.indexOf('o', 4);
		System.out.println(indexofV);

	}
}
