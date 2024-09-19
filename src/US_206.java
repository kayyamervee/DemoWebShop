import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class US_206 extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://demowebshop.tricentis.com/");
        Actions actions = new Actions(driver);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='ico-register']")));
        WebElement registerBtn = driver.findElement(By.xpath("//a[@class='ico-register']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='ico-register']")));
        registerBtn.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gender-male")));
        WebElement gender = driver.findElement(By.id("gender-male"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gender-male")));
        gender.click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("FirstName")));
        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Kerim");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("FirstName")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("LastName")));
        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("Mutlu");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("LastName")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("emoKerim67@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Password")));
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Demo159753");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Password")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ConfirmPassword")));
        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        confirmPassword.sendKeys("Demo159753");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ConfirmPassword")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("register-button")));
        WebElement btnRegister = driver.findElement(By.id("register-button"));
        btnRegister.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='button']")));
        WebElement continueBtn = driver.findElement(By.xpath("//input[@type='button']"));
        continueBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='account'])[1]")));
        WebElement mailCheck = driver.findElement(By.xpath("(//a[@class='account'])[1]"));
        System.out.println("mailCheck.getText() = " + mailCheck.getText());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='account'])[1]")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("BOOKS")));
        WebElement books = driver.findElement(By.linkText("BOOKS"));
        books.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("BOOKS")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("APPAREL & SHOES")));
        WebElement apparelShoes = driver.findElement(By.linkText("APPAREL & SHOES"));
        apparelShoes.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("APPAREL & SHOES")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("DIGITAL DOWNLOADS")));
        WebElement digitalDownLoads = driver.findElement(By.linkText("DIGITAL DOWNLOADS"));
        digitalDownLoads.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("DIGITAL DOWNLOADS")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("JEWELRY")));
        WebElement jewelry = driver.findElement(By.linkText("JEWELRY"));
        jewelry.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("JEWELRY")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("GIFT CARDS")));
        WebElement giftCards = driver.findElement(By.linkText("GIFT CARDS"));
        giftCards.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("GIFT CARDS")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("COMPUTERS")));
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Accessories")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("ELECTRONICS")));
        WebElement electronics = driver.findElement(By.linkText("ELECTRONICS"));
        actions.moveToElement(electronics).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Camera, photo")));
        WebElement cameraPhoto = driver.findElement(By.linkText("Camera, photo"));
        cameraPhoto.click();

        driver.navigate().back();

        actions.moveToElement(electronics).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Cell phones")));
        WebElement cellPhones = driver.findElement(By.linkText("Cell phones"));
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Cell phones")));
        cellPhones.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Add to cart'])[1]")));
        WebElement smartPhone = driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@value='Add to cart'])[1]")));
        smartPhone.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Shopping cart']")));
        WebElement shoppingCard = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        shoppingCard.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Shopping cart']")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='terms-of-service']>:nth-child(1)")));
        WebElement checkBox = driver.findElement(By.cssSelector("div[class='terms-of-service']>:nth-child(1)"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[class='terms-of-service']>:nth-child(1)")));
        checkBox.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("checkout"))));
        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[id='BillingNewAddress_CountryId']")));
        WebElement country = driver.findElement(By.cssSelector("select[id='BillingNewAddress_CountryId']"));
        Select select = new Select(country);
        select.selectByVisibleText("Turkey");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("BillingNewAddress_City")));
        WebElement city = driver.findElement(By.id("BillingNewAddress_City"));
        city.sendKeys("İstanbul");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("BillingNewAddress_City")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("BillingNewAddress_Address1")));
        WebElement address = driver.findElement(By.id("BillingNewAddress_Address1"));
        address.sendKeys("Ziya Gonkalp mah.");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("BillingNewAddress_Address1")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("BillingNewAddress_ZipPostalCode")));
        WebElement postcode = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        postcode.sendKeys("34000");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("BillingNewAddress_ZipPostalCode")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("BillingNewAddress_PhoneNumber")));
        WebElement phoneNumber = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phoneNumber.sendKeys("+905359134148");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("BillingNewAddress_PhoneNumber")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='billing-buttons-container']>:nth-child(1)")));
        WebElement continueBtn1 = driver.findElement(By.cssSelector("div[id='billing-buttons-container']>:nth-child(1)"));
        continueBtn1.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("PickUpInStore")));
        WebElement inStorePickUp = driver.findElement(By.id("PickUpInStore"));
        inStorePickUp.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@title='Continue'])[2]")));
        WebElement continueBtn2 = driver.findElement(By.xpath("(//*[@title='Continue'])[2]"));
        continueBtn2.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("paymentmethod_2")));
        WebElement creditCard = driver.findElement(By.id("paymentmethod_2"));
        creditCard.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='button-1 payment-method-next-step-button']")));
        WebElement continuebtn3 = driver.findElement(By.cssSelector("input[class='button-1 payment-method-next-step-button']"));
        continuebtn3.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[id='CreditCardType']")));
        WebElement cardType = driver.findElement(By.cssSelector("select[id='CreditCardType']"));
        Select select1 = new Select(cardType);
        select1.selectByVisibleText("Visa");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CardholderName")));
        WebElement cardholderName = driver.findElement(By.id("CardholderName"));
        cardholderName.sendKeys("Kerim");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CardNumber")));
        WebElement cardNumber = driver.findElement(By.id("CardNumber"));
        cardNumber.sendKeys("4242 4242 4242 4242");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ExpireMonth")));
        WebElement expirationDateMonth = driver.findElement(By.id("ExpireMonth"));
        Select monthSelect = new Select(expirationDateMonth);
        monthSelect.selectByValue("1");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ExpireYear")));
        WebElement expirationYear = driver.findElement(By.id("ExpireYear"));
        Select yearSelect = new Select(expirationYear);
        yearSelect.selectByValue("2032");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CardCode")));
        WebElement cardCode = driver.findElement(By.id("CardCode"));
        cardCode.sendKeys("123");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='button'])[6]")));
        WebElement continueBtn4 = driver.findElement(By.xpath("(//input[@type='button'])[6]"));
        continueBtn4.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='product-subtotal']")));
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='product-subtotal']"));
        double sum = 0;
        for (WebElement e : prices) {
            System.out.println("Product price = " + e.getText());
            sum = sum + Double.parseDouble(e.getText().replaceAll("[^0-9]", ""));
        }
        WebElement productsTotalElement = driver.findElement(By.cssSelector("span[class='product-price order-total']:nth-child(1)"));
        double itemTotal = Double.parseDouble(productsTotalElement.getText().replaceAll("[^0-9]", ""));
        System.out.println("itemTotal = " + itemTotal);

        Assert.assertTrue("Totals are not equal", sum == itemTotal);

        driver.quit();
    }
}