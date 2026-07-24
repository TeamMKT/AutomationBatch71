package module2;

public class ForLoop 
{
	public static void main(String[] args) 
	{
		
		/*
		 * "for(declaration and initilization;condition;increment/decrement)
{


|"				
		 */
		for(int i=0;i<4;i++)
		{
			if(i==2)
			{
				continue;
			}
			
			
			System.out.println(i);
			/* o,true,Yes
			 * 1,true,yes
			 * 2,true,yes
			 * 3,true,yes
			 * 4,false,NO
			 */
		}
	}
}
