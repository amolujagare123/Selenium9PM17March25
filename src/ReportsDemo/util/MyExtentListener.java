package ReportsDemo.util;

import TestNGDemo.DemoReal.Base;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static ReportsDemo.util.ForExtentReports.initExtentObj;
import static ReportsDemo.util.ForExtentReports.screenshot;

public class MyExtentListener extends Base implements ITestListener {

    ExtentReports extent;
    ExtentTest test;

    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart");
        test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess");
        test.pass("this test is passed");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure");
        test.fail("this test is failed: "+result.getThrowable());
        try {
            test.addScreenCaptureFromPath("./screenshots/"+screenshot(driver));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped");
    }


    public void onStart(ITestContext context) {
        System.out.println("onStart");

        if(extent==null)
          extent = initExtentObj();

    }

    public void onFinish(ITestContext context) {
        System.out.println("onFinish");
        extent.flush();
    }
}
