package module1.basic.javaconcepts;
public class IfBlockProgramWithLogical5 
{
	public static void main(String[] args) 
	{
		int a=100;
		int b=200;
		int c=10;
		System.out.println("Start");
		if((a==60 && b==200) && c==b )//((false && true) &&  false     )
									//(false && false)=>false
		{
			System.out.println("Conditional Statement 1");
		}
		System.out.println("End");

	}
}
