package simplelogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class simpletesting {
    
    WebDriver driver;
    
    @BeforeMethod
    public void init() {
        // Setup WebDriver before each test method
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://elements.envato.com/sign-in");
        driver.manage().window().maximize();
    }
    
    @Test
    public void loginwithemptyusernameandemptypassword() throws InterruptedException {
        // Test login with empty credentials
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"sso-forms__submit\"]")).click();
        Thread.sleep(5000); // Adjust sleep time if necessary
    }
    @Test
    public void loginwithemptyusernameandinvalidpassword() throws InterruptedException {
        // Test login with empty credentials
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("fsdhjfgjkhdjkashd");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"sso-forms__submit\"]")).click();
        Thread.sleep(5000); // Adjust sleep time if necessary
    }
    @Test
    public void loginwithemptyusernameandvalidpassword() throws InterruptedException {
        // Test login with empty credentials
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("@kLJACyza27F3ES");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"sso-forms__submit\"]")).click();
        Thread.sleep(5000); // Adjust sleep time if necessary
    }
    @Test
    public void loginwithinvalidusernameandinvalidpassword() throws InterruptedException {
        // Test login with empty credentials
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("32445fdd");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("fef@kLJACyza27F3ES");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"sso-forms__submit\"]")).click();
        Thread.sleep(5000); // Adjust sleep time if necessary
    }
    @Test
    public void loginwithvalidusernameandemptypassword() throws InterruptedException {
        // Test login with empty credentials
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("@kLJACyza27F3ES");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"sso-forms__submit\"]")).click();
        Thread.sleep(5000); // Adjust sleep time if necessary
    }
    @Test
    public void loginwithinvalidusernameandvalidpassword() throws InterruptedException {
        // Test login with empty credentials
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("43fer4");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("@kLJACyza27F3ES");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"sso-forms__submit\"]")).click();
        Thread.sleep(5000); // Adjust sleep time if necessary
    }
    @Test
    public void loginwithevalidusernameandinvalidpassword() throws InterruptedException {
        // Test login with empty credentials
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("ahnafrs");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("@kLJACyza#$#27F3ES");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"sso-forms__submit\"]")).click();
        Thread.sleep(5000); // Adjust sleep time if necessary
    }
    public void loginwithevalidusernameandemptypassword() throws InterruptedException {
        // Test login with empty credentials
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("ahnafrs");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"sso-forms__submit\"]")).click();
        Thread.sleep(5000); // Adjust sleep time if necessary
    }
    
    @Test
    public void loginwithvalidusernameandvalidpassword() throws InterruptedException {
        // Test login with valid credentials
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("ahnafrs");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("@kLJACyza27F3ES");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"sso-forms__submit\"]")).click();
        Thread.sleep(5000); // Adjust sleep time if necessary
    }
    
    @AfterMethod
    public void teardown() throws InterruptedException {
    	 Thread.sleep(5000);
        // Close the driver after each test method
        if (driver != null) {
        	 
            driver.quit();
        }
    }
}
