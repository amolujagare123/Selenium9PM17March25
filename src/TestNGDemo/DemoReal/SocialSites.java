package TestNGDemo.DemoReal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SocialSites  extends Base {



    @Test(priority = 4)
    public void facebook() {
        driver.get("https://www.facebook.com");
    }

    @Test(priority = 1)
    public void instagram() {
        driver.get("https://www.instagram.com");
    }

    @Test(priority = 2)
    public void twitter() {
        driver.get("https://www.twitter.com");
    }

    @Test(priority = 3)
    public void linkedin() {
        driver.get("https://www.linkedin.com");
    }


}

