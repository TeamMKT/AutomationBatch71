package module2;
public class ReverseTheString 
{
	public static void main(String[] args) 
	{
		String input="My Name is Ram";
		String output="";//empty
		
		for(int i=input.length()-1;i>=0;i--)
		{
		char c1=	input.charAt(i);
		output=output+c1;//MAIN LOGIC
		/*i=3,c1=a
		 * output=a
		 * i=2,c1=v
		 * output=a+v=av
		 * i=1,c1=a
		 * output=av+a=ava
		 * i=0,c1=j
		 * output=ava+j=avaj
		 * 
		 * 
		 */
		}
		System.out.println("Your input is:->"+input);
		System.out.println("Your Output is:->"+output);

	}
}
