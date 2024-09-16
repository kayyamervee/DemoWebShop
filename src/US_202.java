import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US_202 extends BaseDriver {
    //Todo : Testi çalıştırmak ve doğru sonuç almak için daha öncesinde kaydı bulunan e-mail kullanmalısınız :)

    @Test
    public void negativeRegisterUserTest(){

        String firstname="Team6";
        String lastname="Group";
        String email="bootcamp@gmail.com";
        String password="team61234";

        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Wait(2);
        Actions actions=new Actions(driver);

        WebElement registerButton=driver.findElement(By.xpath("(//div[@class='header-links']//a)[1]"));
        actions.moveToElement(registerButton).click().build().perform();
        MyFunc.Wait(2);

        WebElement genderMale=driver.findElement(By.xpath("(//div[@class='gender']//input)[1]"));
        actions.moveToElement(genderMale).click().build().perform();
        MyFunc.Wait(2);

        WebElement firstName=driver.findElement(By.cssSelector("[name='FirstName']"));
        actions.moveToElement(firstName).click().sendKeys(firstname).build().perform();
        MyFunc.Wait(2);

        WebElement lastName=driver.findElement(By.cssSelector("[name='LastName']"));
        actions.moveToElement(lastName).click().sendKeys(lastname).build().perform();
        MyFunc.Wait(2);

        WebElement emailButton=driver.findElement(By.cssSelector("[name='Email']"));
        actions.moveToElement(emailButton).click().sendKeys(email).build().perform();
        MyFunc.Wait(2);

        WebElement passwordButton=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        actions.moveToElement(passwordButton).click().sendKeys(password).build().perform();
        MyFunc.Wait(2);

        WebElement confirmPassword=driver.findElement(By.cssSelector("[name='ConfirmPassword']"));
        actions.moveToElement(confirmPassword).click().sendKeys(password).build().perform();
        MyFunc.Wait(2);

        WebElement register=driver.findElement(By.cssSelector("[name='register-button']"));
        actions.moveToElement(register).click().build().perform();
        MyFunc.Wait(2);

        WebElement errorMessage=driver.findElement(By.xpath("//div[@class='message-error']//ul//li"));
        Assert.assertTrue("Kaydınız başarıyla gerçekleşmiştir.", errorMessage.getText().contains("The specified email already exists"));

        tearDown();
    }
}
