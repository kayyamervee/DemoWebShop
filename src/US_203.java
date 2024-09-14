import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US_203 extends BaseDriver {

    @Test
    public void logoutTest(){

        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Wait(2);

        WebElement logIn=driver.findElement(By.cssSelector("li>a[href='/login' ]"));
        new Actions(driver).click(logIn).build().perform();
        MyFunc.Wait(2);

        String email="kayaamerve01@gmail.com";
        WebElement emailBox=driver.findElement(By.xpath("//div[@class='inputs' ]//input[@type='text']"));
        new Actions(driver).moveToElement(emailBox).click().sendKeys(email).build().perform();
        MyFunc.Wait(2);

        String password="Team6merve";
        WebElement passwordBox=driver.findElement(By.cssSelector("div[class='inputs' ]>:nth-child(2)[type='password' ]"));
        new Actions(driver).moveToElement(passwordBox).click().sendKeys(password).build().perform();
        MyFunc.Wait(2);

        WebElement loginBox=driver.findElement(By.xpath("(//input[@type='submit' ])[2]"));
        new Actions(driver).click(loginBox).build().perform();
        MyFunc.Wait(2);

        WebElement visibleUsername=driver.findElement(By.xpath("(//div[@class='header-links' ])//a[@class='account' ]"));
        System.out.println("Kullanıcı adı : "+visibleUsername.getText());
        Assert.assertTrue("Kullanıcı adı doğru değil!",visibleUsername.getText().contains(email));

        WebElement logoutButton=driver.findElement(By.xpath("//a[text()='Log out' ]"));
        new Actions(driver).click(logoutButton).build().perform();
        MyFunc.Wait(2);

        WebElement logInText=driver.findElement(By.xpath("//a[text()='Log in' ]"));
        System.out.println("Text : "+logInText.getText());
        MyFunc.Wait(2);

        System.out.print("Log in görünür durumda mı? : "+logInText.isDisplayed());
        Assert.assertTrue("Log in görüntülenemiyor!",logInText.getText().contains("Log in"));

        tearDown();
    }
}
