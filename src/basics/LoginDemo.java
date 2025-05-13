package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) throws InterruptedException {

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

        driver.findElement(By.name("name")).sendKeys("sonali");
        driver.findElement(By.name("address")).sendKeys("ambegaon,nahre");
        driver.findElement(By.name("contact1")).sendKeys("45454545");
        driver.findElement(By.name("contact2")).sendKeys("45454545");

        driver.findElement(By.name("Submit")).click();



    }
}
