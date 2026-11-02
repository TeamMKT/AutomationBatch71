package learning.AB71_PW;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LoginToAmazonWIthParameters
{
	Playwright playwright;
	Browser browser;
	BrowserContext browsercontext;
	Page page;
	@Parameters("engine")
	@Test
	public  void addToCart(String nameOfEngine) 
	{
		if(nameOfEngine.equalsIgnoreCase("chromium"))
		{
		 playwright=			Playwright.create();
		 browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		 browsercontext=	browser.newContext();
		 page=	browsercontext.newPage();
		}
		if(nameOfEngine.equalsIgnoreCase("webkit"))
		{
		 playwright=			Playwright.create();
		 browser=	playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
		 browsercontext=	browser.newContext();
		 page=	browsercontext.newPage();
		}
		if(nameOfEngine.equalsIgnoreCase("firefox"))
		{
		 playwright=			Playwright.create();
		 browser=	playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		 browsercontext=	browser.newContext();
		 page=	browsercontext.newPage();
		}
		page.navigate("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		page.reload();
		page.locator("#ap_email_login").fill("mkumarban@gmail.com");
		page.locator("#continue").click();
		page.locator("#ap_password").fill("manbid!@#");
		page.locator("#signInSubmit").click();
		}
}
