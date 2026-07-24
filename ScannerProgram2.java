package module1.basic.javaconcepts;
import java.util.Scanner;
public class ScannerProgram2 
{
	
	public static void main(String[] args) 
	{
	
		Scanner s1=new Scanner(System.in);
		byte b1=	s1.nextByte();
		System.out.println(b1);
		short c1=	s1.nextShort();
		double d1=	s1.nextDouble();
		int f1=	s1.nextInt();
		long h1=	s1.nextLong();
		float g1=	s1.nextFloat();
		boolean j1=	s1.nextBoolean();
		String k1=	s1.next();
			s1.close();
	}
}
