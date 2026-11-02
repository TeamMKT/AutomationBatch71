package classPrograms;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LoginToAmazonWithManyInputs 
{
	
	@DataProvider()
	public Object loginData()
	{
		Object [][]d1=new Object[5][2];
		//1st row
		d1[0][0]="stbymkt@gmail.com";
		d1[0][1]="";
//2nd row
		d1[1][0]="stbymkt@gmail.com";
		d1[1][1]="";
//3rd row
		d1[2][0]="stbymkt@gmail.com";
		d1[2][1]="";
//4th row
		d1[3][0]="stbymkt@gmail.com";
		d1[3][1]="";
//5th row
		d1[4][0]="stbymkt@gmail.com";
		d1[4][1]="";
		return d1;
		
	}
	@Test(dataProvider="loginData")
	public void loginWIthDifferentData(String UN,String PWD)
	{
		Playwright playwright=			Playwright.create();
		Browser browser=	playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=		browser.newPage();
		
		page.navigate("https://www.amazon.in/ap/signin?openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259813593%26hvpone%3D%26hvptwo%3D%26hvadid%3D815461296140%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D6219535317592849043%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062047%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2462829%26mcid%3De9c68a2d0f333bcaacd29ec00843c329%26hvocijid%3D6219535317592849043--%26hvexpln%3Dnav%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		page.locator("#ap_email_login").fill(UN);
		page.locator("#continue").click();
		page.locator("#ap_password").fill(PWD);
		page.locator("#signInSubmit").click();
		page.waitForTimeout(3000);
	//	page.getByText("Account & Lists").hover();
	//	page.getByText("Sign Out").click();
	//	Locator message=	page.getByText("Sign in or create account");
	
	}
	
	
	
}
