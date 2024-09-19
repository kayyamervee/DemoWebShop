import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_209 extends BaseDriver {
    @Test
    public void downloadingOrderHistory() {
        String emailStr = "Auser@gmail.com";
        String passwordStr = "Earnq123**";

        driver.get("https://demowebshop.tricentis.com/");
        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='ico-login']")));
        WebElement logIn = driver.findElement(By.cssSelector("[class='ico-login']"));
        wait.until(ExpectedConditions.elementToBeClickable(logIn));
        new Actions(driver).click(logIn).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='email']")));
        WebElement email = driver.findElement(By.cssSelector("[class='email']"));
        wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys(emailStr);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='password']")));
        WebElement password = driver.findElement(By.cssSelector("[class='password']"));
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(passwordStr);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='buttons'])[3]//input")));
        WebElement logInClick = driver.findElement(By.xpath("(//div[@class='buttons'])[3]//input"));
        wait.until(ExpectedConditions.elementToBeClickable(logInClick));
        new Actions(driver).click(logInClick).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='account'])[1]")));
        WebElement logInControl = driver.findElement(By.xpath("(//a[@class='account'])[1]"));
        Assert.assertTrue("Giriş başarısız...", logInControl.getText().contains("Auser"));
        logInControl.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='inactive'])[2]")));
        WebElement ordersClick = driver.findElement(By.xpath("(//a[@class='inactive'])[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(ordersClick));
        ordersClick.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='button-2 order-details-button']")));
        WebElement detailsBtn = driver.findElement(By.cssSelector("[class='button-2 order-details-button']"));
        wait.until(ExpectedConditions.elementToBeClickable(detailsBtn));
        detailsBtn.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='button-2 pdf-order-button']")));
        WebElement pdfOrderBtn = driver.findElement(By.cssSelector("[class='button-2 pdf-order-button']"));
        wait.until(ExpectedConditions.elementToBeClickable(pdfOrderBtn));
        pdfOrderBtn.click();

        tearDown();
    }
}
