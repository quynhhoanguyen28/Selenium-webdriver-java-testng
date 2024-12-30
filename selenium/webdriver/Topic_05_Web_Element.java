package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_05_Web_Element {
    WebDriver driver;

    @BeforeClass
    public void initialBrowser() {
        driver = new ChromeDriver();
    }

    @Test
    public void TC_01_Verify_Is_Display() {
        driver.get("https://automationfc.github.io/basic-form/index.html");

        WebElement email = driver.findElement(By.id("mail"));
        WebElement education = driver.findElement(By.id("edu"));
        WebElement ageUnder18 = driver.findElement(By.id("under_18"));
        WebElement nameUser5 = driver.findElement(By.xpath("//legend[contains(string(),'Hover')]/following-sibling::div[5]//h5"));


        if(email.isDisplayed()) {
            email.sendKeys("hoa@gmail.com");
            System.out.println("Element is displayed");
        }

        if(education.isDisplayed()) {
            education.sendKeys("HUST");
            System.out.println("Element is displayed");
        }

        if(ageUnder18.isDisplayed()) {
            ageUnder18.click();
            System.out.println("Element is displayed");
        }

        if (!nameUser5.isDisplayed()) {
            System.out.println("Element is not displayed");
        }

    }

    @Test
    public void TC_02_Verify_Is_Enable() {
        driver.get("https://automationfc.github.io/basic-form/index.html");

        Boolean isEmailEnabled = driver.findElement(By.id("mail")).isEnabled();

        Assert.assertTrue(isEmailEnabled);
    }

    @Test
    public void TC_03() {
    }



    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
