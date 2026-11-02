package learning.AB71_PW;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class AmazonCart_paymentPageAssert
{
	@Test
	public static void addToCart() 
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browsercontext=	browser.newContext();
		Page page=	browsercontext.newPage();
		
		page.navigate("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		page.reload();
		page.locator("#ap_email_login").fill("mkumarban@gmail.com");
		page.locator("#continue").click();
		page.locator("#ap_password").fill("Rihu0309!@#");
		page.locator("#signInSubmit").click();
		page.waitForTimeout(3000);
		page.getByRole(AriaRole.SEARCHBOX).fill("Toys");
		page.locator("//input[@id='nav-search-submit-button']").click();
		
		Page page1=	browsercontext.waitForPage(()->  //this is moving the control to the new tab
		
		page.locator("(//a[@class='a-link-normal s-no-outline'])[1]").click()
				);

		page1.locator("#add-to-cart-button").click();
		page1.waitForTimeout(4000);
		page1.locator("//input[@value='Proceed to checkout']").click();
		page1.waitForTimeout(6000);

		Assert.assertEquals(page1.title(),"Place Your Order - Amazon Checkout");
		page1.waitForTimeout(3000);
	}
}
