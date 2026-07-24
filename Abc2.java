package module2;
class Bcd1
{
	final void login()
	{
		System.out.println("Login using email id");
	}
}
public class Abc2 extends Bcd1
{
	void loginSuisngMobileNo()
	{
		System.out.println("Login using Mobile no");
	//	super.login();
	}
	public static void main(String[] args) 
	{
		
		Abc2 a1=new Abc2();
		a1.login();
		
	}
}
