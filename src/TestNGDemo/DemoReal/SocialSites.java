package TestNGDemo.DemoReal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SocialSites {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void facebook() {
        driver.get("https://www.facebook.com");
    }

    @Test
    public void instagram() {
        driver.get("https://www.instagram.com");
    }

    @Test
    public void twitter() {
        driver.get("https://www.twitter.com");
    }

    @Test
    public void linkedin() {
        driver.get("https://www.linkedin.com");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

