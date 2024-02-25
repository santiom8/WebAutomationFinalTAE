package com.globant.tests;

import com.globant.pages.CheckOutStepOnePage;
import com.globant.pages.ProductsPage;
import com.globant.pages.YourCartPage;
import org.testng.annotations.Test;
import org.testng.Assert;

import utils.baseTest.BaseTest;

public class PurchaseProductTest extends BaseTest {

    private String PRODUCTS_PAGE_TITLE = "Products";



    @Test()
    public void purchaseTest() {
        ProductsPage productsPage = new ProductsPage(driver);
        Assert.assertEquals(PRODUCTS_PAGE_TITLE, productsPage.getTitle());
        productsPage.addRandomProductToCart();
        productsPage.clickShoppingCart();
        YourCartPage yourCartPage = new YourCartPage(driver);
        yourCartPage.clickCheckout();
        CheckOutStepOnePage checkOutStepOnePage = new CheckOutStepOnePage(driver);
        checkOutStepOnePage.enterFirstName("John");
        checkOutStepOnePage.enterLastName("Doe");
        checkOutStepOnePage.enterPostalCode("12345");
        checkOutStepOnePage.clickContinue();
        //checkout step one page

    }
}
