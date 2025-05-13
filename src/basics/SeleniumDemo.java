package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://gmail.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.navigate().to("http://facebook.com");
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
    }
}
