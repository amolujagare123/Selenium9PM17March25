import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathOfDataTable1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://editor.datatables.net/examples/inline-editing/fullRow.html");
       // driver.findElement(By.xpath("//tr[td[text()='Angelica']]//i[@class='fa fa-pencil']")).click();
        //driver.findElement(By.xpath("//tr[td[text()='Bruno']]//span[@i='fa fa-trash']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//tr[td[text()='Angelica']]//input")).click();

    }

}
