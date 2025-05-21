package TestNGDemo.AssertionDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LoginDemo1 {

    @Test
    public void myTest1() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin1");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

       /* String expected = "https://stock.scriptinglogic.in/dashboard.php";
        String actual = driver.getCurrentUrl();*/

      /*  String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();*/

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

        Assert.assertEquals(actual,expected,"This is not a Dashboard");

    }

    @Test
    public void myTest2() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

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

        Assert.assertEquals(actual,expected,"incorrect or no error message");
    }

    @Test
    public void myTest3() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

    }

    @Test
    public void addClientTest()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        //   driver.findElement(By.linkText("Add Customer")).click();

        driver.findElement(By.partialLinkText("Add Cu")).click();

      /*  driver.findElement(By.name("name")).sendKeys("sonali");
        driver.findElement(By.name("address")).sendKeys("ambegaon,nahre");
        driver.findElement(By.name("contact1")).sendKeys("45454545");
        driver.findElement(By.name("contact2")).sendKeys("45454545");*/

        driver.findElement(By.name("Submit")).click();

        String expected = "Please enter a Customer Name".toUpperCase();
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//label[@for='name']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no error message");

    }

    @Test
    public void addClientTest2()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        //   driver.findElement(By.linkText("Add Customer")).click();

        driver.findElement(By.partialLinkText("Add Cu")).click();

      /*  driver.findElement(By.name("name")).sendKeys("sonali");
        driver.findElement(By.name("address")).sendKeys("ambegaon,nahre");*/
        driver.findElement(By.name("contact1")).sendKeys("12");
        driver.findElement(By.name("contact2")).sendKeys("23");

        driver.findElement(By.name("Submit")).click();



        String expected1 = "Please enter a Customer Name".toUpperCase();
        String expected2 = "Please enter at least 3 characters.".toUpperCase();
        String expected3 = "Please enter at least 3 characters.".toUpperCase();

        ArrayList<String> expected = new ArrayList<>();
        expected.add(expected1);
        expected.add(expected2);
        expected.add(expected3);

        ArrayList<String> actual = new ArrayList<>();
        try {
            List<WebElement> wbList = driver.findElements(By.xpath("//*[@class='error']"));
            actual.add(wbList.get(0).getText());
            actual.add(wbList.get(1).getText());
            actual.add(wbList.get(2).getText());
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no error message");


    }

    @Test
    public void addClientTest3()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        //   driver.findElement(By.linkText("Add Customer")).click();

        driver.findElement(By.partialLinkText("Add Cu")).click();

        String name = "Sonali23";

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys("ambegaon,nahre");
        driver.findElement(By.name("contact1")).sendKeys("45454545");
        driver.findElement(By.name("contact2")).sendKeys("45454545");

        driver.findElement(By.name("Submit")).click();

        String expected = "[ "+name+" ] Customer Details Added !";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no error message");

    }

    @Test
    public void addClientTest4()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        //   driver.findElement(By.linkText("Add Customer")).click();

        driver.findElement(By.partialLinkText("Add Cu")).click();

        String name = "Sonali24";

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys("ambegaon,nahre");
        driver.findElement(By.name("contact1")).sendKeys("45454545");
        driver.findElement(By.name("contact2")).sendKeys("45454545");

        driver.findElement(By.name("Submit")).click();

        String expected = "Customer Details Added";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertTrue(actual.contains(expected),"incorrect or no error message");

    }
}
