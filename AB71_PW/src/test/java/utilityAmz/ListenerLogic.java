package utilityAmz;
import java.nio.file.Paths;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ListenerLogic implements ITestListener
{
	public  static Playwright playwright;
	public static Browser browser;
	public static Page page;
    @Override
    public void onTestSuccess(ITestResult result) {
            // TODO Auto-generated method stub
            ITestListener.super.onTestSuccess(result);
            
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\MKT\\eclipse-workspace\\AB71_PW\\screenshot\\Pass\\"+result.getName()+".png")));

    }

    @Override
    public void onTestFailure(ITestResult result) {
            // TODO Auto-generated method stub
            ITestListener.super.onTestFailure(result);
            
            page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\MKT\\eclipse-workspace\\AB71_PW\\screenshot\\Fail\\"+result.getName()+".png")));
            }
    }

