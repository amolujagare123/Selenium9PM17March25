package TestNGDemo.DemoReal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class JobSites  extends Base  {



    @Test
    public void naukri() {
        driver.get("https://www.naukri.com");
        Assert.assertEquals(driver.getTitle(),"Naukri site","wrong page");
    }

    @Test
    public void monster() {
        driver.get("https://www.monsterindia.com");
    }

    @Test
    public void indeed() {
        driver.get("https://www.indeed.com");
    }

    @Test
    public void glassdoor() {
        driver.get("https://www.glassdoor.com");
    }


}
