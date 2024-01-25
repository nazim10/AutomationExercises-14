import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class VerifySubscriptionInCartPage {

    @Test
    public void Verify_Subscription2() throws Exception {


       // 1. Launch browser
       // 2. Navigate to url 'http://automationexercise.com'
       // 3. Verify that home page is visible successfully

       WebDriver driver = new FirefoxDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.get("https://automationexercise.com/");
       String actuelURL = driver.getCurrentUrl();
       String ecxpectedURL = "https://automationexercise.com/";
        Assert.assertEquals(actuelURL, actuelURL);


       // 4. Click 'Cart' button
        driver.findElement(By.xpath("(//a[@href=\"/view_cart\"])[1]")).click();

       // 5. Scroll down to footer
        WebElement elementToScroll = driver.findElement(By.xpath("//*[text() = \"Subscription\"]"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elementToScroll);
        ReusableMethods.wait(1);

        // 6. Verify text 'SUBSCRIPTION'
        driver.findElement(By.xpath("//*[text() = \"Subscription\"]")).isDisplayed();

       // 7. Enter email address in input and click arrow button
        WebElement emailBox = driver.findElement(By.xpath("//input[@id = \"susbscribe_email\"]"));
        WebElement gitEmail = driver.findElement(By.xpath("//i[@class=\"fa fa-arrow-circle-o-right\"]"));

        emailBox.sendKeys("nazim@gmail.com");

        WebElement elementToScrollAgain = driver.findElement(By.xpath("//*[text() = \"Subscription\"]"));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elementToScrollAgain);
        ReusableMethods.wait(1);

        gitEmail.click();
        ReusableMethods.wait(1);

        // 8. Verify success message 'You have been successfully subscribed!' is visible
        driver.findElement(By.xpath("//div[@class = \"alert-success alert\"]")).isDisplayed();
        driver.close();

    }

}
