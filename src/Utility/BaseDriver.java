package Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BaseDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;

    static {
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static void tearDown() {
        MyFunc.Wait(2);
        driver.quit();
    }
}
/**
// Bu class içerisinde değişiklik yapmıyoruz.
// Testlerimizin sonunda tearDown u kullanıyoruz.(bekle ve kapat komutu birlikte olduğu için)
 */
