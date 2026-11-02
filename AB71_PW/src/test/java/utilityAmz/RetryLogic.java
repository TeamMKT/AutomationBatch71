package utilityAmz;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer
{
	private int initialCount=0;
	private int retryCount=2;
	@Override
	public boolean retry(ITestResult result) 
	{
		if(initialCount<retryCount)  //0<2
		{
			initialCount++;//2->
			return true;

		}
		
		
		return true;
	}

}
