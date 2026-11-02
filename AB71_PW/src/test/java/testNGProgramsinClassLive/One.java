package testNGProgramsinClassLive;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;

public class One
{
	@Test
	public void method1()
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		
		page.navigate("https://www.amazon.in");
	//	page.locator("#searchDropdownBox").selectOption("Books");
	//	page.locator("#searchDropdownBox").selectOption(new SelectOption().setIndex(3));
		page.locator("#searchDropdownBox").selectOption(new SelectOption().setValue("search-alias=lawngarden"));
		page.waitForTimeout(4000);	

	}
}
