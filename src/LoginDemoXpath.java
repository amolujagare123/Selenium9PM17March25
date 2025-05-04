import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoXpath {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='login-username']"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='login-password']"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@name='submit']"));
        btnLogin.click();

        driver.findElement(By.xpath("//a[@href='add_customer.php']")).click();

        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("sonali");
        driver.findElement(By.xpath("//*[@name='address']")).sendKeys("ambegaon,nahre");
        driver.findElement(By.xpath("//input[@name='contact1']")).sendKeys("45454545");
        driver.findElement(By.xpath("//input[@name='contact2']")).sendKeys("45454545");

        driver.findElement(By.xpath("//input[@value='Add']")).click();



    }
}
