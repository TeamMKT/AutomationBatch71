package BaseTestConcept;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.options.AriaRole;

public class Tc2_LoginToAmazonAndLogout extends BaseTest{
	@Test//(retryAnalyzer=RetryLogic.class)
	public void withValidCredentails_Logout()
	{
		page.navigate("https://www.flipkart.com");
		page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("✕")).click();

		page.getByRole(AriaRole.TEXTBOX,new GetByRoleOptions().setName("Search for Products, Brands and More")).fill("Mobiles");		
		page.getByRole(AriaRole.TEXTBOX,new GetByRoleOptions().setName("Search for Products, Brands and More")).press("Enter");		

	}
}
