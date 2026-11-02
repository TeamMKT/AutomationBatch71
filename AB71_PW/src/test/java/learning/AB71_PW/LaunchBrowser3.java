package learning.AB71_PW;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LaunchBrowser3 
{
	public static void main(String[] args) 
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		
		page.navigate("https://www.google.com");
	}
}
