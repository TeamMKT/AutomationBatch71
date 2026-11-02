package learning.AB71_PW;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class JSAMLinkClickJavaScript
{
	public static void main(String[] args) 
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		page.onDialog(dialog->
		{
			dialog.accept();
		});
	//	page.waitForTimeout(5000);

		page.navigate("file:///C:/Users/MKT/Desktop/learningHTML1.html");
		page.waitForTimeout(5000);
		page.locator("//a").click();

	}
}
