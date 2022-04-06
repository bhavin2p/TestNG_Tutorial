package listenerExample;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("testcases started and testcase details are : " +result.getName());
		}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("testcases success and testcase details are : " +result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("testcases failed and testcase details are : " +result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("testcases skiped and testcase details are : " +result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
