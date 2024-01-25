import Utilities.ReusableMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Verify_Subscription {


    @Test
    public void Verify_Subscription() throws Exception {

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //3. Verify that home page is visible successfully

        driver.findElement(By.cssSelector("div[class='item active'] img[alt='demo website for practice']")).isDisplayed();
        //String currentURL= driver.getCurrentUrl();
        //String expectedURL= "https://automationexercise.com/";
        //Assert.assertEquals(expectedURL, currentURL);

        //4. Scroll down to footer

            WebElement elementToScroll = driver.findElement(By.xpath("//*[text() = \"Subscription\"]"));
        Robot robot = new Robot();
        int x = 24;
        int y = 697;
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        ReusableMethods.wait(1);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elementToScroll);
        ReusableMethods.wait(1);

        //5. Verify text 'SUBSCRIPTION'

        driver.findElement(By.xpath("//*[text() = \"Subscription\"]")).isDisplayed();


        //6. Enter email address in input and click arrow button

        WebElement emailBox = driver.findElement(By.xpath("//input[@id = \"susbscribe_email\"]"));
        WebElement gitEmail = driver.findElement(By.xpath("//i[@class=\"fa fa-arrow-circle-o-right\"]"));

        emailBox.sendKeys("nazim@gmail.com");

        WebElement elementToScrollAgain = driver.findElement(By.xpath("//*[text() = \"Subscription\"]"));
        Robot robot1 = new Robot();
        int x1 = 24;
        int y1 = 697;
        robot.mouseMove(x, y);
        robot1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        ReusableMethods.wait(1);
        //JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", elementToScrollAgain);
        ReusableMethods.wait(1);

        gitEmail.click();
        ReusableMethods.wait(1);

        //7. Verify success message 'You have been successfully subscribed!' is visible

        driver.findElement(By.xpath("//div[@class = \"alert-success alert\"]")).isDisplayed();
        driver.close();

    }
}
