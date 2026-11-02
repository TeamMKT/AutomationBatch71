package learning.AB71_PW;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class JSAMXpath
{
	public static void main(String[] args) 
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		
		page.navigate("file:///C:/Users/MKT/Desktop/learningHTML1.html");
		page.locator("xpath=(/html/body/input)[1]").fill("Manish");
		
	//	page.locator("(/html/body/input)[1]").fill("Manish");

		page.locator("xpath=((/html/body/form)[2]/input)[1]").click();
	}
}
