package BaseTestConcept;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.options.AriaRole;

public class Tc3_LoginSearchingLogout extends BaseTest
{
	@Test//(retryAnalyzer=RetryLogic.class)
	public void loginSearchingLogout()
	{
		page.navigate("https://www.flipkart.com");
		page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("✕")).click();

		page.getByRole(AriaRole.TEXTBOX,new GetByRoleOptions().setName("Search for Products, Brands and More")).fill("shoe");		
	//	page.getByRole(AriaRole.TEXTBOX,new GetByRoleOptions().setName("manish kumar tiwari")).press("Enter");		

	}
}
