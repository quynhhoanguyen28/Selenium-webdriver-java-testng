package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_00_template {

    WebDriver driver;
    @BeforeClass
    public void initialBrowser() {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
    }

    @Test
    public void TC_01() {
    }

    @Test
    public void TC_02() {
    }

    @Test
    public void TC_03() {
    }



    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}





