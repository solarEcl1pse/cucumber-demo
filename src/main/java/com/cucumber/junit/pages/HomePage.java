package com.cucumber.junit.pages;

import com.cucumber.junit.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.String.format;

public class HomePage extends BasePage {

    private static final String CUCUMBER_URL = "https://cucumber.io/";
    private static final String TEXT_PATTERN = "%s[contains(text(),'%s')]";
    private static final String MENU_SECTION = "//*[contains(@class,'nav-link')]";
    private static final String CHILD_MENU_ITEM = "//*[contains(@class,'dropdown')]//*[contains(@class,'item')]";
    private static final String SEARCH_ICON = "//*[contains(@class,'nav-item-search')]//*[contains(@class,'fal fa-search')]";
    private static final String SEARCH_FIELD = "//*[@id=\"searchComponent\"]/div[@class='sb-search show']/div[2]/div[1]/div/input";
    private static final String SEARCH_SECTION = "//div[contains(@class,'filter-item')]";
    private static final String SEARCH_RESULT = "//div[contains(@class,'result-list')]//div[contains(@class,'link-title')][contains(text(),'Announcing cucumber-electron')]";

    public void openCucumberWebsite() {
        DriverManager.getDriver().get(CUCUMBER_URL);
    }

    public WebElement menuSection(String linkText) {
        return findElement(By.xpath(format(TEXT_PATTERN, MENU_SECTION, linkText)));
    }

    public WebElement menuChildItem(String linkText) {
        return findElement(By.xpath(format(TEXT_PATTERN, CHILD_MENU_ITEM, linkText)));
    }

    public WebElement searchIcon() {
        return findElement(By.xpath(SEARCH_ICON));
    }

    public WebElement searchField() {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SEARCH_FIELD)));
        return findElement(By.xpath(SEARCH_FIELD));
    }

    public WebElement searchSection(String linkText) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SEARCH_SECTION)));
        return findElement(By.xpath(format(TEXT_PATTERN, SEARCH_SECTION, linkText)));
    }

    public WebElement searchResult() {
        return findElement(By.xpath(SEARCH_RESULT));
    }
}
