package com.globant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.basePage.BasePage;

import java.sql.Driver;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductsPage extends BasePage {

    private final Set<Integer> listUsedRandomNumbers = new HashSet<>();
    @FindBy(css = ".btn.btn_primary.btn_small.btn_inventory")
    private List<WebElement> buttonsAddToCart;

    @FindBy(className = "title")
    private WebElement title;

    @FindBy(className = "shopping_cart_badge")
    private WebElement shoppingCartBadgeValue;

    @FindBy(className = "shopping_cart_link")
    private WebElement buttonShoppingCart;

    @FindBy(className = "logout_sidebar_link")
    private WebElement logoutSidebarLink;

    public ProductsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getProductNames() {
        return buttonsAddToCart;
    }

    public void addRandomProductToCart() {

        int random = (int) (Math.random() * buttonsAddToCart.size());
        while (listUsedRandomNumbers.contains(random)) {
            random = (int) (Math.random() * buttonsAddToCart.size());
        }
        listUsedRandomNumbers.add(random);
        buttonsAddToCart.get(random).click();
    }

    public String getTitle() {
        return title.getText();
    }

    public WebElement getShoppingCartBadge() {
        return shoppingCartBadgeValue;
    }

    public void clickShoppingCart() {
        buttonShoppingCart.click();
    }
}
