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
        WebDriver driver = getConfiguredDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        LoginPage loginPage = new LoginPage(driver);
        AdminPage adminPage = new AdminPage(driver);
        List<By> elements;

        loginPage.openLoginPage();
        loginPage.fillEmailInput();
        loginPage.fillPassInput();
        loginPage.clickLoginBtn();

        String titleBeforeRefresh;
        String titleAfterRefresh;
        elements = adminPage.getMenuElements();
        for (By element: elements) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(element));
            driver.findElement(element).click();
            titleBeforeRefresh = driver.getTitle();
            driver.navigate().refresh();
            titleAfterRefresh = driver.getTitle();
            System.out.println(titleAfterRefresh);
            if (!(titleBeforeRefresh.equals(titleAfterRefresh))) {
                throw new IllegalArgumentException(titleBeforeRefresh + " and " + titleAfterRefresh + " doesn't match");
            }
        }
        driver.quit();
    }
}
