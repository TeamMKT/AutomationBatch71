package classPrograms;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class CheckOption 
{
	public static void main(String[] args) 
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		
		page.navigate("file:///C:/Users/MKT/Desktop/PlaywrightAutomationHTML.html");
		page.locator("#boy").check();
		page.waitForTimeout(2000);
		page.locator("#boy").uncheck();
		page.waitForTimeout(2000);
		page.locator("#male").check();

	}
}
