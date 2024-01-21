import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.time.Duration;

public class Verify_TestCases_Page {


    @Test
    public void VerifyingTestCasesPage() throws AWTException {

        // 1. Launch browser

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // 2. Navigate to url 'http://automationexercise.com/'
        driver.get("https://automationexercise.com/");

        // 3. Verify that home page is visible successfully

        String expectedURL = "https://automationexercise.com/";
        String actuelURL = driver.getCurrentUrl();
        Assert.assertEquals(actuelURL, expectedURL);

        // 4. Click on 'Test Cases' button
        driver.findElement(By.xpath("(//*[text()=\"Test Cases\"])[1]")).click();
        ReusableMethods.wait(3);

        //reklami kapat!!
        Robot robot = new Robot();
        int x = 1479; // Örnek olarak 100 x koordinatı
        int y = 111; // Örnek olarak 200 y koordinatı

        // Fareyi belirtilen koordinatlara hareket ettir
        robot.mouseMove(x, y);

        // Sol tıklama yap

        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        ReusableMethods.wait(3);
        // 5. Verify user is navigated to test cases page successfully
        String expectedUrl = "https://automationexercise.com/test_cases";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        driver.close();


    }
}