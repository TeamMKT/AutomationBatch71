package testCasesAmazon;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageClasses.LoginPage;
import utilityAmz.BaseTest;
import utilityAmz.ListenerLogic;
import utilityAmz.RetryLogic;
@Listeners(ListenerLogic.class)
public class LoginToAmazon extends BaseTest
{
	@Test(retryAnalyzer=RetryLogic.class)
	public void withValidCredentails()
	{
		LoginPage loginpage=new LoginPage(page);
		loginpage.EnterEmailId("mkumarban@gmail.com");
		loginpage.ClickOnContinue();
																																				loginpage.EnterPassword("Sunita0309!@#");
		loginpage.ClickOnSigin();
		assertThat(page).hasTitle("Welcome");

	}
}
