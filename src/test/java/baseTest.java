import browser.Browser;
import browser.Info;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class baseTest {
    WebDriver driver;
    @Test
    public void test01(){
        driver= Browser.getDriver();
driver.navigate().to(Info.URL);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
