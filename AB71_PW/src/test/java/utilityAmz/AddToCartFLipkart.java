package utilityAmz;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import java.nio.file.Paths;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;
public class AddToCartFLipkart 

{
	
	Playwright playwright=			Playwright.create();
	Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	BrowserContext browsercontext=	browser.newContext();
	Page page=	browsercontext.newPage();


	
	@Test
    public void test()
    {
    page.navigate("https://www.flipkart.com/");
   System.out.println( page.title());
  //  assertThat(page).hasTitle("Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com");
    page.waitForTimeout(3000);
    page.getByText("✕").click();
    page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Search for Products, Brands"))
       .fill("toys");
    page.keyboard().press("Enter");
    page.waitForTimeout(3000);

    Page page1=browsercontext.waitForPage(() -> 
    
   { page.locator("(//a[@class='GnxRXv'])[1]").click();
   }
   );
    
    Locator l1 = page1.getByText("Add to cart", 
            new Page.GetByTextOptions().setExact(true));
   boolean b1=	l1.isEnabled();
   boolean b2=	l1.isVisible();
   int size=	l1.count();
   System.out.println(size);
   System.out.println(b1);
   System.out.println(b2);
   if(b1 && b2)
   {
	   l1.click();
   }
   page1.waitForTimeout(3000);
   Locator textassertion=	page1.getByText("GO TO CART");
   assertThat(textassertion).hasText("GO TO CART");
   page1.screenshot(new Page.ScreenshotOptions().setFullPage(true).setPath(Paths.get("C:\\Users\\MKT\\eclipse-workspace\\AB71_PW\\test-output\\shot.png")));


}}
