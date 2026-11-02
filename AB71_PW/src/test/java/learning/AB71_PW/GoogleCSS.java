package learning.AB71_PW;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class GoogleCSS
{
	public static void main(String[] args) 
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		
		page.navigate("https://www.google.com");
	//	page.locator("#ti6dpd").fill("India");
	//	page.locator(".gLFyf").fill("India");
	//	page.locator("textarea.gLFyf").fill("India");
	//	page.locator("textarea#ti6dpd").fill("India");
	//	page.locator("textarea.gLFyf[name='q']").fill("India");
		page.locator("textarea[name='q'][id='ti6dpd']").fill("India");
		
		
	}
}
