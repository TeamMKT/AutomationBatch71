package module1.basic.javaconcepts;

public class GlobalVsLocalVariable2 
{
	final static int a=10;//global variable
	
	public static void main(String[] args) //local Variable
	{
		final int a=100;//local Variable
		
		System.out.println(a);
		System.out.println(GlobalVsLocalVariable2.a);
	}
}
