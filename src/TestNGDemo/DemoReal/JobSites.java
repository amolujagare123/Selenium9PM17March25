package TestNGDemo.DemoReal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class JobSites {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void naukri() {
        driver.get("https://www.naukri.com");
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

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
