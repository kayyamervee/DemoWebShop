import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class US_208 extends BaseDriver {

    @Test
    public void giftCardNegativeTest() {
        String name="Merve Kaya";
        String email = "kayaamerve01@gmail.com";
        String password = "Team6merve";
        String postalCode = "10001";
        String product = "14.1-inch Laptop";
        String number="4242 4242 4242 4242";
        String code="123";

        driver.get("https://demowebshop.tricentis.com/");
        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/"));
        Actions actions = new Actions(driver);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li>a[href='/login' ]")));
        WebElement logIn = driver.findElement(By.cssSelector("li>a[href='/login' ]"));
        wait.until(ExpectedConditions.elementToBeClickable(logIn));
        actions.click(logIn).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='inputs' ]//input[@type='text']")));
        WebElement emailBox = driver.findElement(By.xpath("//div[@class='inputs' ]//input[@type='text']"));
        wait.until(ExpectedConditions.elementToBeClickable(emailBox));
        actions.moveToElement(emailBox).click().sendKeys(email).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='inputs' ]>:nth-child(2)[type='password' ]")));
        WebElement passwordBox = driver.findElement(By.cssSelector("div[class='inputs' ]>:nth-child(2)[type='password' ]"));
        wait.until(ExpectedConditions.elementToBeClickable(passwordBox));
        actions.moveToElement(passwordBox).click().sendKeys(password).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='submit' ])[2]")));
        WebElement loginBox = driver.findElement(By.xpath("(//input[@type='submit' ])[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(loginBox));
        actions.click(loginBox).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href='/computers' ])[1]")));
        WebElement computersMenu = driver.findElement(By.xpath("(//a[@href='/computers' ])[1]"));
        actions.moveToElement(computersMenu).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href='/notebooks' ])[1]")));
        WebElement selectNotebooks = driver.findElement(By.xpath("(//a[@href='/notebooks' ])[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(selectNotebooks));
        actions.click(selectNotebooks).build().perform();

        actions.scrollByAmount(0, 300).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Add to cart' ]")));
        WebElement addToCart = driver.findElement(By.xpath("//input[@value='Add to cart' ]"));
        wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        actions.click(addToCart).build().perform();

        actions.scrollByAmount(300, 0).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='ico-cart' ])[1]")));
        WebElement shoppingCart = driver.findElement(By.xpath("(//a[@class='ico-cart' ])[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCart));
        actions.click(shoppingCart).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("product-name")));
        WebElement productInfo = driver.findElement(By.xpath("(//a[text()='14.1-inch Laptop' ])[2]"));
        Assert.assertTrue("Seçilen ürün ile sepetteki ürün aynı değil!",productInfo.getText().contains(product));

        actions.scrollByAmount(0, 300).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[value='Apply coupon' ]")));
        WebElement applyCoupon = driver.findElement(By.cssSelector("input[value='Apply coupon' ]"));
        wait.until(ExpectedConditions.elementToBeClickable(applyCoupon));
        actions.click(applyCoupon).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='message' ]")));
        WebElement couponText = driver.findElement(By.xpath("//div[@class='message' ]"));
        wait.until(ExpectedConditions.visibilityOf(couponText));
        Assert.assertTrue("Uyarı mesajına ulaşılamadı!", couponText.getText().contains("couldn't be applied"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Add gift card' ]")));
        WebElement addGiftCart = driver.findElement(By.xpath("//input[@value='Add gift card' ]"));
        wait.until(ExpectedConditions.elementToBeClickable(addGiftCart));
        actions.click(addGiftCart).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='message' ]")));
        WebElement giftCartText = driver.findElement(By.xpath("//div[@class='message' ]"));
        wait.until(ExpectedConditions.visibilityOf(giftCartText));
        Assert.assertTrue("Uyarı mesajına ulaşılamadı!", giftCartText.getText().contains("couldn't be applied"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("estimate-shipping")));
        WebElement cargoInfoFunc = driver.findElement(By.xpath("//div[@class='estimate-shipping' ]"));

        if (cargoInfoFunc.isDisplayed()) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='CountryId' ]")));
            WebElement cargoInfoCountry = driver.findElement(By.xpath("//select[@id='CountryId' ]"));
            wait.until(ExpectedConditions.elementToBeClickable(cargoInfoCountry));
            Select countryMenu = new Select(cargoInfoCountry);
            wait.until(ExpectedConditions.elementToBeClickable(cargoInfoFunc));
            countryMenu.selectByValue("1");

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CountryId")));
            WebElement cargoInfoState = driver.findElement(By.xpath("//select[@id='StateProvinceId' ]"));
            wait.until(ExpectedConditions.elementToBeClickable(cargoInfoState));
            Select stateMenu = new Select(cargoInfoState);
            stateMenu.selectByVisibleText("New York");

            wait.until(ExpectedConditions.elementToBeClickable(By.className("zip-input")));
            WebElement postalCodeBox = driver.findElement(By.xpath("//input[@class='zip-input' ]"));
            wait.until(ExpectedConditions.elementToBeClickable(postalCodeBox));
            actions.moveToElement(postalCodeBox).click().sendKeys(postalCode).build().perform();
            wait.until(ExpectedConditions.visibilityOf(postalCodeBox));
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='checkbox' ])[2]")));
        WebElement acceptButton=driver.findElement(By.xpath("(//input[@type='checkbox' ])[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(acceptButton));
        actions.click(acceptButton).build().perform();
        wait.until(ExpectedConditions.elementToBeSelected(acceptButton));
        System.out.println("Kabul butonu seçilebilir durumda mı?" +acceptButton.isSelected());

        WebElement clickCheckout=driver.findElement(By.xpath("//button[@type='submit' ]"));
        actions.click(clickCheckout).build().perform();

        for (int i = 1; i <=3; i++) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@value='Continue'])["+i+"]")));
            WebElement continueClick=driver.findElement(By.xpath("(//input[@value='Continue'])["+i+"]"));
            wait.until(ExpectedConditions.elementToBeClickable(continueClick));
            actions.click(continueClick).build().perform();
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("paymentmethod_2")));
        WebElement selectCardRadio=driver.findElement(By.xpath("//input[@id='paymentmethod_2' ]"));
        wait.until(ExpectedConditions.elementToBeClickable(selectCardRadio));
        actions.click(selectCardRadio).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[onclick='PaymentMethod.save()' ]")));
        WebElement continueFourth=driver.findElement(By.cssSelector("input[onclick='PaymentMethod.save()' ]"));
        wait.until(ExpectedConditions.elementToBeClickable(continueFourth));
        continueFourth.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CreditCardType")));
        WebElement cardType=driver.findElement(By.xpath("//select[@id='CreditCardType' ]"));
        Select typeMenu=new Select(cardType);
        wait.until(ExpectedConditions.elementToBeClickable(cardType));
        typeMenu.selectByValue("Visa");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='CardholderName' ]")));
        WebElement cardNameBox=driver.findElement(By.xpath("//input[@name='CardholderName' ]"));
        wait.until(ExpectedConditions.elementToBeClickable(cardNameBox));
        actions.moveToElement(cardNameBox).click().sendKeys(name).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CardNumber")));
        WebElement cardNumberBox=driver.findElement(By.xpath("//input[@id='CardNumber' ]"));
        wait.until(ExpectedConditions.elementToBeClickable(cardNumberBox));
        actions.moveToElement(cardNumberBox).click().sendKeys(number).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ExpireMonth")));
        WebElement cardDateMonth=driver.findElement(By.xpath("//select[@id='ExpireMonth' ]"));
        Select monthMenu=new Select(cardDateMonth);
        monthMenu.selectByValue("1");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ExpireYear")));
        WebElement cardDateYear=driver.findElement(By.xpath("//select[@id='ExpireYear' ]"));
        Select yearMenu=new Select(cardDateYear);
        yearMenu.selectByValue("2032");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CardCode")));
        WebElement cardCode=driver.findElement(By.xpath("//input[@name='CardCode' ]"));
        wait.until(ExpectedConditions.elementToBeClickable(cardCode));
        actions.moveToElement(cardCode).click().sendKeys(code).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='PaymentInfo.save()' ]")));
        WebElement continueButtonFifth=driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()' ]"));
        wait.until(ExpectedConditions.elementToBeClickable(continueButtonFifth));
        actions.click(continueButtonFifth).build().perform();

        actions.scrollByAmount(0,300).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='ConfirmOrder.save()' ]")));
        WebElement confirmButton=driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()' ]"));
        wait.until(ExpectedConditions.elementToBeClickable(confirmButton));
        confirmButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='section order-completed' ])//strong")));
        WebElement confirmText=driver.findElement(By.xpath("(//div[@class='section order-completed' ])//strong"));
        Assert.assertTrue("Mesaj görüntülenemedi!",confirmText.getText().contains("successfully processed!"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Log out' ]")));
        WebElement logoutButton=driver.findElement(By.xpath("//a[text()='Log out' ]"));
        wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
        actions.click(logoutButton).build().perform();

        tearDown();
    }
}
