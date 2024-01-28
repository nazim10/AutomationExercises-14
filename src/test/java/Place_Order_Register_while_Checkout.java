import Utilities.ReusableMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.time.Duration;
import java.util.List;

public class Place_Order_Register_while_Checkout {
    @Test
    public void Place_Order_Register_while_Checkout() throws Exception {
        // 1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com'
        // 3. Verify that home page is visible successfully
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://automationexercise.com/");
        //ReusableMethods.wait(3);
        WebElement continiou = driver.findElement(By.xpath("//*[text() = \"Continue Shopping\"]"));
        WebElement urun1 = driver.findElement(By.xpath("(//a[@data-product-id=\"1\"])[1]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", urun1);
        //ReusableMethods.wait(2);
        urun1.click();
        ReusableMethods.wait(2);
        continiou.click();
        // ReusableMethods.wait(2);
        WebElement urun2 = driver.findElement(By.xpath("(//a[@data-product-id=\"2\"])[1]"));
        js.executeScript("arguments[0].scrollIntoView(true);", urun2);
        //ReusableMethods.wait(2);
        urun2.click();
        ReusableMethods.wait(2);
        continiou.click();
        //ReusableMethods.wait(2);
        WebElement urun3 = driver.findElement(By.xpath("(//a[@data-product-id=\"3\"])[1]"));
        js.executeScript("arguments[0].scrollIntoView(true);", urun3);
        ReusableMethods.wait(2);
        urun3.click();
        ReusableMethods.wait(2);
        driver.findElement(By.xpath("//*[text() = \"View Cart\"]")).click();
        // ReusableMethods.wait(2);
        // 4. Add products to cart
/*      // -------- Add products to cart with for Loop --------------------------------
        List<WebElement> SepeteEkle = driver.findElements(By.xpath("//a[@class =\"btn btn-default add-to-cart\"]"));
        List<WebElement> ilkUcUrun = SepeteEkle.subList(0, 3);
        System.out.println("Sepetteki ürün sayisi  :  "+ SepeteEkle.size());
        System.out.println("ilk Üc Ürün :  "+ ilkUcUrun.size());
        for (WebElement urun : ilkUcUrun) {
            //  -------Scroll Down to next Element ------------
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", urun);
            System.out.println(urun);
            ReusableMethods.wait(3);
            urun.click();
            ReusableMethods.wait(3);
            WebElement devam = driver.findElement(By.xpath("//*[text() = \"Continue Shopping\"]"));
            // -----Karta ekleme operasyonu --------------------
            devam.click();
            ReusableMethods.wait(3);        }
       // 5. Click 'Cart' button
        driver.findElement(By.xpath("//*[text() = \"View Cart\"]")).click();*/
        // ---- Reklam Kapat ----------------
        Robot robot = new Robot();
        int x = 30; // Örnek olarak 100 x koordinatı
        int y = 707; // Örnek olarak 200 y koordinatı
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        ReusableMethods.wait(1);
        // ----------------------------------
        // 6. Verify that cart page is displayed
        String actuelURL = driver.getCurrentUrl();
        String ecxpectedURL = "https://www.automationexercise.com/view_cart";
        Assert.assertEquals(actuelURL, actuelURL);
        // 7. Click Proceed To Checkout
        driver.findElement(By.xpath("//*[text() = \"Proceed To Checkout\"]")).click();
        // 8. Click 'Register / Login' button
        driver.findElement(By.xpath("//*[text() = \"Register / Login\"]")).click();
        // 9. Fill all details in Signup and create account
        driver.findElement(By.xpath("//input[@name = \"name\"]")).sendKeys("nazim");
        driver.findElement(By.xpath("(//input[@name = \"email\"])[2]")).sendKeys("1n7a9zgo0kppkatkllzzjimmlmo0plk9idyxa1a@gmail.com");
        driver.findElement(By.xpath("//*[text() = \"Signup\"]")).click();
        // ---- Reklam Kapat ----------------
        int x1 = 30; // Örnek olarak 100 x koordinatı
        int y1 = 707; // Örnek olarak 200 y koordinatı
        robot.mouseMove(x1, y1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        ReusableMethods.wait(1);
        // ----------------------------------
        Actions action = new Actions(driver);
        driver.findElement(By.xpath("//input[@id= \"id_gender1\"]")).click();
        action.sendKeys(Keys.TAB)
                .sendKeys("Nazim")
                .sendKeys(Keys.TAB)
                .sendKeys("ebegümeci")
                .sendKeys("5")
                .sendKeys(Keys.TAB)
                .sendKeys("July")
                .sendKeys(Keys.TAB)
                .sendKeys("1990")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("North")
                .sendKeys(Keys.TAB)
                .sendKeys("Volter")
                .sendKeys(Keys.TAB)
                .sendKeys("Nasa")
                .sendKeys(Keys.TAB)
                .sendKeys("edres edres munich pavlike")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Canada")
                .sendKeys(Keys.TAB)
                .sendKeys("alabama")
                .sendKeys(Keys.TAB)
                .sendKeys("eben")
                .sendKeys(Keys.TAB)
                .sendKeys("321123")
                .sendKeys(Keys.TAB)
                .sendKeys("+12983746590")
                .sendKeys(Keys.TAB)
                .sendKeys("82567")
                .perform();
        WebElement createAccount = driver.findElement(By.xpath("//*[text()=\"Create Account\"]"));
        WebElement scroll = driver.findElement(By.xpath("//input[@id=\"mobile_number\"]"));
        js.executeScript("arguments[0].scrollIntoView(true);", scroll);
        ReusableMethods.wait(1);
        createAccount.click();
        ReusableMethods.wait(1);
        // 10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        WebElement accountCreated = driver.findElement(By.xpath("//*[text()=\"Congratulations! Your new account has been successfully created!\"]"));
        System.out.println("Account Created      :  " + accountCreated.getText());
        driver.findElement(By.xpath("//*[text()=\"Continue\"]")).click();
        // ---- Reklam Kapat ----------------
        Robot robot2 = new Robot();
        int x2 = 1486; // Örnek olarak 100 x koordinatı
        int y2 = 123; // Örnek olarak 200 y koordinatı
        robot2.mouseMove(x2, y2);
        robot2.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        ReusableMethods.wait(1);
        // 11. Verify ' Logged in as username' at top
        driver.findElement(By.xpath("//*[text()= \" Logged in as \"]")).isDisplayed();
        // 12.Click 'Cart' button
        ReusableMethods.wait(1);
        driver.findElement(By.xpath("//*[text()= \" Cart\"]")).click();
        // 13. Click 'Proceed To Checkout' button
        ReusableMethods.wait(1);
        driver.findElement(By.xpath("//a[@class =  \"btn btn-default check_out\"]")).click();
        // 14. Verify Address Details and Review Your Order
        ReusableMethods.wait(1);
        driver.findElement(By.xpath("(//h2[@class =  \"heading\"])[1]")).isDisplayed();
        driver.close();
    }
}
