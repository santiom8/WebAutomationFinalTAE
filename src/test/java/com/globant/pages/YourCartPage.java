package com.globant.pages;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCartPage {

    //validate existance of the products in the cart
    //validate title
    //validate checkout button
    //validate remove button
    @FindBy(className = "title")
    private WebElement title;

    
}
