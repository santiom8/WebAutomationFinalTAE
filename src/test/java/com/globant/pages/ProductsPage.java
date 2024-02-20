package com.globant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;
import java.util.List;

public class ProductsPage {
    /*    @FindBy(css = "\".btn.btn_primary.btn_small.btn_inventory\"")*/
    @FindBy(css = ".btn.btn_primary.btn_small.btn_inventory")
    private List<WebElement> buttonsAddToCart;

    @FindBy(className = "title")
    private WebElement title;

    @FindBy(className = "shopping_cart_badge")
    private WebElement shoppingCartBadgeValue;

    @FindBy(className = "shopping_cart_link")
    private WebElement buttonShoppingCart;

    public ProductsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getProductNames() {
        return buttonsAddToCart;
    }

    public void addRandomProductToCart() {
        int random = (int) (Math.random() * buttonsAddToCart.size());
        buttonsAddToCart.get(random).click();
    }

    public WebElement getTitle() {
        return title;
    }

    public WebElement getShoppingCartBadge() {
        return shoppingCartBadgeValue;
    }

    public void clickShoppingCart() {
        buttonShoppingCart.click();
    }

}
