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
    private By dashboard = By.xpath("//span[contains(text(),'Dashboard')]");
    private By orders = By.xpath("//span[contains(text(),'Заказы')]");
    private By catalog = By.xpath("//span[contains(text(),'Каталог')]");
    private By customer = By.xpath("//span[contains(text(),'Клиенты')]");
    private By customerThreads = By.xpath("//span[contains(text(),'Служба поддержки')]");
    private By stats = By.xpath("//span[contains(text(),'Статистика')]");
    private By modules = By.xpath("//span[contains(text(),'Modules')]");
    private By themes = By.xpath("//span[contains(text(),'Design')]");
    private By shipping = By.xpath("//span[contains(text(),'Доставка')]");
    private By payment = By.xpath("//span[contains(text(),'Способ оплаты')]");
    private By international = By.xpath("//span[contains(text(),'International')]");
    private By shopParameters = By.xpath("//span[contains(text(),'Shop Parameters')]");
    private By advancedParameters = By.xpath("//span[contains(text(),'Конфигурация')]");

    public AdminPage(WebDriver driver) {
        this.driver = driver;
        this.wait =  new WebDriverWait(driver, 10);
    }

    public List<By> getMenuElements() {
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
}
