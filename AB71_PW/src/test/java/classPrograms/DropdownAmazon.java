package classPrograms;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;

public class DropdownAmazon 
{
	public static void main(String[] args) 
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		
		page.navigate("https://www.amazon.in");
		//page.locator("#searchDropdownBox").selectOption("Apps & Games");
		//page.locator("#searchDropdownBox").selectOption(new SelectOption().setValue("search-alias=stripbooks"));

		page.locator("#searchDropdownBox").selectOption(new SelectOption().setIndex(5));

	}
}
