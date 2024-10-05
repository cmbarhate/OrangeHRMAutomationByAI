package AllPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    // Constructor to initialize the WebDriver and WebDriverWait
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds
    }

    // Locators for web elements
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.tagName("button");

    
    
    // Method to enter username with wait
    public void enterUsername(String username) {
        WebElement usernameElement = wait.until(ExpectedConditions.presenceOfElementLocated(usernameField));
        usernameElement.sendKeys(username);
    }

    // Method to enter password with wait
    public void enterPassword(String password) {
        WebElement passwordElement = wait.until(ExpectedConditions.presenceOfElementLocated(passwordField));
        passwordElement.sendKeys(password);
    }

    // Method to click the login button with wait
    public void clickLoginButton() {
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginBtn.click();
    }
}

