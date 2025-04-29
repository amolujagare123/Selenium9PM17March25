import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://blazedemo.com/");

        // 1. find the web element
        WebElement formPortDrpDN = driver.findElement(By.name("fromPort"));

        //2. create the object of Select class
        Select selText = new Select(formPortDrpDN);

        Thread.sleep(4000);

        //3. select from the dropdown
       // selText.selectByVisibleText("Philadelphia");
        //selText.selectByIndex(2);
        selText.selectByValue("Portland");
    }
}
