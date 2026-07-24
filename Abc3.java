package module2;
final class Bcd2
{
	 void login()
	{
		System.out.println("Login using email id");
	}
}
public class Abc3 //extends Bcd2
{
	void login()
	{
		System.out.println("Login using Mobile no");
	//	super.login();
	}
	public static void main(String[] args) 
	{
		
		Abc3 a1=new Abc3();
		a1.login();
		
	}
}
