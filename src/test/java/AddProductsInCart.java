import Utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.time.Duration;
import java.util.List;

public class AddProductsInCart {

    @Test
    public void testAddProducts() throws Exception {

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


       // 4. Click 'Products' button
        driver.findElement(By.xpath("(//a[@href=\"/products\"])[1]")).click();

        //  -------------  REKLAM KAPAT ----------------------

        Robot robot = new Robot();
        int x = 30; // Örnek olarak 100 x koordinatı
        int y = 707; // Örnek olarak 200 y koordinatı

        // Fareyi belirtilen koordinatlara hareket ettir
        robot.mouseMove(x, y);

        // Sol tıklama yap

        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        ReusableMethods.wait(3);

        // ----------scroll down to element wit Js  ---------
        WebElement buton = driver.findElement(By.xpath("//input[@name =\"search\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", buton);
        ReusableMethods.wait(2);

        // 5. Hover over first product and click 'Add to cart'

       //Actions action = new Actions(driver);
       //action.moveToElement(driver.findElement(By.xpath("//a[@href=\"/product_details/1\"]")));
        driver.findElement(By.xpath("//a[@data-product-id='1']")).click();

        // 6. Click 'Continue Shopping' button
        ReusableMethods.wait(2);
        driver.findElement(By.xpath("//*[text()=\"Continue Shopping\"]")).click();

       // 7. Hover over second product and click 'Add to cart'
        //action.moveToElement(driver.findElement(By.xpath("//a[@href=\"/product_details/2\"]")));
        driver.findElement(By.xpath("(//a[@data-product-id=\"2\"])[1]")).click();


        // 8. Click 'View Cart' button
        driver.findElement(By.xpath("//*[text()=\"View Cart\"]")).click();

       // 9. Verify both products are added to Cart
        //  ---------------- Liste ----------------------------------------------------------------

        List<WebElement> liste = driver.findElements(By.xpath("//img[@class=\"product_image\"]"));

        for (WebElement product : liste){
            System.out.println("products  = " + product.toString());
        }

       // 10. Verify their prices, quantity and total price
        //  ---------------- Price ----------------------------------------------------------------
        List<WebElement> Pricelist = driver.findElements(By.xpath("//td[@class=\"cart_price\"]"));

        for (WebElement Price : Pricelist){
            System.out.println("products  = " + Price.toString());
        }

        //  ---------------- Quantity  ----------------------------------------------------------------
        List<WebElement> Quantity = driver.findElements(By.xpath("//button[@class=\"disabled\"]"));

        for (WebElement quantity : Quantity){
            System.out.println("products  = " + quantity.toString());
        }

        //  ---------------- Total Price  ----------------------------------------------------------------
        List<WebElement> total = driver.findElements(By.xpath("//button[@class=\"disabled\"]"));

        for (WebElement totalPrice : total){
            System.out.println("products  = " + totalPrice.toString());
        }
        driver.close();
    }
}
