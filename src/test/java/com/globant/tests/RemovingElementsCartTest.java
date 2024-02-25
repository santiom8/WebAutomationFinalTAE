package com.globant.tests;

import com.globant.pages.ProductsPage;
import com.globant.pages.YourCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.baseTest.BaseTest;

import java.time.Duration;

public class RemovingElementsCartTest extends BaseTest {


    @Test
    public void removeItemCartTest() {
        ProductsPage productsPage = new ProductsPage(driver);
        productsPage.addRandomProductToCart();
        productsPage.addRandomProductToCart();
        productsPage.addRandomProductToCart();
        productsPage.addRandomProductToCart();
        productsPage.clickShoppingCart();
        //put the delay here
        YourCartPage yourCartPage = new YourCartPage(driver);
        yourCartPage.removeProductsFromCart();
        yourCartPage.removeProductsFromCart();
        yourCartPage.removeProductsFromCart();
        yourCartPage.removeProductsFromCart();
        Assert.assertEquals((int) yourCartPage.getListProductsInCartSize(), 0);
        //validate the cart is empty


    }
}
