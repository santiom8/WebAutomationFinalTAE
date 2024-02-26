package com.globant.tests;

import com.globant.Enum.PageElementsEnum;
import com.globant.Enum.PageElementsQuantityEnums;
import com.globant.pages.ProductsPage;
import com.globant.pages.YourCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.baseTest.BaseTest;

public class RemovingElementsCartTest extends BaseTest {
    @Test
    public void removeItemCartTest() {
        //Products page
        ProductsPage productsPage = new ProductsPage(driver);
        Assert.assertEquals(productsPage.getTitle(), PageElementsEnum.PRODUCTS_PAGE_TITLE.getTitle());
        productsPage.addRandomProductToCart();
        productsPage.addRandomProductToCart();
        productsPage.addRandomProductToCart();
        Assert.assertEquals(productsPage.getShoppingCartBadge(), PageElementsQuantityEnums.QUANTITY_PRODUCTS_ADDED.getValue());
        productsPage.clickShoppingCart();

        //Your Cart page
        YourCartPage yourCartPage = new YourCartPage(driver);
        Assert.assertEquals(yourCartPage.getTitle(), PageElementsEnum.YOUR_CART_PAGE_TITLE.getTitle());
        yourCartPage.removeProductsFromCart();
        yourCartPage.removeProductsFromCart();
         yourCartPage.removeProductsFromCart();
        Assert.assertEquals((int) yourCartPage.getListProductsInCartSize(), PageElementsQuantityEnums.QUANTITY_PRODUCTS_AFTER_REMOVE.getValue());
    }
}
