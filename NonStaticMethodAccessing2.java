package module1.basic.javaconcepts;
public class NonStaticMethodAccessing2 
{
	void login()
	{
		System.out.println("Code to Login to Application");
	}
	void logout()
	{
		System.out.println("Code to logout from Application");
	}
	public static void main(String[] args) 
	{
		/*
		 * "How to Access in any static Method?
By Creating an Object
ClassName referanceVaribale=new ClassName();
referanceVaribale.nonstaticmethod();"			
		 */
		NonStaticMethodAccessing2 n1=new NonStaticMethodAccessing2();
		n1.login();
		n1.logout();
		
		NonStaticMethodAccessing2 n2=new NonStaticMethodAccessing2();
		n2.login();
		n2.logout();
	}
}
