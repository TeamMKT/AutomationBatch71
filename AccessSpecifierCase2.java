package module2;
public class AccessSpecifierCase2 
{
	
	public static void main(String[] args) 
	{
		System.out.println(AccessSpecifierCase1.a);
		System.out.println(AccessSpecifierCase1.b);
		System.out.println(AccessSpecifierCase1.c);

		AccessSpecifierCase1.add();
		AccessSpecifierCase1.mul();
		AccessSpecifierCase1.sub();
		
	}
}
