import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Test_Listners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        Reporter.log("Test started: " + result.getName(), true);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Reporter.log("Test passed: " + result.getName(), true);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Reporter.log("Test failed: " + result.getName(), true);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        Reporter.log("Test skipped: " + result.getName(), true);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Not required
    }

    @Override
    public void onStart(ITestContext context) {
        Reporter.log("Test suite started: " + context.getName(), true);
    }

    @Override
    public void onFinish(ITestContext context) {
        Reporter.log("Test suite finished: " + context.getName(), true);
    }
}