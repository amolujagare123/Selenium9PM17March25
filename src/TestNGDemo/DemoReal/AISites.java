package TestNGDemo.DemoReal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class AISites extends Base {


    @Test
    public void openai() {
        driver.get("https://www.openai.com");
    }

    @Test
    public void huggingface() {
        driver.get("https://huggingface.co");
    }

    @Test
    public void deepmind() {
        driver.get("https://www.deepmind.com");
    }

    @Test
    public void anthropic() {
        driver.get("https://www.anthropic.com");
    }


}

