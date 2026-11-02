package classPrograms;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class ClearMethod 
{
	public static void main(String[] args) 
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		
		page.navigate("https://www.amazon.in");
		Locator l1=	page.getByRole(AriaRole.SEARCHBOX,new GetByRoleOptions().setName("Search Amazon.in") );
		l1.fill("shoe");
		page.waitForTimeout(3000);
		l1.clear();
	}
}
