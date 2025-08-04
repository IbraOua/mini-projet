package Onlineshopping.Onlineshopping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

	WebDriver driver;

    // Localisateurs
    By username = By.name("usernameRegisterPage");
    By email = By.name("emailRegisterPage");
    By password = By.name("passwordRegisterPage");
    By confirmPassword = By.name("confirm_passwordRegisterPage");
    By firstName = By.name("first_nameRegisterPage");
    By lastName = By.name("last_nameRegisterPage");
    By phoneNumber = By.name("phone_numberRegisterPage");
    By city = By.name("cityRegisterPage");
    By address = By.name("addressRegisterPage");
    By state = By.name("state_/_province_/_regionRegisterPage");
    By postalCode = By.name("postal_codeRegisterPage");
    By agreeCheckbox = By.name("i_agree");
    By registerButton = By.xpath("//*[@id=\"register_btn\"]");

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillRegistrationForm(String user, String mail, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(email).sendKeys(mail);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(confirmPassword).sendKeys(pass);
        driver.findElement(firstName).sendKeys("Ibrahim");
        driver.findElement(lastName).sendKeys("Touhami");
        driver.findElement(phoneNumber).sendKeys("0600000000");
        driver.findElement(city).sendKeys("Casablanca");
        driver.findElement(address).sendKeys("123 Rue Exemple");
        driver.findElement(state).sendKeys("Casablanca");
        driver.findElement(postalCode).sendKeys("20000");
        driver.findElement(agreeCheckbox).click();
        driver.findElement(registerButton).click();
    }
}

