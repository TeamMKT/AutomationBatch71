package classPrograms;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class SearchingWIthMultipleInputs 
{
	//priority,invocationCount,enabled,timeOut,retryAnalyzer
	@Test(dataProvider="searchdata_healthcareProducts")
	public void searchProduct(String value)
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		
		page.navigate("https://www.amazon.in");
	//	page.getByRole(AriaRole.SEARCHBOX).fill("Toys");
		Locator l1=	page.getByRole(AriaRole.SEARCHBOX);
		l1.fill(value);
		l1.press("Enter");
		page.waitForTimeout(3000);
		//Means i am going do assertion basically a common assertion irresptive of what i  am gonna search
		boolean answer=	page.title().contains(value);
		boolean answer1=	page.title().equals("Amazon.in : ".concat(value));

		System.out.println(answer);
		System.out.println(answer1);

		//Amazon.in : shoe
		//Amazon.in : mobiles
	}
	
	
	@DataProvider
	public Object searchdata_healthcareProducts()
	{
		Object [][]d1=new Object[5][1];
		//here 5 indicates how many times your test has to run
		//here 1 indictaes how many values my test shoudl accept for each run
		d1[0][0]="shoe";
		d1[1][0]="mobiles";
		d1[2][0]="laptop";
		d1[3][0]="earphone";
		d1[4][0]="tablet for kids";
		return d1;
	}
	
	@DataProvider
	public Object searchdata_Homeappliences()
	{
		Object [][]d1=new Object[5][1];
		//here 5 indicates how many times your test has to run
		//here 1 indictaes how many values my test shoudl accept for each run
		d1[0][0]="shoe";
		d1[1][0]="mobiles";
		d1[2][0]="laptop";
		d1[3][0]="earphone";
		d1[4][0]="tablet for kids";
		return d1;
	}
	
}
