package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Random;

public class Topic_06_Textbox_Textarea {

    WebDriver driver;
    @BeforeClass
    public void initialBrowser() {
        //driver = new ChromeDriver();
        FirefoxOptions options = new FirefoxOptions();
        options.setAcceptInsecureCerts(true);
        driver = new FirefoxDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @Test
    public void TC_01() {
        Random ran = new Random();
        String firstName = "Hoa";
        String lastName = "Nguyen";
        String email = firstName + lastName + ran.nextInt(1000) + "@gmail.com";
        driver.get("http://live.techpanda.org/");

        driver.findElement(By.xpath("//div[@class='footer']//a[@title='My Account']")).click();
        driver.findElement(By.xpath("//a[@title='Create an Account']")).click();
        driver.findElement(By.cssSelector("input#firstname")).sendKeys(firstName);
        driver.findElement(By.cssSelector("input#lastname")).sendKeys(lastName);
        driver.findElement(By.cssSelector("input#email_address")).sendKeys(email);
        driver.findElement(By.cssSelector("input#password")).sendKeys("12345678");
        driver.findElement(By.cssSelector("input#confirmation")).sendKeys("12345678");
        driver.findElement(By.xpath("//button[@title='Register']")).click();

        Assert.assertEquals(driver.findElement(By.cssSelector("li.success-msg")).getText(), "Thank you for registering with Main Website Store.");

        String contactInfo = driver.findElement(By.xpath("//h3[text()='Contact Information']/parent::div/following-sibling::div/p")).getText();
        System.out.println(contactInfo);
        Assert.assertTrue(contactInfo.contains(firstName + " " + lastName) && contactInfo.contains(email));

        driver.findElement(By.xpath("//a[text()='Mobile']")).click();
        driver.findElement(By.xpath("//h2[@class='product-name']//a[@title='Samsung Galaxy']")).click();
        driver.findElement(By.xpath("//a[text()='Add Your Review']")).click();
        driver.findElement(By.xpath("//input[@id='Quality 1_5']")).click();
        driver.findElement(By.cssSelector("textarea#review_field")).sendKeys("Very good product");
        driver.findElement(By.cssSelector("input#summary_field")).sendKeys("Very good");
        driver.findElement(By.xpath("//button[@title='Submit Review']")).click();

        Assert.assertEquals(driver.findElement(By.cssSelector("li.success-msg")).getText(), "Your review has been accepted for moderation.");

    }

    @Test
    public void TC_02() {
    }

    @Test
    public void TC_03() {
    }



    @AfterClass
    public void afterClass() {
        //driver.quit();
    }

}





