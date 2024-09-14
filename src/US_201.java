import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class US_201 extends BaseDriver {
 //Todo : Testi çalıştırmak istiyorsanız lütfen String 'email' kısmını güncelleyiniz(kullanılmayan bir email olmasına dikkat) :)

    @Test
    public void positiveRegisterUser(){
        String firstname="Team6";
        String lastname="Group";
        String email="demoweb@gmail.com";
        String password="team61234";

        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Wait(2);

        WebElement registerButton=driver.findElement(By.xpath("(//div[@class='header-links']//a)[1]"));
        registerButton.click();
        MyFunc.Wait(2);

        WebElement genderMale=driver.findElement(By.xpath("(//div[@class='gender']//input)[1]"));
        genderMale.click();
        MyFunc.Wait(2);

        WebElement firstName=driver.findElement(By.cssSelector("[name='FirstName']"));
        firstName.sendKeys(firstname);
        MyFunc.Wait(2);

        WebElement lastName=driver.findElement(By.cssSelector("[name='LastName']"));
        lastName.sendKeys(lastname);
        MyFunc.Wait(2);

        WebElement emailButton=driver.findElement(By.cssSelector("[name='Email']"));
        emailButton.sendKeys(email);
        MyFunc.Wait(2);

        WebElement passwordButton=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        passwordButton.sendKeys(password);
        MyFunc.Wait(2);

        WebElement confirmPassword=driver.findElement(By.cssSelector("[name='ConfirmPassword']"));
        confirmPassword.sendKeys(password);
        MyFunc.Wait(2);

        WebElement register=driver.findElement(By.cssSelector("[name='register-button']"));
        register.click();
        MyFunc.Wait(2);

        WebElement confirmationMessage=driver.findElement(By.xpath("//div[@class='result']"));
        Assert.assertTrue("Kaydınız oluşturalamadı, lütfen tekrar deneyiniz", confirmationMessage.getText().contains("completed"));

        tearDown();
    }
}
