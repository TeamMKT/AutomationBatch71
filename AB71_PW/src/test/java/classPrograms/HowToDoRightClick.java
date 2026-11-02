package classPrograms;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Locator.ClickOptions;
import com.microsoft.playwright.options.MouseButton;

public class HowToDoRightClick 
{
	public static void main(String[] args) 
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		
		page.navigate("https://www.google.com/");
		
		page.getByText("Gmail").click(new ClickOptions().setButton(MouseButton.RIGHT));
		
	}
}
