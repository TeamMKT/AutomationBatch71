package module2;
public class StringFunction5 
{
	public static void main(String[] args) 
	{
		String a="Automation Testing by MKT";
		boolean b1=	a.contains("Java");
		System.out.println(b1);
		
		boolean b2=a.equals("Automation testing by mkt");
		System.out.println(b2);
		
		String a1="Automation";
		String a2="Automation";
		boolean b3=	a1.equals(a2);//why not ==?
		System.out.println(b3);
		
		
		
		
		
	}
}
