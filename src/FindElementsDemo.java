import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/4fields.html");

       /* WebElement wb = driver.findElement(By.tagName("input"));
        wb.sendKeys("test data");*/


      List<WebElement> wbList  = driver.findElements(By.tagName("input"));

      System.out.println("size="+wbList.size());

        wbList.get(0).sendKeys("muskan");
        wbList.get(1).sendKeys("muskan@gmail.com");
        wbList.get(2).sendKeys("4343434");
        wbList.get(3).sendKeys("pune");

       // driver.findElement(By.tagName("button")).click();

    }
    }
