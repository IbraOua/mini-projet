package Onlineshopping.Onlineshopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageC {
    WebDriver driver;
    
    
    By userIcon = By.xpath("//a[@id=\"menuUserLink\"]");

    public HomePageC(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUserIcon() {
        driver.findElement(userIcon).click();
    }
}


