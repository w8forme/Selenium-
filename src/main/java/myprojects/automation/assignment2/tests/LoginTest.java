package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest extends BaseScript {

    public static void main(String[] args) throws InterruptedException {
        // TODO Script to execute login and logout steps
        WebDriver driver = getDriver();
        LoginPage loginPage = new LoginPage(driver);

        loginPage.openLoginPage();
        loginPage.fillEmailInput();
        loginPage.fillPassInput();
        loginPage.clickLoginBtn();
        Thread.sleep(4000);
        driver.findElement(By.id("employee_infos")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("header_logout")).click();
        driver.quit();
    }
}
