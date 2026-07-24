package module2;
public class PalindromeString 
{
	public static void main(String[] args) 
	{
		String input="mom";
		String output="";//empty
		
		for(int i=input.length()-1;i>=0;i--)
		{
		char c1=	input.charAt(i);
		output=output+c1;//MAIN LOGIC
		}
		System.out.println("Your input is:->"+input);
		System.out.println("Your Output is:->"+output);

		if(input.equals(output))
		{
			System.out.println("They are Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
		
		
	}
}
