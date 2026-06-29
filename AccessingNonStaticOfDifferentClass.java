package module1.basic.javaconcepts;

public class AccessingNonStaticOfDifferentClass 
{
	public static void main(String[] args) 
	{
		NonStaticMethodAccessing n1=new NonStaticMethodAccessing();
		n1.login();
		
		n1.logout();
	}
}
