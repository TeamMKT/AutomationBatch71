package testNGProgramsinClassLive;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnottaions2
{
		
	@Test
	public void testCase()
	{
		System.out.println("TestCase");


	}	@BeforeClass
	public void bc()
	{
		System.out.println("BC");


	}	@AfterClass
	public void ac()
	{
		System.out.println("AC");


	}	@BeforeMethod
	public void bm()
	{

		System.out.println("BM");

	}	@AfterMethod
	public void am()
	{
		System.out.println("AM");


	}
}
