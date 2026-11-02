package classPrograms;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;

public class PassportDropdown 
{
	public static void main(String[] args) 
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		
		page.navigate("https://services1.passportindia.gov.in/forms/registration");
	//	page.getByText("Passport Office").click();
		page.getByText("Passport Office", new Page.GetByTextOptions().setExact(true)).click();

	//	page.locator("select").selectOption("Bengaluru");
	//	page.locator("select").selectOption(new SelectOption().setIndex(5));
		page.locator("select").selectOption(new SelectOption().setValue("26"));
	
		
	}
}
