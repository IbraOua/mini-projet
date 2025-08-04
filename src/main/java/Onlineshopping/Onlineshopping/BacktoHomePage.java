package Onlineshopping.Onlineshopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BacktoHomePage {
	
	WebDriver driver;
	
	By userIcon = By.xpath("//a[@id=\"menuUserLink\"]");

    public BacktoHomePage(WebDriver driver) {
        this.driver = driver;
    }

}
