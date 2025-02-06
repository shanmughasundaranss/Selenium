import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Test_Listners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped: " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // Not required
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test suite started");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test suite finished");
    }
}