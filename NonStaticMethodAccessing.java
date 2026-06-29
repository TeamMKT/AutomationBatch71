package module1.basic.javaconcepts;
public class NonStaticMethodAccessing 
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
		NonStaticMethodAccessing n1=new NonStaticMethodAccessing();
		n1.login();
		n1.logout();
		
		
	}
}
