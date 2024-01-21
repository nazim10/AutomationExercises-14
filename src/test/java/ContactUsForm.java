import Utilities.ReusableMethods;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class ContactUsForm {

    @Test
    public void ContactUs() throws AWTException {


        // 1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com'

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://automationexercise.com/");

        // 3. Verify that home page is visible successfully

        String expectedURL = "https://automationexercise.com/";
        String actualURL = driver.getCurrentUrl();

        // 4. Click on 'Contact Us' button

        driver.findElement(By.xpath("//a[@href = \"/contact_us\"]")).click();

        // 5. Verify 'GET IN TOUCH' is visible

        driver.findElement(By.xpath("//h2[@class = \"title text-center\"]")).isDisplayed();

        // 6. Enter name, email, subject and message
        // 7. Upload file
        // 8. Click 'Submit' button

        driver.findElement(By.xpath("//input[@name = \"name\"]")).click();
        Actions action = new Actions(driver);
        action.sendKeys(Keys.TAB)
                .sendKeys("havadan@sudan.com")
                .sendKeys(Keys.TAB)
                .sendKeys("havadan sudan")
                .sendKeys(Keys.TAB)
                .sendKeys("abidik gubidik twist")
                .perform();
        driver.findElement(By.xpath("//input[@name =\"upload_file\"]")).sendKeys("C:\\Users\\Nutzer\\Pictures\\1-40.jpg");
        Robot robot = new Robot();
        ReusableMethods.wait(3);
        // Altta acilir pencereni asagi kaymasi icin Tıklamak istediğiniz noktanın koordinatlarını belirtin
            int x = 30; // Örnek olarak 100 x koordinatı
            int y = 707; // Örnek olarak 200 y koordinatı

            // Fareyi belirtilen koordinatlara hareket ettir
            robot.mouseMove(x, y);

            // Sol tıklama yap

            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            ReusableMethods.wait(3);

        // Submit iconuna Tikamak icin o noktanın koordinatlari
        int x2 = 250; // Örnek olarak 100 x koordinatı
        int y2 = 742; // Örnek olarak 200 y koordinatı

        // Fareyi belirtilen koordinatlara hareket ettir
        robot.mouseMove(x2, y2);

        // Sol tıklama yap

        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#contact-us-form > div:nth-child(7) > input\")");
       //WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
       //        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type ='submit']")));
       //JavascriptExecutor executor = (JavascriptExecutor) driver;
       //executor.executeScript("arguments[0].click();", element);
        //WebElement onayla = driver.findElement(By.xpath("//input[@type ='submit']"));
        //onayla.click();



        //----------------------- ROBOT CLASS ILE DOSYA SECIMI VE YÜKLEME -----------------------------
         /*  Robot robot = new Robot();
            StringSelection stringSelection = new StringSelection("C:\\Users\\Nutzer\\Pictures\\1-40.jpg");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
            // CTRL + V (Yapıştırma) kombinasyonunu kullanarak dosya yolu yapıştır
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            driver.findElement(By.xpath("//input[@type = \"submit\"]")).click();

             robot.keyPress(KeyEvent.VK_ALT);
             robot.keyPress(KeyEvent.VK_ENTER);
             robot.keyRelease(KeyEvent.VK_ENTER);
             robot.keyRelease(KeyEvent.VK_ALT);

             robot.keyPress(KeyEvent.VK_TAB);
             robot.keyRelease(KeyEvent.VK_TAB);
             robot.keyPress(KeyEvent.VK_TAB);
             robot.keyRelease(KeyEvent.VK_TAB);
             robot.keyPress(KeyEvent.VK_ENTER);
             robot.keyRelease(KeyEvent.VK_ENTER);}}

             robot.keyPress(KeyEvent.VK_ENTER);
             robot.keyRelease(KeyEvent.VK_ENTER);


              // Enter tuşuna basarak dosyayı seç
             robot.keyPress(KeyEvent.VK_ENTER);
             robot.keyRelease(KeyEvent.VK_ENTER);}}

             // Bekleme süresi eklesek

               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
               WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
               WebElement uploadButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name=\"submit\"]")));

            // Yükleme düğmesine tıklayalim
               uploadButton.click();
               driver.findElement(By.xpath("//input[@type = \"submit\"]")).click(); */

        // 9. Click OK button

        //driver.switchTo().alert().dismiss();
ReusableMethods.wait(3);
        Robot robot1 = new Robot();
        // Tıklamak istediğiniz noktanın koordinatlarını belirtin
        int x1 = 864; // Örnek olarak 100 x koordinatı
        int y1 = 492; // Örnek olarak 200 y koordinatı

        // Fareyi belirtilen koordinatlara hareket ettir
        robot.mouseMove(x1, y1);
        // Sol tıklama yap
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        ReusableMethods.wait(3);
        Robot robot3 = new Robot();
        // Tıklamak istediğiniz noktanın koordinatlarını belirtin
        int x3 = 832; // Örnek olarak 100 x koordinatı
        int y3 = 544; // Örnek olarak 200 y koordinatı

        // Fareyi belirtilen koordinatlara hareket ettir
        robot.mouseMove(x1, y1);
        // Sol tıklama yap
        robot3.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot3.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot3.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot3.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);



       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
       // WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@x-score= \"1\"])[1]")));
       // element.click();
        //driver.findElement(By.xpath("(//span[@x-score= \"1\"])[1]")).click();

        // 10. Verify success message 'Success! Your details have been submitted successfully.' is visible

        driver.findElement(By.xpath("//div[@class =\"status alert alert-success\"]")).isDisplayed();

// 11. Click 'Home' button and verify that landed to home page successfully

        driver.findElement(By.xpath("//a[@class =\"btn btn-success\"]")).click();
        ReusableMethods.wait(3);
        Robot robot4 = new Robot();
        // Tıklamak istediğiniz noktanın koordinatlarını belirtin
        int x4 = 824; // Örnek olarak 100 x koordinatı
        int y4 = 550; // Örnek olarak 200 y koordinatı

        // Fareyi belirtilen koordinatlara hareket ettir
        robot.mouseMove(x1, y1);
        // Sol tıklama yap
        robot4.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot4.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot4.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot4.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/contact_us#google_vignette");
        driver.close();


        //-----ROBOT CLASS ILE REKLAMA TIKLAMA-----------

       // int x1 = 810; // Örnek olarak 100 x koordinatı
       // int y1 = 558; // Örnek olarak 200 y koordinatı
//
       // // Fareyi belirtilen koordinatlara hareket ettir
       // robot.mouseMove(x1, y1);
//
       // // Sol tıklama yap
       // robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
       // robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);



    }
}