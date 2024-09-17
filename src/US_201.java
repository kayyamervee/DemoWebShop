import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_201 extends BaseDriver {

    @Test
    public void positiveRegisterUserTest(){

        String firstname="Team6";
        String lastname="Group";
        String password="team61234";

        driver.get("https://demowebshop.tricentis.com/");
        Actions actions=new Actions(driver);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='header-links']//a)[1]")));
        WebElement registerButton=driver.findElement(By.xpath("(//div[@class='header-links']//a)[1]"));
        actions.moveToElement(registerButton).click().build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='gender']//input)[1]")));
        WebElement genderMale=driver.findElement(By.xpath("(//div[@class='gender']//input)[1]"));
        actions.moveToElement(genderMale).click().build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name='FirstName']")));
        WebElement firstName=driver.findElement(By.cssSelector("[name='FirstName']"));
        actions.moveToElement(firstName).click().sendKeys(firstname).build().perform();

        WebElement lastName=driver.findElement(By.cssSelector("[name='LastName']"));
        wait.until(ExpectedConditions.visibilityOf(lastName));
        actions.moveToElement(lastName).click().sendKeys(lastname).build().perform();

        WebElement emailButton=driver.findElement(By.cssSelector("[name='Email']"));
        wait.until(ExpectedConditions.visibilityOf(emailButton));
        emailButton.sendKeys("test"+(int)(Math.random()*10000)+"@gmail.com");

        WebElement passwordButton=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        wait.until(ExpectedConditions.visibilityOf(passwordButton));
        actions.moveToElement(passwordButton).click().sendKeys(password).build().perform();

        WebElement confirmPassword=driver.findElement(By.cssSelector("[name='ConfirmPassword']"));
        wait.until(ExpectedConditions.visibilityOf(confirmPassword));
        actions.moveToElement(confirmPassword).click().sendKeys(password).build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[name='register-button']")));
        WebElement register=driver.findElement(By.cssSelector("[name='register-button']"));
        actions.moveToElement(register).click().build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='result']")));
        WebElement confirmationMessage=driver.findElement(By.xpath("//div[@class='result']"));
        Assert.assertTrue("Kaydınız oluşturalamadı, lütfen tekrar deneyiniz", confirmationMessage.getText().contains("completed"));

        tearDown();
    }
}
