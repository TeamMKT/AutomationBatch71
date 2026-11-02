package classPrograms;

import java.nio.file.Paths;
import java.util.Date;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PassportDropdownWithoutSelect 
{
	public static void main(String[] args) 
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		
		page.navigate("https://services1.passportindia.gov.in/forms/registration");
	//	page.getByText("Passport Office").click();
		page.getByText("Passport Office", new Page.GetByTextOptions().setExact(true)).click();
		
		page.locator("select").click();
		page.waitForTimeout(2000);
	//	page.getByText("Bengaluru",new Page.GetByTextOptions().setExact(true)).click();
		//page.getByRole(AriaRole.LINK, new GetByRoleOptions().setName("Delhi")).click();
		page.keyboard().press("ArrowDown");
		page.keyboard().press("ArrowDown");
		page.keyboard().press("ArrowDown");
		page.keyboard().press("ArrowDown");
		page.keyboard().press("ArrowDown");
		page.keyboard().press("ArrowDown");

		page.keyboard().press("Enter");
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		String format=	d2.toString();
		String dateformat=	format.replace(":", "");
		page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\MKT\\eclipse-workspace\\AB71_PW\\screenshot\\TestCase"+dateformat+".png")));
		
		

	}
}
