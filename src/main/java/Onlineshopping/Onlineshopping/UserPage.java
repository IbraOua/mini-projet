package Onlineshopping.Onlineshopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserPage {

    WebDriver driver;

    By createNewAccountLink = By.cssSelector("a.create-new-account.ng-scope");

    public UserPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCreateNewAccount() throws InterruptedException {
    	
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement createAccount = wait.until(ExpectedConditions.elementToBeClickable(createNewAccountLink));

            // Scroll vers l'élément si nécessaire
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", createAccount);
            Thread.sleep(300); // petite pause pour stabiliser

            // Clic via JavaScript pour éviter les overlays
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", createAccount);

        
    }
}


