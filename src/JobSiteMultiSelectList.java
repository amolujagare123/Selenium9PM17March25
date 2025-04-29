import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JobSiteMultiSelectList {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.click.in/pune/60/post.html");

        // 1. find the web element
        WebElement jobLocation = driver.findElement(By.id("source_118"));

        //2. create the object of Select class
        Select jobLocationSelect = new Select(jobLocation);


        //3. select from the list
        jobLocationSelect.selectByVisibleText("Bangalore");
        jobLocationSelect.selectByIndex(2);
        jobLocationSelect.selectByValue("3");
        Thread.sleep(2000);

        // click on add button
        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[1]")).click();
// ------------------------------------------------------------------

        WebElement jobLocationSelected = driver.findElement(By.id("fld_118"));
        Select selected = new Select(jobLocationSelected);
        selected.selectByIndex(1);
        selected.selectByIndex(2);

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"post_form\"]/div[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/img[2]")).click();

    }
}
