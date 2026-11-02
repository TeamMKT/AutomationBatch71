package learning.AB71_PW;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;

public class TracingPlaywright 
{
	public static void main(String[] args) 
	{
		Playwright playwright = Playwright.create();

		Browser browser = playwright.chromium().launch(
		    new BrowserType.LaunchOptions()
		        .setHeadless(false)
		);

		BrowserContext context = browser.newContext();

		Page page = context.newPage();

		context.tracing().start(
		    new Tracing.StartOptions()
		        .setScreenshots(true)
		        .setSnapshots(true)
		        .setSources(true)
		);

		page.navigate("https://google.com");

		page.getByText("Gmail").click();

		context.tracing().stop(
		    new Tracing.StopOptions()
		        .setPath(Paths.get("C:\\Users\\MKT\\eclipse-workspace\\AB71_PW\\test-output\\Tracing\\trace.zip"))
		);

		context.close();
		browser.close();
		playwright.close();
	
	}
}
