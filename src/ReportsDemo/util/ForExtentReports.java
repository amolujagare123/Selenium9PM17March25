package ReportsDemo.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForExtentReports {

    public static String screenshot(WebDriver driver) throws IOException {

        // 1. create the object reference of TakesScreenshot
        // assign current driver to it
        // typecast driver to TakesScreenshot

        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs() using ts

        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        // 3. copy the file object into a real image file

        String timeStamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        FileUtils.copyFile(srcFile,new File("Reports\\screenshots\\"+fileName));

        return fileName;

    }

    public static ExtentReports initExtentObj()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports\\report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock Management System");
        reporter.config().setReportName("Regression Testing Report");

        extent.setSystemInfo("Developed By","Vijay");
        extent.setSystemInfo("Tested By","Seema");
        extent.setSystemInfo("Test environment","Dev");
        extent.setSystemInfo("Project Start Date","12 Feb 2025");
        extent.setSystemInfo("Sprint version","v1.023");

        return extent;
    }

}
