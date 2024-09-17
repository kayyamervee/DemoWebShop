import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class US_206 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://demowebshop.tricentis.com/");
        Actions actions = new Actions(driver);

        WebElement registerBtn = driver.findElement(By.xpath("//a[@class='ico-register']"));
        registerBtn.click();
        MyFunc.Wait(1);

        WebElement gender = driver.findElement(By.id("gender-male"));
        gender.click();
        MyFunc.Wait(1);

        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Kerim");
        MyFunc.Wait(1);

        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("Mutlu");
        MyFunc.Wait(1);

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("emoKerim40@gmail.com");
        MyFunc.Wait(1);

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Demo159753");
        MyFunc.Wait(1);

        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        confirmPassword.sendKeys("Demo159753");
        MyFunc.Wait(1);

        WebElement btnRegister = driver.findElement(By.id("register-button"));
        btnRegister.click();
        MyFunc.Wait(1);


        WebElement continueBtn = driver.findElement(By.xpath("//input[@type='button']"));
        continueBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn));

        WebElement mailCheck = driver.findElement(By.xpath("(//a[@class='account'])[1]"));
        System.out.println("mailCheck.getText() = " + mailCheck.getText());
        MyFunc.Wait(1);

        WebElement books = driver.findElement(By.linkText("BOOKS"));
        books.click();
        MyFunc.Wait(1);

        WebElement apparelShoes = driver.findElement(By.linkText("APPAREL & SHOES"));
        apparelShoes.click();
        MyFunc.Wait(1);

        WebElement digitalDownLoads = driver.findElement(By.linkText("DIGITAL DOWNLOADS"));
        digitalDownLoads.click();
        MyFunc.Wait(1);

        WebElement jewelry = driver.findElement(By.linkText("JEWELRY"));
        jewelry.click();
        MyFunc.Wait(1);

        WebElement giftCards = driver.findElement(By.linkText("GIFT CARDS"));
        giftCards.click();
        MyFunc.Wait(1);

        WebElement computersHeader = driver.findElement(By.linkText("COMPUTERS"));
        actions.moveToElement(computersHeader).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Desktops")));
        WebElement desktops = driver.findElement(By.linkText("Desktops"));
        desktops.click();
        driver.navigate().back();
        actions.moveToElement(computersHeader).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Notebooks")));
        WebElement notebooks = driver.findElement(By.linkText("Notebooks"));
        notebooks.click();
        driver.navigate().back();
        actions.moveToElement(computersHeader).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Accessories")));
        WebElement accessories = driver.findElement(By.linkText("Accessories"));
        accessories.click();

        WebElement electronics = driver.findElement(By.linkText("ELECTRONICS"));
        actions.moveToElement(electronics).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Camera, photo")));
        WebElement cameraPhoto = driver.findElement(By.linkText("Camera, photo"));
        cameraPhoto.click();
        driver.navigate().back();
        actions.moveToElement(electronics).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Cell phones")));
        WebElement cellPhones = driver.findElement(By.linkText("Cell phones"));
        cellPhones.click();

        WebElement smartPhone = driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"));
        smartPhone.click();
        wait.withTimeout(Duration.ofSeconds(2));

        WebElement shoppingCard = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        shoppingCard.click();
        wait.withTimeout(Duration.ofSeconds(2));

        WebElement checkBox = driver.findElement(By.cssSelector("div[class='terms-of-service']>:nth-child(1)"));
        checkBox.click();
        wait.withTimeout(Duration.ofSeconds(2));

        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();
        wait.withTimeout(Duration.ofSeconds(2));


        driver.quit();
    }
}