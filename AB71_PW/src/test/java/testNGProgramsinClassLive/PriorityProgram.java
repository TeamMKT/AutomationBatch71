package testNGProgramsinClassLive;
//this topic is only from interview Prop
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;

public class PriorityProgram
{
	@Test
	public void registration()
	{
	
	}
	@Test(priority=1)
	public void login()	{
	
	}
	@Test(priority=3)
	public void logout()
	{
	
	}
	
}
//order of exec will be alphabetic order of method name