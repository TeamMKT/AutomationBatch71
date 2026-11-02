package classPrograms;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Locator.ClickOptions;
import com.microsoft.playwright.options.MouseButton;

public class NaviagteMethods 
{
	public static void main(String[] args) 
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		
		page.navigate("https://grotechminds.com/drag-and-drop/");
		page.locator("#container").dragTo(page.locator("#div2"));
		page.waitForTimeout(3000);
		page.goBack();
		page.waitForTimeout(3000);

		page.goForward();
		page.waitForTimeout(3000);
		
		page.reload();
		
		

	}
}
