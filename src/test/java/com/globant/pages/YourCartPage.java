package com.globant.pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class YourCartPage {

    //validate existance of the products in the cart
    //validate title
    //validate checkout button
    //validate remove button
    @FindBy(className = "title")
    private WebElement title;

    @FindBy(id="checkout")
    private WebElement checkoutButton;

    @FindBy(className="cart_item")
    private List<WebElement> cartItemList;

    //constructor
    public YourCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickCheckout(){
        checkoutButton.click();
    }
}
