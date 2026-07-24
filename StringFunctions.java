package module2;
public class StringFunctions 
{
	public static void main(String[] args) 
	{
		String a="";
		
		boolean b1=	a.isEmpty();
		System.out.println(b1);
		
	/*	String b="java";
		
		String f1=	b.replace('j', 'J');
		System.out.println("F1:"+f1);
	
		System.out.println("Original String:"+b);
		*/
		String c="Java Is a Language";

		System.out.println(c.replaceAll("[a-z]", "X"));
		//relace all smaller letters with space
		
		System.out.println(c.replaceAll("[a-z]", "X"));
		//relace all capital letters with space
		System.out.println(c.replaceAll("[A-Z]", ""));
		String d="K V no 2 Bangalore Karnataka India";

		//relace all numeric letters with space
		System.out.println(d.replaceAll("[0-9]", ""));
		
	/*	StringBuffer s1=new StringBuffer("Java");
		s1.append("Automation");
		System.out.println(s1);
		
		s1.insert(0, "Python");
		System.out.println(s1);
		*/
	}
}
