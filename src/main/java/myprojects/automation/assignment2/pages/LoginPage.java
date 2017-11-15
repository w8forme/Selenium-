package myprojects.automation.assignment2.pages;

import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by veles on 15.11.2017.
 */
public class LoginPage {

   private String login = "webinar.test@gmail.com";
   private String password = "Xcg7299bnSmMuRLp9ITw";
   private WebElement loginField;
   private WebElement passField;
   private WebElement submitButton;
   private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginPage() {
        driver.get(Properties.getBaseAdminUrl());
    }

    public void fillEmailInput() {
        loginField = driver.findElement(By.id("email"));
        loginField.sendKeys(login);
    }

    public void fillPassInput() {
        passField = driver.findElement(By.id("passwd"));
        passField.sendKeys(password);
    }

    public void clickLoginBtn() {
        submitButton = driver.findElement(By.name("submitLogin"));
        submitButton.click();
    }
}
