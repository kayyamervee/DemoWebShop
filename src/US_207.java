import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_207 extends BaseDriver {
    String firstNameStr="Sefa";
    String lastNameStr="Kahraman";
    String emailStr="Auser"+(int)(Math.random()*100)+"@gmail.com";
    String passwordStr="su52f16";

    @Test
    public void surveyResponseTest(){
        driver.get("https://demowebshop.tricentis.com/");
        wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Register']")));
        WebElement register=driver.findElement(By.xpath("//a[text()='Register']"));
        wait.until(ExpectedConditions.elementToBeClickable(register));
        register.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gender-male")));
        WebElement male=driver.findElement(By.id("gender-male"));
        wait.until(ExpectedConditions.elementToBeClickable(male));
        male.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("FirstName")));
        WebElement firstName=driver.findElement(By.id("FirstName"));
        wait.until(ExpectedConditions.visibilityOf(firstName));
        firstName.sendKeys(firstNameStr);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("LastName")));
        WebElement lastName=driver.findElement(By.id("LastName"));
        wait.until(ExpectedConditions.visibilityOf(lastName));
        lastName.sendKeys(lastNameStr);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));
        WebElement email=driver.findElement(By.id("Email"));
        wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys(emailStr);
        System.out.println("emailStr = " + emailStr);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Password")));
        WebElement password=driver.findElement(By.id("Password"));
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(passwordStr);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ConfirmPassword")));
        WebElement confirmPassword=driver.findElement(By.id("ConfirmPassword"));
        wait.until(ExpectedConditions.visibilityOf(confirmPassword));
        confirmPassword.sendKeys(passwordStr);

        wait.until(ExpectedConditions.elementToBeClickable(By.id("register-button")));
        WebElement registerButton=driver.findElement(By.id("register-button"));
        wait.until(ExpectedConditions.elementToBeClickable(registerButton));
        registerButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='result']")));
        WebElement registerControl=driver.findElement(By.cssSelector("[class='result']"));
        Assert.assertTrue("Kayıt olunamadı",registerControl.getText().contains("completed"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[value='Continue']")));
        WebElement continueButton=driver.findElement(By.cssSelector("[value='Continue']"));
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='account'])[1]")));
        WebElement logInControl=driver.findElement(By.xpath("(//a[@class='account'])[1]"));
        Assert.assertTrue("Giriş başarısız...",logInControl.getText().contains("Auser"));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='pollanswers-1']")));
        WebElement excellent=driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
        wait.until(ExpectedConditions.elementToBeClickable(excellent));
        excellent.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='vote-poll-1']")));
        WebElement vote=driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
        wait.until(ExpectedConditions.elementToBeClickable(vote));
        vote.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='poll']//li)[1]")));
        WebElement voteControl=driver.findElement(By.xpath("(//div[@class='poll']//li)[1]"));
        wait.until(ExpectedConditions.visibilityOf(voteControl));
        System.out.println("voteControl.getText() = " + voteControl.getText());
        Assert.assertTrue("Oy kullanılamadı ",voteControl.getText().contains("Excellent"));

        tearDown();
    }
}
