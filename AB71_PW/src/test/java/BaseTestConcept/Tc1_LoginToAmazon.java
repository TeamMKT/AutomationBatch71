package BaseTestConcept;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page.GetByRoleOptions;
import com.microsoft.playwright.options.AriaRole;

//@Listeners(ListenersLogic.class)
public class Tc1_LoginToAmazon extends BaseTest
{
	@Test//(retryAnalyzer=RetryLogic.class)
	public void withValidCredentails()
	{
		page.navigate("https://www.flipkart.com");
		page.getByRole(AriaRole.BUTTON, new GetByRoleOptions().setName("✕")).click();

	}
}
