package JunitDemo;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo3 {

    static WebDriver driver;

    @BeforeClass // this method will run before first test of the class
    public static void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass // this method will run after last test of the class
    public static void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void myTest1() throws InterruptedException {


        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
      //  btnLogin.click();

    }

    @Test
    public void myTest2() throws InterruptedException {


        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("dsdsd");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("sdsd");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

    }

    @Test
    public void myTest3() throws InterruptedException {


        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

    }
}
