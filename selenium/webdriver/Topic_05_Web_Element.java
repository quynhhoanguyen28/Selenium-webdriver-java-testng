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

    //Web element exercise
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

        boolean isEmailEnabled = driver.findElement(By.id("mail")).isEnabled();
        boolean isAgeUnder18Enabled = driver.findElement(By.id("under_18")).isEnabled();
        boolean isEduEnabled = driver.findElement(By.id("edu")).isEnabled();
        boolean isJob1Enabled = driver.findElement(By.id("job1")).isEnabled();
        boolean isJob2Enabled = driver.findElement(By.id("job2")).isEnabled();
        boolean isInterestDevEnabled = driver.findElement(By.id("development")).isEnabled();
        boolean isSlider1Enabled = driver.findElement(By.id("slider-1")).isEnabled();

        Assert.assertTrue(isEmailEnabled);
        Assert.assertTrue(isAgeUnder18Enabled);
        Assert.assertTrue(isEduEnabled);
        Assert.assertTrue(isJob1Enabled);
        Assert.assertTrue(isJob2Enabled);
        Assert.assertTrue(isInterestDevEnabled);
        Assert.assertTrue(isSlider1Enabled);

        boolean isPwEnabled = driver.findElement(By.id("disable_password")).isEnabled();
        boolean isAgeDisabledEnabled = driver.findElement(By.id("radio-disabled")).isEnabled();
        boolean isBioEnabled = driver.findElement(By.id("bio")).isEnabled();
        boolean isJob3Enabled = driver.findElement(By.id("job3")).isEnabled();
        boolean isInterestDisabledEnabled = driver.findElement(By.id("check-disbaled")).isEnabled();
        boolean isSlider2Enabled = driver.findElement(By.id("slider-2")).isEnabled();

        Assert.assertFalse(isPwEnabled);
        Assert.assertFalse(isAgeDisabledEnabled);
        Assert.assertFalse(isBioEnabled);
        Assert.assertFalse(isJob3Enabled);
        Assert.assertFalse(isInterestDisabledEnabled);
        Assert.assertFalse(isSlider2Enabled);

    }

    @Test
    public void TC_03_Verify_Selected() {
        driver.get("https://automationfc.github.io/basic-form/index.html");
        WebElement under18 =  driver.findElement(By.id("under_18"));
        WebElement java = driver.findElement(By.id("java"));

        under18.click();
        java.click();

        if (under18.isSelected()) {
            System.out.println("Element is selected");
        }
        else {
            System.out.println("Element is de-selected");
        }

        if (java.isSelected()) {
            System.out.println("Element is selected");
        }
        else {
            System.out.println("Element is de-selected");
        }

        java.click();

        if (java.isSelected()) {
            System.out.println("Element is selected");
        }
        else {
            System.out.println("Element is de-selected");
        }
    }

    @Test
    public void TC_04_Register_MailChimp() {
        driver.get("https://login.mailchimp.com/signup/");

        driver.findElement(By.id("email")).sendKeys("hoa@gmail.com");

    }

    //Login exercise
    @Test
    public void TC_01_Empty_Email_Pw() {
        driver.get("http://live.techpanda.org/");

        driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();
        driver.findElement(By.xpath("//button[@id='send2']")).click();

        Assert.assertEquals(driver.findElement(By.id("advice-required-entry-email")).getText(), "This is a required field.");
        Assert.assertEquals(driver.findElement(By.id("advice-required-entry-pass")).getText(), "This is a required field.");
    }

    @Test
    public void TC_02_Invalid_Email() {
        driver.get("http://live.techpanda.org/");

        driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();
        driver.findElement(By.id("email")).sendKeys("1234@123.1234");
        driver.findElement(By.id("pass")).sendKeys("12345678");
        driver.findElement(By.xpath("//button[@id='send2']")).click();

        Assert.assertEquals(driver.findElement(By.id("advice-validate-email-email")).getText(), "Please enter a valid email address. For example johndoe@domain.com.");
    }

    @Test
    public void TC_03_Invalid_Password() {
        driver.get("http://live.techpanda.org/");

        driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();
        driver.findElement(By.id("email")).sendKeys("hoa@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("1234");
        driver.findElement(By.xpath("//button[@id='send2']")).click();

        Assert.assertEquals(driver.findElement(By.id("advice-validate-password-pass")).getText(), "Please enter 6 or more characters without leading or trailing spaces.");
    }

    @Test
    public void TC_04_Incorrect_Pw() {
        driver.get("http://live.techpanda.org/");

        driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();
        driver.findElement(By.id("email")).sendKeys("automation@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123123123");
        driver.findElement(By.xpath("//button[@id='send2']")).click();

        Assert.assertEquals(driver.findElement(By.xpath("//li[@class='error-msg']")).getText(), "Invalid login or password.");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
