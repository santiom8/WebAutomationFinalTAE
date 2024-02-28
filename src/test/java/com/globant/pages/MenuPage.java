package com.globant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.basePage.BasePage;

public class MenuPage extends BasePage {

    protected WebDriver driver;

    @FindBy(id = "inventory_sidebar_link")
    private WebElement inventorySidebarLink;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutSidebarLink;

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void clickElementSafe(WebElement element) {
        super.clickElementSafe(element);
    }

    public void clickLogout() {
        clickElementSafe(logoutSidebarLink);
    }

    public void clickInventorySidebarLink() {
        inventorySidebarLink.click();
    }
}
