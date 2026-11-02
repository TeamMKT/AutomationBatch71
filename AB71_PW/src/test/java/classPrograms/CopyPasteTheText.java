package classPrograms;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class CopyPasteTheText 
{
	public static void main(String[] args) 
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		
		page.navigate("https://grotechminds.com/registeration-form/");
		Locator Fname=	page.locator("#firstName");
		Fname.fill("Roshan");
		page.keyboard().press("Control+A");
		page.keyboard().press("Control+C");
		Locator Lname=	page.locator("#lastName");
		Lname.click();
		page.keyboard().press("Control+V");



	}
}
