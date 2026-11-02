package learning.AB71_PW;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import io.github.cdimascio.dotenv.Dotenv;

public class YoutubeSearchWithDotEnvprogram
{
	public static void main(String[] args) 
	{
		Dotenv d1=		Dotenv.load();
		String URL=	d1.get("URL");
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext bc=				browser.newContext(new Browser.NewContextOptions().setRecordVideoDir(Paths.get("C:\\Users\\MKT\\eclipse-workspace\\AB71_PW\\test-output\\Videos\\q")));
		Page page=		bc.newPage();
		
		page.navigate(URL);
			
		browser.close();

	
	}
}
