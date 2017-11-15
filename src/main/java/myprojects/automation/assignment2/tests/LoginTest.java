package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest extends BaseScript {

    public static void main(String[] args) throws InterruptedException {
        // TODO Script to execute login and logout steps
        WebDriver driver = getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        LoginPage loginPage = new LoginPage(driver);
        By exitBtn =By.id("header_logout");
        By userIcon = By.id("employee_infos");

        loginPage.openLoginPage();
        loginPage.fillEmailInput();
        loginPage.fillPassInput();
        loginPage.clickLoginBtn();
        wait.until(ExpectedConditions.visibilityOfElementLocated(userIcon));
        driver.findElement(userIcon).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(exitBtn));
        driver.findElement(exitBtn).click();
        driver.quit();
    }
}
