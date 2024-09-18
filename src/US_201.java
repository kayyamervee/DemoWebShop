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

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='header-links']//a)[1]")));
        WebElement registerButton=driver.findElement(By.xpath("(//div[@class='header-links']//a)[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(registerButton));
        actions.moveToElement(registerButton).click().build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='gender']//input)[1]")));
        WebElement genderMale=driver.findElement(By.xpath("(//div[@class='gender']//input)[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(genderMale));
        actions.moveToElement(genderMale).click().build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='FirstName']")));
        WebElement firstName=driver.findElement(By.cssSelector("[name='FirstName']"));
        actions.moveToElement(firstName).click().sendKeys(firstname).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='LastName']")));
        WebElement lastName=driver.findElement(By.cssSelector("[name='LastName']"));
        actions.moveToElement(lastName).click().sendKeys(lastname).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='Email']")));
        WebElement emailButton=driver.findElement(By.cssSelector("[name='Email']"));
        emailButton.sendKeys("test"+(int)(Math.random()*10000)+"@gmail.com");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='password'])[1]")));
        WebElement passwordButton=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        actions.moveToElement(passwordButton).click().sendKeys(password).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='ConfirmPassword']")));
        WebElement confirmPassword=driver.findElement(By.cssSelector("[name='ConfirmPassword']"));
        actions.moveToElement(confirmPassword).click().sendKeys(password).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='register-button']")));
        WebElement register=driver.findElement(By.cssSelector("[name='register-button']"));
        wait.until(ExpectedConditions.elementToBeClickable(register));
        actions.moveToElement(register).click().build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='result']")));
        WebElement confirmationMessage=driver.findElement(By.xpath("//div[@class='result']"));
        Assert.assertTrue("Kaydınız oluşturalamadı, lütfen tekrar deneyiniz", confirmationMessage.getText().contains("completed"));

        tearDown();
    }
}
