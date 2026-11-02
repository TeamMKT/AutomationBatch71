package learning.AB71_PW;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class AmazonSearchAndClickOn1stOne_AddToCartassertThat
{
	@Test
	public static void addToCart() 
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext browsercontext=	browser.newContext();
		Page page=	browsercontext.newPage();
		
		page.navigate("https://www.amazon.in");
		page.reload();
		page.getByRole(AriaRole.SEARCHBOX).fill("Toys");
		page.locator("//input[@id='nav-search-submit-button']").click();
		
		Page page1=	browsercontext.waitForPage(()->  //this is moving the control to the new tab
		
		page.locator("(//a[@class='a-link-normal s-no-outline'])[1]").click()
				);
		page.waitForLoadState();

		page1.locator("#add-to-cart-button").click();
		Locator message=	page1.locator("//div[@id='NATC_SMART_WAGON_CONF_MSG_SUCCESS']/h1");
	//	String actualbehvaviour=	message.innerText();
		assertThat(message).hasText(" Added to cart");
	}
}
