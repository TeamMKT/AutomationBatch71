package module1.basic.javaconcepts;
public class NestedIfElseBlockOProgram2 
{
	public static void main(String[] args) 
	{
		char gender1='X';
		int age=90;
		char gender2='Y';

		if(gender1=='M')//false
		{
			if(age>=18)
			{
				System.out.println("Conditional Statemnet 1");
			}
			else
			{
				System.out.println("Conditional Statemnet 2");
			}
		}
		else
		{
			System.out.println("Conditional Statemnet 3");

		}
		
		
	}
}
