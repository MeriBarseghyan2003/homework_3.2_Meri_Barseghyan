package tests;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

public class ScreenshotListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        Object testClass = result.getInstance();
        WebDriver driver = ((BaseTest) testClass).driver;
        if (driver instanceof TakesScreenshot) {
            TakesScreenshot tsDriver = (TakesScreenshot) driver;
            byte[] screenshot = tsDriver.getScreenshotAs(OutputType.BYTES);
        }
    }
}
