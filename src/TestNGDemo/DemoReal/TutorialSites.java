package TestNGDemo.DemoReal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TutorialSites  extends Base  {


    @Test
    public void w3schools() {
        driver.get("https://www.w3schools.com");
    }

    @Test
    public void tutorialspoint() {
        driver.get("https://www.tutorialspoint.com");
    }

    @Test
    public void geeksforgeeks() {
        driver.get("https://www.geeksforgeeks.org");
    }

    @Test
    public void javatpoint() {
        driver.get("https://www.javatpoint.com");
    }


}
