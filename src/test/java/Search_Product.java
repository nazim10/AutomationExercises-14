import Utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.time.Duration;
import java.util.List;

public class Search_Product {
    @Test
    public void SearchProduct() throws AWTException {

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

       //3. Verify that home page is visible successfully

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://automationexercise.com/";
        Assert.assertEquals(expectedURL, actualURL);

       //4. Click on 'Products' button

            driver.findElement(By.xpath("//i[@class =\"material-icons card_travel\"]")).click();

            // ------------------  Reklam Kapat  --------------------
        ReusableMethods.wait(3);
      //  driver.findElement(By.xpath("//span[@dir = \"auto\"]")).click();

        Robot robot = new Robot();
        int x = 830;
        int y = 553;
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

       //5. Verify user is navigated to ALL PRODUCTS page successfully
        driver.findElement(By.xpath("//h2[@class =\"title text-center\"]")).isDisplayed();

       //6. Enter product name in search input and click search button
        WebElement searchbar = driver.findElement(By.xpath("//input[@id = \"search_product\"]"));
        searchbar.sendKeys("cotton");
        driver.findElement(By.xpath("//button[@id = \"submit_search\"]")).click();

       //7. Verify 'SEARCHED PRODUCTS' is visible

        driver.findElement(By.xpath("//*[text()= \"Searched Products\"]")).isDisplayed();

       //8. Verify all the products related to search are visible

        List<WebElement> IlgiliUrunler = driver.findElements(By.xpath("(//i[@class= \"fa fa-plus-square\"])[1]"));

        for (WebElement ilgili : IlgiliUrunler){
            assert IlgiliUrunler.contains(ilgili);
        }
        driver.close();
    }
}
