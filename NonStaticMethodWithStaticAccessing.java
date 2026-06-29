package module1.basic.javaconcepts;
public class NonStaticMethodWithStaticAccessing 
{
	
	public static void main(String[] args) 
	{
		/*
		 * "How to Access in any static Method?
By Creating an Object
ClassName referanceVaribale=new ClassName();
referanceVaribale.nonstaticmethod();"			
		 */
		registartion();
		NonStaticMethodWithStaticAccessing n1=new NonStaticMethodWithStaticAccessing();
		n1.login();
		n1.logout();
		
		NonStaticMethodWithStaticAccessing n2=new NonStaticMethodWithStaticAccessing();
		n2.login();
		n2.logout();
	}
	void login()
	{
		System.out.println("Code to Login to Application");
	}
	void logout()
	{
		System.out.println("Code to logout from Application");
	}
	static void registartion()
	{
		System.out.println("Code to Registarttion");
	}
}
