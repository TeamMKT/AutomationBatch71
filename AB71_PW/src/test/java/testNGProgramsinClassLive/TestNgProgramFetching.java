package testNGProgramsinClassLive;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;

import io.github.cdimascio.dotenv.Dotenv;

public class TestNgProgramFetching
{
	@Test
	public void method1()
	{
		Dotenv dotenv=Dotenv.load();
		String value=	dotenv.get("BROWSER");
		
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		
		page.navigate("https://www.amazon.in");
	//	page.getByRole(AriaRole.SEARCHBOX).fill("Toys");
		page.locator("input[id^='two']").fill(value);
		page.waitForTimeout(4000);

	}
}
