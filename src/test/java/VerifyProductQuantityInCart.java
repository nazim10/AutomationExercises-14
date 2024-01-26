import Utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.time.Duration;

public class VerifyProductQuantityInCart {
    @Test
    public void testProductQuantity() throws Exception {



       // 1. Launch browser
       // 2. Navigate to url 'http://automationexercise.com'
       // 3. Verify that home page is visible successfully
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String ExpectedURL = "https://automationexercise.com/";
        String ActualURL = driver.getCurrentUrl();
        Assert.assertEquals(ExpectedURL, ActualURL);

       // 4. Click 'View Product' for any product on home page
        // ------ Scroll to Element ----
        WebElement buton = driver.findElement(By.xpath("(//i[@class =\"fa fa-plus-square\"])[5]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", buton);
        ReusableMethods.wait(2);
        //  -----click to element ---------
        driver.findElement(By.xpath("(//i[@class =\"fa fa-plus-square\"])[5]")).click();

       // 5. Verify product detail is opened

        // ------Reklami Kapat (reklamin disindaki bir noktaya tiklayarak reklam kaldirildi -----------
        Robot robot = new Robot();
        int x = 30; // Örnek olarak 100 x koordinatı
        int y = 707; // Örnek olarak 200 y koordinatı

        // Fareyi belirtilen koordinatlara hareket ettir
        robot.mouseMove(x, y);

        // Sol tıklama yap

        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        ReusableMethods.wait(3);

        driver.findElement(By.xpath("//div[@class=\"product-information\"]")).isDisplayed();
       // 6. Increase quantity to 4
        WebElement quantity = driver.findElement(By.xpath("//input[@id=\"quantity\"]"));
        quantity.sendKeys("4");

       // 7. Click 'Add to cart' button

        driver.findElement(By.xpath("//button[@class=\"btn btn-default cart\"]")).click();
       // 8. Click 'View Cart' button

        driver.findElement(By.xpath("(//a[@href=\"/view_cart\"])[2]")).click();
       // 9. Verify that product is displayed in cart page with exact quantity

        driver.findElement(By.xpath("(//button[@class=\"disabled\"])[1]")).isDisplayed();
        driver.close();
    }
}
