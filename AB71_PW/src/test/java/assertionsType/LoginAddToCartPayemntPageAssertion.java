package assertionsType;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LoginAddToCartPayemntPageAssertion
{
	@Test
	public void method1()
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browsercontext=	browser.newContext();
		Page page=	browsercontext.newPage();//first tab
	//	SoftAssert s1=new SoftAssert();
	//	s1.assertEquals(false,true,"Sorry your Assertion failed 1");
		page.navigate("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259813593%26hvpone%3D%26hvptwo%3D%26hvadid%3D815461296140%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D6219535317592849043%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062047%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2462829%26mcid%3De9c68a2d0f333bcaacd29ec00843c329%26hvocijid%3D6219535317592849043--%26hvexpln%3Dnav%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		page.waitForLoadState();
		page.locator("#ap_email_login").fill("mkumarban@gmail.com");
		page.locator("#continue").click();
																																																							page.locator("#ap_password").fill("Rihu0309!@#");
		page.locator("#signInSubmit").click();
		page.waitForTimeout(5000);
		Locator l1=	page.getByPlaceholder("Search Amazon.in");
		l1.fill("toys");
		l1.press("Enter");
		//giving birth to new tab
		Page page1=browsercontext.waitForPage(()->
		page.locator("//a[@class='a-link-normal s-no-outline']").first().click()
		);
		Locator addtocart=	page1.getByTitle("Add to Shopping Cart");
		addtocart.click();
		
		page1.waitForTimeout(2000);
		
		Locator proccedtobuy=page1.locator("//input[@name='proceedToRetailCheckout']");
		proccedtobuy.click();
		page1.waitForTimeout(6000);
		Assertion a3=new Assertion();

		a3.assertEquals(page1.title(), "Place Your Order - Amazon Checkout");
		//	s1.assertEquals(verifyMessage.innerText(), "Added to cart");
		
	//	Locator l4=	page1.locator("#a-popover-label-2");
	//		a3.assertEquals(verifyMessage.innerText(), "Added to cart");

	//	s1.assertEquals(l4.innerText(), "Add to Wish List");
		//	page.locator("//span[@class='nav-line-2 ']").hover();
		
	//	page.getByText("Sign Out").click();
	//	Locator l3=		page.getByText("Sign in or create account");
	//	Locator l3=		page.locator("//div[@id='claim-collection-container']/h1");

	//	Assertion a3=new Assertion();
	//	a3.assertEquals(l3.innerText(), "Sign in or create account");
		
	//	Assert.assertEquals(page.title(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	//	s1.assertEquals(page.title(), "offline Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Sorry your Assertion failed 2");
	//	s1.assertAll();
		
	
	}
}
