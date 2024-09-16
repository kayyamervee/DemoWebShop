import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;

public class US_201 extends BaseDriver {

    @Test
    public void positiveRegisterUserTest(){
        String firstname="Team6";
        String lastname="Group";
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
        actions.moveToElement(emailButton).click().sendKeys("team"+((int)Math.random()*10000)+"@gmail.com").build().perform();
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

        WebElement confirmationMessage=driver.findElement(By.xpath("//div[@class='result']"));
        Assert.assertTrue("Kaydınız oluşturalamadı, lütfen tekrar deneyiniz", confirmationMessage.getText().contains("completed"));

        tearDown();
    }
}
