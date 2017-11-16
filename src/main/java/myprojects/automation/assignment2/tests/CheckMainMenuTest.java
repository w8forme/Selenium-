package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.pages.AdminPage;
import myprojects.automation.assignment2.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CheckMainMenuTest extends BaseScript {

    public static void main(String[] args) throws InterruptedException {
        // TODO Script to check Main Menu items
        WebDriver driver = getDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        LoginPage loginPage = new LoginPage(driver);
        AdminPage adminPage = new AdminPage(driver);
        List<By> elements;

        loginPage.openLoginPage();
        loginPage.fillEmailInput();
        loginPage.fillPassInput();
        loginPage.clickLoginBtn();

        elements = adminPage.getMenuElements();
        for (By element: elements) {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            driver.findElement(element).click();
            Thread.sleep(2000);
        }

//        String beforeRefresh;
//        String afterRefresh;
//        if (!(beforeRefresh.equals(afterRefresh))) {
//            throw new IllegalArgumentException(beforeRefresh + " and " + afterRefresh + " doesn't match");
//        }
        //*[@id="nav-sidebar"]/ul


        driver.quit();

        // ...
    }
}
