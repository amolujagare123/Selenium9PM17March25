package ReportsDemo.ExtentReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

import static ReportsDemo.util.ForExtentReports.screenshot;

public class LoginTest {
    ExtentReports extent;
    @BeforeClass
    public void initExtent()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports\\report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setDocumentTitle("Stock Management System");
        reporter.config().setReportName("Regression Testing Report");

        extent.setSystemInfo("Developed By","Vijay");
        extent.setSystemInfo("Tested By","Seema");
        extent.setSystemInfo("Test environment","Dev");
        extent.setSystemInfo("Project Start Date","12 Feb 2025");
        extent.setSystemInfo("Sprint version","v1.023");
    }

    @AfterClass
    public void writeToReport()
    {
        extent.flush();
    }

    @Test
    public void myTest1() throws InterruptedException, IOException {

        ExtentTest test = extent.createTest("valid login Test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        test.info("Url is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        test.info("Username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin1");

        test.info("Password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("Login button is clicked");



       String expected = "Dashboard";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//a[@class='active-tab dashboard-tab']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        try {
            Assert.assertEquals(actual, expected, "This is not a Dashboard");
            test.pass("this test is paased");
        }
        catch (AssertionError e)
        {
            test.fail("this test is failed"+e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+screenshot(driver));
        }

    }

    @Test
    public void myTest2() throws InterruptedException, IOException {

        ExtentTest test = extent.createTest("invalid login Test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        test.info("Url is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        test.info("Username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin1");

        test.info("Password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("Login button is clicked");



        String expected = "Wrong Username or Password";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        try {
            Assert.assertEquals(actual, expected, "incorrect or no error message");
            test.pass("this test is paased");
        }
        catch (AssertionError e)
        {
            test.fail("this test is failed"+e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+screenshot(driver));
        }

    }

    @Test
    public void myTest3() throws InterruptedException, IOException {

        ExtentTest test = extent.createTest("blank login Test");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        test.info("Url is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        test.info("Username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        test.info("Password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("Login button is clicked");

        String expected = "https://stock.scriptinglogic.in/";
        String actual = driver.getCurrentUrl();


        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        try {
            Assert.assertEquals(actual, expected, "incorrect or no error message");
            test.pass("this test is paased");
        }
        catch (AssertionError e)
        {
            test.fail("this test is failed"+e.getMessage());
            test.addScreenCaptureFromPath("./screenshots/"+screenshot(driver));
        }

    }
}
