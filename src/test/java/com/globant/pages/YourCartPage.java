package com.globant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.basePage.BasePage;

import java.util.List;
import java.util.Optional;

public class YourCartPage extends BasePage {

    //list of products in the cart
    @FindBy(css = ".btn.btn_secondary.btn_small.cart_button")
    private List<WebElement> listButtonsCart;

    @FindBy(className = "title")
    private WebElement title;

    //Button to checkout
    @FindBy(id = "checkout")
    private WebElement checkoutButton;


    //constructor
    public YourCartPage(WebDriver driver) {
        super(driver);
    }

    public void clickCheckout() {
        checkoutButton.click();
    }

    public void removeProductsFromCart() {
        Optional<WebElement> currentProductOptional = listButtonsCart.stream().findFirst();
        if (currentProductOptional.isPresent()) {
            WebElement currentProduct = currentProductOptional.get();
            currentProduct.click();
            listButtonsCart.remove(currentProduct);
        }
    }

    public Integer getListProductsInCartSize() {
        return listButtonsCart.size();
    }

    public String getTitle() {
        return title.getText();
    }
}
