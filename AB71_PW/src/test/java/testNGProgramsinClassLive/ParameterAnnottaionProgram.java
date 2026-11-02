package testNGProgramsinClassLive;

import java.nio.file.Paths;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class ParameterAnnottaionProgram 
{
	@Test
	public void searching()
	{
	
	Playwright playwright=			Playwright.create();
	Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	BrowserContext bc=	browser.newContext(new Browser.NewContextOptions().setRecordVideoDir(Paths.get("C:\\Users\\MKT\\eclipse-workspace\\AB71_PW\\test-output\\Videos")));

	Page page=		bc.newPage();
	
	page.navigate("https://www.flipkart.com");
	page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("✕")).click();
	page.getByRole(AriaRole.TEXTBOX,new GetByRoleOptions().setName("Search for Products, Brands and More")).fill("shoe");		
	page.getByRole(AriaRole.TEXTBOX,new GetByRoleOptions().setName("Search for Products, Brands and More")).press("Enter");
	
	bc.close();
	browser.close();
	
	}
	
}
