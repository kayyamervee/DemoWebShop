import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_203 extends BaseDriver {

    @Test
    public void logoutTest(){
        String email="kayaamerve01@gmail.com";
        String password="Team6merve";

        driver.get("https://demowebshop.tricentis.com/");
        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/"));
        Actions actions=new Actions(driver);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li>a[href='/login' ]")));
        WebElement logIn=driver.findElement(By.cssSelector("li>a[href='/login' ]"));
        wait.until(ExpectedConditions.elementToBeClickable(logIn));
        actions.click(logIn).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inputs' ]//input[@type='text']")));
        WebElement emailBox=driver.findElement(By.xpath("//div[@class='inputs' ]//input[@type='text']"));
        wait.until(ExpectedConditions.elementToBeClickable(emailBox));
        actions.moveToElement(emailBox).click().sendKeys(email).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='inputs' ]>:nth-child(2)[type='password' ]")));
        WebElement passwordBox=driver.findElement(By.cssSelector("div[class='inputs' ]>:nth-child(2)[type='password' ]"));
        wait.until(ExpectedConditions.elementToBeClickable(passwordBox));
        actions.moveToElement(passwordBox).click().sendKeys(password).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='submit' ])[2]")));
        WebElement loginBox=driver.findElement(By.xpath("(//input[@type='submit' ])[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(loginBox));
        actions.click(loginBox).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='header-links' ])//a[@class='account' ]")));
        WebElement visibleUsername=driver.findElement(By.xpath("(//div[@class='header-links' ])//a[@class='account' ]"));
        Assert.assertTrue("Kullanıcı adı doğru değil!",visibleUsername.getText().contains(email));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Log out' ]")));
        WebElement logoutButton=driver.findElement(By.xpath("//a[text()='Log out' ]"));
        wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
        actions.click(logoutButton).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li>a[href='/login' ]")));
        WebElement logInText=driver.findElement(By.xpath("//a[text()='Log in' ]"));

        System.out.print("Log in görünür durumda mı? : "+logInText.isDisplayed());
        Assert.assertTrue("Log in görüntülenemiyor!",logInText.getText().contains("Log in"));

        tearDown();
    }
}
