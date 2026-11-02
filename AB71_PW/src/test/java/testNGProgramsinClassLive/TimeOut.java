package testNGProgramsinClassLive;
//this topic is only from interview Prop
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.options.AriaRole;
import com.microsoft.playwright.options.SelectOption;

public class TimeOut
{
	@Test(timeOut=4000)
	public void hi()
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		
		page.navigate("https://www.flipkart.com");
		page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("✕")).click();

		page.getByRole(AriaRole.TEXTBOX,new GetByRoleOptions().setName("Search for Products, Brands and More")).fill("shoe");		
	

	}
	
	
}
//order of exec will be alphabetic order of method name