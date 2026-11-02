package classPrograms;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightIframe 
{
	public static void main(String[] args) 
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		
		page.navigate("https://grotechminds.com/");
		Locator l1=	page.locator("#chat-bot-launcher-button");
		l1.click();
		FrameLocator fc=	page.frameLocator("#chat-bot-iframe");
		
		fc.getByPlaceholder("Type an answer").fill("Ramcharan");
		
		
	}
}
