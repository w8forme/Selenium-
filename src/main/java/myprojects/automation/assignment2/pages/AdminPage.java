package myprojects.automation.assignment2.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel Holinko on 12.11.2017.
 */
public class AdminPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private By dashboard = By.id("tab-AdminDashboard");
    private By orders = By.id("subtab-AdminParentOrders");
    private By catalog = By.id("subtab-AdminCatalog");
    private By customer = By.id("subtab-AdminParentCustomer");
    private By customerThreads = By.id("subtab-AdminParentCustomerThreads");
    private By stats = By.id("subtab-AdminStats");
    private By modules = By.id("subtab-AdminParentModulesSf");
    private By themes = By.id("subtab-AdminParentThemes");
    private By shipping = By.id("subtab-AdminParentShipping");
    private By payment = By.id("subtab-AdminParentPayment");
    private By international = By.id("subtab-AdminInternational");
    private By shopParameters = By.id("subtab-ShopParameters");
    private By advancedParameters = By.id("subtab-AdminAdvancedParameters");

    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<By> getMenuElements() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard));
        List<By> elements = new ArrayList<>();
        elements.add(dashboard);
        elements.add(orders);
        elements.add(catalog);
        elements.add(customer);
        elements.add(customerThreads);
        elements.add(stats);
        elements.add(modules);
        elements.add(themes);
        elements.add(shipping);
        elements.add(payment);
        elements.add(international);
        elements.add(shopParameters);
        elements.add(advancedParameters);
        return elements;
    }

    public void clickOnDashboard() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard));
        driver.findElement(dashboard).click();
    }

    public void clickOnOrders() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(orders));
        driver.findElement(orders).click();
    }

    public void clickOnCatalog() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(catalog));
        driver.findElement(catalog).click();
    }

    public void clickOnCustomer() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(customer));
        driver.findElement(customer).click();
    }

    public void clickOnCustomerThreads() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(customerThreads));
        driver.findElement(customerThreads).click();
    }

    public void clickOnStats() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(stats));
        driver.findElement(stats).click();
    }

    public void clickOnModules() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(modules));
        driver.findElement(modules).click();
    }

    public void clickOnThemes() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(themes));
        driver.findElement(themes).click();
    }

    public void clickOnShipping() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(shipping));
        driver.findElement(shipping).click();
    }

    public void clickOnPayment() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(payment));
        driver.findElement(payment).click();
    }

    public void clickOnInternational() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(international));
        driver.findElement(international).click();
    }

    public void clickOnShopParameters() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(shopParameters));
        driver.findElement(shopParameters).click();
    }

    public void clickOnAdvancedParameters() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(advancedParameters));
        driver.findElement(advancedParameters).click();
    }




}
