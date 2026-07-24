package module2;
class Bcd
{
	void login()
	{
		System.out.println("Login using email id");
	}
}
public class Abc extends Bcd
{
	void login()
	{
		System.out.println("Login using Mobile no");
	}
	public static void main(String[] args) 
	{
		Abc a1=new Abc();
		a1.login();
		
	}
}
