import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US_204 extends BaseDriver {

    @Test
    public void loginPositive(){

        String emailStr="Auser@gmail.com";
        String passwordStr="Earnq123**";

        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Wait(1);
        Actions actions=new Actions(driver);

        WebElement logIn=driver.findElement(By.cssSelector("[class='ico-login']"));
        actions.click(logIn).build().perform();
        MyFunc.Wait(1);

        WebElement email=driver.findElement(By.cssSelector("[class='email']"));
        email.sendKeys(emailStr);
        MyFunc.Wait(1);

        WebElement password=driver.findElement(By.cssSelector("[class='password']"));
        password.sendKeys(passwordStr);
        MyFunc.Wait(1);

        WebElement logInClick=driver.findElement(By.xpath("(//div[@class='buttons'])[3]//input"));
        actions.click(logInClick).build().perform();

        WebElement logInControl=driver.findElement(By.xpath("(//a[@class='account'])[1]"));
        Assert.assertTrue("Giriş başarısız...",logInControl.getText().contains("Auser"));

        tearDown();
    }
}
