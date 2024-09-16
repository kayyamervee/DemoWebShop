import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class US_208 extends BaseDriver {

    @Test
    public void GiftCardNegativeTest(){

        driver.get("https://demowebshop.tricentis.com/");
        MyFunc.Wait(2);
        Actions actions=new Actions(driver);

        WebElement logIn=driver.findElement(By.cssSelector("li>a[href='/login' ]"));
        actions.click(logIn).build().perform();
        MyFunc.Wait(2);

        String email="kayaamerve01@gmail.com";
        WebElement emailBox=driver.findElement(By.xpath("//div[@class='inputs' ]//input[@type='text']"));
        actions.moveToElement(emailBox).click().sendKeys(email).build().perform();
        MyFunc.Wait(2);

        String password="Team6merve";
        WebElement passwordBox=driver.findElement(By.cssSelector("div[class='inputs' ]>:nth-child(2)[type='password' ]"));
        actions.moveToElement(passwordBox).click().sendKeys(password).build().perform();
        MyFunc.Wait(2);

        WebElement loginBox=driver.findElement(By.xpath("(//input[@type='submit' ])[2]"));
        actions.click(loginBox).build().perform();
        MyFunc.Wait(2);

        WebElement computersMenu=driver.findElement(By.xpath("(//a[@href='/computers' ])[1]"));
        actions.moveToElement(computersMenu).build().perform();
        MyFunc.Wait(2);

        WebElement selectNotebooks=driver.findElement(By.xpath("(//a[@href='/notebooks' ])[1]"));
        MyFunc.Wait(2);
        actions.click(selectNotebooks).build().perform();
        MyFunc.Wait(2);

        actions.scrollByAmount(0,300).build().perform();

        WebElement addToCart=driver.findElement(By.xpath("//input[@value='Add to cart' ]"));
        actions.click(addToCart).build().perform();
        MyFunc.Wait(2);

        actions.scrollByAmount(300,0).build().perform();

        WebElement shoppingCart=driver.findElement(By.xpath("(//a[@class='ico-cart' ])[1]"));
        actions.click(shoppingCart).build().perform();
        MyFunc.Wait(2);

        actions.scrollByAmount(0,300).build().perform();

        WebElement applyCoupon=driver.findElement(By.cssSelector("input[value='Apply coupon' ]"));
        actions.click(applyCoupon).build().perform();
        MyFunc.Wait(2);

        WebElement couponText=driver.findElement(By.xpath("//div[@class='message' ]"));
        couponText.getText();
        MyFunc.Wait(2);
        Assert.assertTrue("Uyarı mesajına ulaşılamadı!",couponText.getText().contains("The coupon code you entered couldn't be applied to your order"));

        WebElement addGiftCart=driver.findElement(By.xpath("//input[@value='Add gift card' ]"));
        actions.click(addGiftCart).build().perform();
        MyFunc.Wait(2);

        WebElement giftCartText=driver.findElement(By.xpath("//div[@class='message' ]"));
        giftCartText.getText();
        MyFunc.Wait(2);
        Assert.assertTrue("Uyarı mesajına ulaşılamadı!",giftCartText.getText().contains("The coupon code you entered couldn't be applied to your order"));

        WebElement cargoInfoCountry=driver.findElement(By.xpath("//select[@id='CountryId' ]"));
        MyFunc.Wait(2);
        Select countryMenu=new Select(cargoInfoCountry);
        countryMenu.selectByValue("1");
        MyFunc.Wait(2);

        WebElement cargoInfoState=driver.findElement(By.xpath("//select[@id='StateProvinceId' ]"));
        MyFunc.Wait(2);
        Select stateMenu=new Select(cargoInfoState);
        stateMenu.selectByVisibleText("New York");
        MyFunc.Wait(2);

        String postalCode="10001";
        WebElement postalCodeBox=driver.findElement(By.xpath("//input[@class='zip-input' ]"));
        actions.moveToElement(postalCodeBox).click().sendKeys(postalCode).build().perform();
        MyFunc.Wait(2);

        WebElement acceptButton=driver.findElement(By.xpath("(//input[@type='checkbox' ])[2]"));
        actions.click(acceptButton).build().perform();
        System.out.println("Kabul butonu seçilebilir durumda mı?"+acceptButton.isSelected());
        MyFunc.Wait(2);

        WebElement clickCheckout=driver.findElement(By.xpath("//button[@type='submit' ]"));
        actions.click(clickCheckout).build().perform();
        MyFunc.Wait(2);

        WebElement continueButtonFirst=driver.findElement(By.xpath("(//input[@title='Continue' ])[1]"));
        continueButtonFirst.click();
        MyFunc.Wait(2);

        WebElement continueButtonSecond=driver.findElement(By.xpath("(//input[@type='button' ])[3]"));
        continueButtonSecond.click();
        MyFunc.Wait(2);

        WebElement continueButtonThird=driver.findElement(By.xpath("(//input[@type='button' ])[4]"));
        continueButtonThird.click();
        MyFunc.Wait(2);

        WebElement selectCreditCard=driver.findElement(By.xpath("(//input[@type='radio' ])[6]"));
        selectCreditCard.click();
        MyFunc.Wait(2);

        WebElement continueFourth=driver.findElement(By.cssSelector("input[onclick='PaymentMethod.save()' ]"));
        continueFourth.click();
        MyFunc.Wait(2);

        WebElement cardType=driver.findElement(By.xpath("//select[@id='CreditCardType' ]"));
        Select typeMenu=new Select(cardType);
        typeMenu.selectByValue("Visa");
        MyFunc.Wait(2);

        String name="Merve Kaya";
        WebElement cardName=driver.findElement(By.xpath("//input[@name='CardholderName' ]"));
        actions.moveToElement(cardName).click().sendKeys(name).build().perform();
        MyFunc.Wait(2);

        String number="4242 4242 4242 4242";
        WebElement cardNumber=driver.findElement(By.xpath("//input[@id='CardNumber' ]"));
        actions.moveToElement(cardNumber).click().sendKeys(number).build().perform();
        MyFunc.Wait(2);

        WebElement cardDateMonth=driver.findElement(By.xpath("//select[@id='ExpireMonth' ]"));
        Select monthMenu=new Select(cardDateMonth);
        monthMenu.selectByValue("1");
        MyFunc.Wait(2);

        WebElement cardDateYear=driver.findElement(By.xpath("//select[@id='ExpireYear' ]"));
        Select yearMenu=new Select(cardDateYear);
        yearMenu.selectByValue("2032");
        MyFunc.Wait(2);

        String code="123";
        WebElement cardCode=driver.findElement(By.xpath("//input[@name='CardCode' ]"));
        actions.moveToElement(cardCode).click().sendKeys(code).build().perform();
        MyFunc.Wait(2);

        WebElement continueButtonFifth=driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()' ]"));
        continueButtonFifth.click();
        MyFunc.Wait(2);

        actions.scrollByAmount(0,300).build().perform();

        WebElement confirmButton=driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()' ]"));
        confirmButton.click();
        MyFunc.Wait(2);

        WebElement confirmText=driver.findElement(By.xpath("(//div[@class='section order-completed' ])//strong"));
        confirmText.getText();
        Assert.assertTrue("Mesaj görüntülenemedi!",confirmText.getText().contains("Your order has been successfully processed!"));

        WebElement logoutButton=driver.findElement(By.xpath("//a[text()='Log out' ]"));
        actions.click(logoutButton).build().perform();

        tearDown();
    }
}
