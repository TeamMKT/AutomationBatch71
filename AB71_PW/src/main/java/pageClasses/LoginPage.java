package pageClasses;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage 
{
	 private Page page;

	    private Locator username;//encapsulation
	    private Locator continueButton;
	    private Locator password;
	    private Locator signinButton;
	    public LoginPage(Page page) 
	    {
	        this.page = page;

	        username = page.locator("#ap_email_login");
	        continueButton = page.locator("#continue");
	        password = page.locator("#ap_password");
	        signinButton = page.locator("#signInSubmit");
	    }

	    public void EnterEmailId(String UN) {

	    	username.fill(UN);
	   
	    }

	    public void ClickOnContinue() {

	    	continueButton.click();
	    }
	    public void EnterPassword(String PWD) {

	    	password.fill(PWD);
	   
	    }

	    public void ClickOnSigin() {

	    	signinButton.click();
	    }
}
