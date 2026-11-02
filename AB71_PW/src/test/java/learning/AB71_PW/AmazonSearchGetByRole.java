package learning.AB71_PW;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class AmazonSearchGetByRole
{
	public static void main(String[] args) 
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		
		page.navigate("https://www.amazon.in");
		page.getByRole(AriaRole.SEARCHBOX, new GetByRoleOptions().setName("Search Amazon.in")).fill("Books");
		page.getByRole(AriaRole.SEARCHBOX, new GetByRoleOptions().setName("Search Amazon.in")).press("Enter");

	}
}
