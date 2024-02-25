package com.globant.tests;

import com.globant.pages.*;
import org.testng.annotations.Test;
import org.testng.Assert;

import utils.baseTest.BaseTest;

public class PurchaseProductTest extends BaseTest {

    private String PRODUCTS_PAGE_TITLE = "Products";
    private String CHECKOUT_COMPLETE_HEADER = "Thank you for your order!";


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

        CheckOutStepTwoPage checkOutStepTwoPage = new CheckOutStepTwoPage(driver);
        checkOutStepTwoPage.clickFinishButton();
        CheckOutCompletePage checkOutCompletePage = new CheckOutCompletePage(driver);
        Assert.assertEquals(CHECKOUT_COMPLETE_HEADER, checkOutCompletePage.getCompleteHeader());
    }
}
