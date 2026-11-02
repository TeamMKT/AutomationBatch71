package BaseTestConcept;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer
{
	int initialCount=0;
	int retryCount=3;
	@Override
	public boolean retry(ITestResult result)
	{
		if(initialCount<retryCount)//0<1->yes,1<1-false
		{
			initialCount++;
			return true;//true means lets retry
		}

		return false;//if its false it mean dont retry at all
		//retrun true-it means keep retrying infinite times
	}
	
	
	
}
