import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuitDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://google.com");

        Thread.sleep(4000);

       // driver.close(); // close will close the current window
       driver.quit(); // quit will close all the windows opened by driver

    }
}
