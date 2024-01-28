import Utilities.ReusableMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.time.Duration;
import java.util.List;

public class Place_Order_Register_before_Checkout {

    @Test
    public void PlaceOrderRegisterBeforeCheckout() throws  Exception {


        // 1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com'
        // 3. Verify that home page is visible successfully
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://automationexercise.com/");

        String expectedURL = "https://automationexercise.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);

        // 4. Click 'Signup / Login' button
        driver.findElement(By.xpath("//*[text()=\" Signup / Login\"]")).click();


        // 5. Fill all details in Signup and create account
        //driver.findElement(By.xpath("//*[text() = \"Register / Login\"]")).click();
        // 9. Fill all details in Signup and create account
        driver.findElement(By.xpath("//input[@name = \"name\"]")).sendKeys("nazim");
        driver.findElement(By.xpath("(//input[@name = \"email\"])[2]")).sendKeys("isim@gmail.com");
        driver.findElement(By.xpath("//*[text() = \"Signup\"]")).click();
        // ---- Reklam Kapat ----------------
        Robot robot = new Robot();
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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", scroll);
        ReusableMethods.wait(1);
        createAccount.click();
        ReusableMethods.wait(1);
        // 6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        // 7. Verify ' Logged in as username' at top
        WebElement accountCreated = driver.findElement(By.xpath("//*[text()=\"Congratulations! Your new account has been successfully created!\"]"));
        System.out.println("Account Created      :  " + accountCreated.getText());
        driver.findElement(By.xpath("//*[text()=\"Continue\"]")).click();

        // ---- Reklam Kapat ----------------
        ReusableMethods.wait(2);
        Robot robot1 = new Robot();
        int x2 = 30;
        int y2 = 707;
        robot1.mouseMove(x2, y2);
        robot1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        ReusableMethods.wait(2);
       // ----------------------------------
       // 8. Add products to cart
        // 9. Click 'Cart' button
        WebElement scrollen = driver.findElement(By.xpath("(//h2[@class =\"title text-center\"])[1]"));
        js.executeScript("arguments[0].scrollIntoView(true);", scrollen);
        ReusableMethods.wait(3);
        WebElement eklenecekUrun  = driver.findElement(By.xpath("(//a[@class =\"btn btn-default add-to-cart\"])[1]"));
        eklenecekUrun.click();
        ReusableMethods.wait(3);
        WebElement kartaGit = driver.findElement(By.xpath("//*[text()=\"View Cart\"]"));
        kartaGit.click();
        /* ------ List ve for Kullanarak sepete URUNLER ekleme --------------------------------
        //List<WebElement> SepeteEkle = driver.findElements(By.xpath("//a[@class =\"btn btn-default add-to-cart\"]"));

        //List<WebElement> ilkUcUrun = SepeteEkle.subList(0, 3);
        //System.out.println("Sepetteki ürün sayisi  :  " + SepeteEkle.size());
        for (WebElement sepeteEkle : ilkUcUrun) {

            //  -------Scroll Down to next Element ------------
            WebElement scrollen = driver.findElement(By.xpath("(//h2[@class =\"title text-center\"])[1]"));
            js.executeScript("arguments[0].scrollIntoView(true);", scrollen);
            WebElement urunElementi = sepeteEkle.findElement(By.xpath("(//a[@class =\"btn btn-default add-to-cart\"])"))
            // driver.navigate().refresh();
            ReusableMethods.wait(4);
            System.out.println(ilkUcUrun);
            sepeteEkle.click();
            ReusableMethods.wait(2);
            WebElement devam = driver.findElement(By.xpath("//*[text() = \"Continue Shopping\"]"));
            devam.click();
            ReusableMethods.wait(8);
            driver.navigate().refresh();
            ReusableMethods.wait(5);
        }
        */
        Robot robot3 = new Robot();
        int x3 = 30; // Örnek olarak 100 x koordinatı
        int y3 = 707; // Örnek olarak 200 y koordinatı
        robot1.mouseMove(x3, y3);
        robot1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        ReusableMethods.wait(2);
        // -----Karta ekleme operasyonu --------------------
            // 10. Verify that cart page is displayed
        ReusableMethods.wait(1);
        driver.findElement(By.xpath("//*[text()=\"Shopping Cart\"]")).isDisplayed();
            // 11. Click Proceed To Checkout
        ReusableMethods.wait(1);
        driver.findElement(By.xpath("//a[@class =  \"btn btn-default check_out\"]")).click();
            // 12. Verify Address Details and Review Your Order
        ReusableMethods.wait(1);
        driver.findElement(By.xpath("(//h2[@class =  \"heading\"])[1]")).isDisplayed();
            // 13. Enter description in comment text area and click 'Place Order'
        driver.findElement(By.xpath("//textarea[@name=\"message\"]")).sendKeys("See you later Elegator!");
        ReusableMethods.wait(1);
        WebElement scrol = driver.findElement(By.xpath("//*[text()=\"If you would like to add a comment about your order, please write it in the field below.\"]"));
        js.executeScript("arguments[0].scrollIntoView(true);", scrol);
        ReusableMethods.wait(2);
        driver.findElement(By.xpath("//a[@class=\"btn btn-default check_out\"]")).click();
            // 14. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        WebElement isim = driver.findElement(By.xpath("//input[@name=\"name_on_card\"]"));
        isim.click();
        action.sendKeys("muaz")
                .sendKeys(Keys.TAB)
                .sendKeys("648279303")
                .sendKeys(Keys.TAB)
                .sendKeys("311")
                .sendKeys(Keys.TAB)
                .sendKeys("6")
                .sendKeys(Keys.TAB)
                .sendKeys("2500").perform();
            // 15. Click 'Pay and Confirm Order' button
        driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
            // 16. Verify success message 'Your order has been placed successfully!'
        ReusableMethods.wait(2);
        driver.findElement(By.xpath("//*[text()=\"Congratulations! Your order has been confirmed!\"]")).isDisplayed();
            // 17. Click 'Delete Account' button
        ReusableMethods.wait(2);
        driver.findElement(By.xpath("//a[@href = \"/delete_account\"]")).click();
            // 18. Verify 'ACCOUNT DELETED!' and click 'Continue' button
        Robot robot4 = new Robot();
        int x4 = 30; // Örnek olarak 100 x koordinatı
        int y4 = 707; // Örnek olarak 200 y koordinatı
        robot4.mouseMove(x3, y3);
        robot4.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot4.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        ReusableMethods.wait(2);
        driver.findElement(By.xpath("//*[text() = \"Account Deleted!\"]")).isDisplayed();
        driver.close();
    }}