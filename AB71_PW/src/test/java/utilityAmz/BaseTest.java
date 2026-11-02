package utilityAmz;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseTest extends ListenerLogic
{

	@BeforeMethod
	public void launchbrowser()
	{
		    playwright=                        Playwright.create();
            browser=        playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            page=                browser.newPage();
           
           page.navigate("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259815513%26hvpone%3D%26hvptwo%3D%26hvadid%3D815461303151%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D9375058741913056071%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062044%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2462831%26mcid%3D4c22dcdee2bf3a71b0b832c5c4ba9c17%26hvocijid%3D9375058741913056071--%26hvexpln%3Dnav%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	}
	@AfterMethod
	public void quitbrowser()
	{
	//	driver.quit();
	}
}
