package BaseTestConcept;

import java.nio.file.Paths;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseTest extends ListenersLogic
{
	public   Playwright playwright;//instance Variable
	public  Browser browser;//instance Variable
	public BrowserContext browsercontext;//instance Variable
	public Page page;//instance Variable
	@Parameters("Engine")
	@BeforeMethod
	public void launch(String nameOfBrowserEngine)//Local
	{
		if(nameOfBrowserEngine.equals("chromium"))
		{
		 playwright=			Playwright.create();
		browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		browsercontext=	browser.newContext();
//		browsercontext.tracing().start(new Tracing.StartOptions().setScreenshots(true).setSnapshots(true).setSources(true));
		page = browsercontext.newPage();		
		}
		if(nameOfBrowserEngine.equals("firefox"))
		{
		 playwright=			Playwright.create();
		browser=	playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		browsercontext=	browser.newContext();
//		browsercontext.tracing().start(new Tracing.StartOptions().setScreenshots(true).setSnapshots(true).setSources(true));
		page = browsercontext.newPage();		
		}
		if(nameOfBrowserEngine.equals("webkit"))
		{
		 playwright=			Playwright.create();
		browser=	playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
		browsercontext=	browser.newContext();
//		browsercontext.tracing().start(new Tracing.StartOptions().setScreenshots(true).setSnapshots(true).setSources(true));
		page = browsercontext.newPage();		
		}
		
	
	}
	@AfterMethod
	public void quit()
	{
	//a	browsercontext.tracing().stop(new Tracing.StopOptions().setPath(Paths.get("test-output/Tracing/trace+"+Math.random()+".zip")));
		browsercontext.close();

		browser.close();
		playwright.close();

	}
}
