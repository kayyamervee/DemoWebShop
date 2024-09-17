import Utility.BaseDriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_204 extends BaseDriver {

    @Test
    public void loginPositive(){

        String emailStr="Auser@gmail.com";
        String passwordStr="Earnq123**";

        driver.get("https://demowebshop.tricentis.com/");
        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/"));

        WebElement logIn=driver.findElement(By.cssSelector("[class='ico-login']"));
        wait.until(ExpectedConditions.elementToBeClickable(logIn));
        new Actions(driver).click(logIn).build().perform();

        WebElement email=driver.findElement(By.cssSelector("[class='email']"));
        wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys(emailStr);

        WebElement password=driver.findElement(By.cssSelector("[class='password']"));
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(passwordStr);

        WebElement logInClick=driver.findElement(By.xpath("(//div[@class='buttons'])[3]//input"));
        wait.until(ExpectedConditions.elementToBeClickable(logInClick));
        new Actions(driver).click(logInClick).build().perform();

        WebElement logInControl=driver.findElement(By.xpath("(//a[@class='account'])[1]"));
        Assert.assertTrue("Giriş başarısız...",logInControl.getText().contains("Auser"));

        tearDown();
    }
}
