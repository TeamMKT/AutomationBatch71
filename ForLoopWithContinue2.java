package module2;

public class ForLoopWithContinue2 
{
	public static void main(String[] args) 
	{
		
		
		for(int i=0;i<20;i--)
		{
			if(i>=2)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
