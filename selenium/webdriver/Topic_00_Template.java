package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_00_Template {

    WebDriver driver;
    @BeforeClass
    public void initialBrowser() {
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
    }

    @Test
    public void TC_01() {
        driver.findElement(By.id("register-button"));
    }

    @Test
    public void TC_02() {
        driver.findElement(By.className("search-box-button"));
    }

    @Test
    public void TC_03() {
        driver.findElement(By.tagName("input"));
    }

    @Test
    public void TC_04() {
        driver.findElement(By.linkText("Search"));
    }

    @Test
    public void TC_05() {
        driver.findElement(By.partialLinkText("product"));
    }

    @Test
    public void TC_06() {
        driver.findElement(By.name("Gender")).click();
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}





