package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryClass implements IRetryAnalyzer {
	int counter = 0;
	int retryLimit = 2;//max no of retry

	public boolean retry(ITestResult result) {

		if (counter < retryLimit) {
			counter++;
			return true;//retry 
		}
		return false;//do not retry
	}

}
