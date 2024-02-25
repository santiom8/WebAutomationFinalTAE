package com.globant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {

    protected WebDriver driver;

    @FindBy(id = "inventory_sidebar_link")
    private WebElement inventorySidebarLink;

    @FindBy(className = "bm-item menu-item")
    private WebElement logoutSidebarLink;


    public MenuPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLogoutSidebarLink() {
        logoutSidebarLink.click();
    }
}
