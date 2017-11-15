package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckMainMenuTest extends BaseScript{

    public static void main(String[] args) throws InterruptedException {
       // TODO Script to check Main Menu items
        String login = "webinar.test@gmail.com";
        String password = "Xcg7299bnSmMuRLp9ITw";
        WebElement loginField;
        WebElement passwrdField;
        WebElement submitButton;
        WebDriver driver = getDriver();
        driver.get(Properties.getBaseAdminUrl());
        loginField = driver.findElement(By.id("email"));
        loginField.sendKeys(login);
        passwrdField = driver.findElement(By.id("passwd"));
        passwrdField.sendKeys(password);
        submitButton = driver.findElement(By.name("submitLogin"));
        submitButton.click();

        // ...
    }
}
