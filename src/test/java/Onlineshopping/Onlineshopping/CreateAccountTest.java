package Onlineshopping.Onlineshopping;


import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class CreateAccountTest  {
	
	WebDriver driver;
	HomePageC homepage;
	UserPage userpage;
	RegisterPage register;
	
	
@BeforeTest
	
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://advantageonlineshopping.com/");
		//driver.manage().window().maximize();
		homepage = new HomePageC(driver) ;
		userpage = new UserPage(driver);
		register = new RegisterPage(driver);
	}

@Test

public void testCreateAccount() throws InterruptedException {
       
        homepage.clickUserIcon();
        Thread.sleep(2000); // à remplacer par WebDriverWait
        userpage.clickCreateNewAccount();
        Thread.sleep(2000);


        

        String username = "asdjhghejn" ;
        String email = username + "@example.com";
        String password = "Test@1234";

        register.fillRegistrationForm(username, email, password);

        // Attendre que le nom d'utilisateur apparaisse
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("menuUserLink"), username));

        WebElement userMenu = driver.findElement(By.id("menuUserLink"));
        String displayedUsername = userMenu.getText();

    
        Assert.assertEquals(username, displayedUsername , "Le nom d'utilisateur affiché ne correspond pas.");
}




@AfterTest
public void tearDown() {
	driver.quit();
}


}