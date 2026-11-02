package learning.AB71_PW;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;

public class AmazonDropdown
{
	public static void main(String[] args) 
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		
		page.navigate("https://www.amazon.in");
	//	page.locator("#searchDropdownBox").selectOption("Books");
	//	page.locator("#searchDropdownBox").selectOption(new SelectOption().setIndex(3));
		page.locator("#searchDropdownBox").selectOption(new SelectOption().setValue("search-alias=lawngarden"));
		
	}
}
