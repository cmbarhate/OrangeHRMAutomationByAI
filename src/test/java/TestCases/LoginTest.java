package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import AllPages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeTest
    public void setup() {
        // Setup ChromeDriver using WebDriver Manager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Initialize the LoginPage object with the WebDriver
        loginPage = new LoginPage(driver);
    }

    @Test
    public void performLogin() {
        // Open the OrangeHRM login page
        driver.get("https://opensource-demo.orangehrmlive.com/auth/login");

        // Call methods from the LoginPage class to interact with the login page
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLoginButton();

        // Optionally, add assertions here to verify login success
    }

    @AfterTest
    public void teardown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}

