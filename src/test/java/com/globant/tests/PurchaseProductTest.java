package com.globant.tests;

import com.globant.Enum.PageElementsEnum;
import com.globant.Enum.PageElementsQuantityEnums;
import com.globant.data.DataProviderUtil;
import com.globant.pages.*;
import org.testng.annotations.Test;
import org.testng.Assert;
import utils.baseTest.BaseTest;

public class PurchaseProductTest extends BaseTest {

    @Test(dataProvider = "fillTheCheckoutStepOne", dataProviderClass = DataProviderUtil.class)
    public void purchaseTest(String firstName, String lastName, String postalCode) {
        logger.info("Running purchase test.............");
        //Products page
        ProductsPage productsPage = new ProductsPage(driver);
        Assert.assertEquals(productsPage.getTitle(), PageElementsEnum.PRODUCTS_PAGE_TITLE.getTitle());
        logger.info("The products page was loaded successfully");
        productsPage.addRandomProductToCart();
        logger.info("Select product randomly added to the cart");
        Assert.assertEquals(productsPage.getShoppingCartBadge(), PageElementsQuantityEnums.PRODUCT_ADDED.getValue());
        logger.info("The product was added to the cart");
        productsPage.clickShoppingCart();

        //Your Cart page
        YourCartPage yourCartPage = new YourCartPage(driver);
        Assert.assertEquals(yourCartPage.getTitle(), PageElementsEnum.YOUR_CART_PAGE_TITLE.getTitle());
        logger.info("Your cart page was loaded successfully");
        yourCartPage.clickCheckout();

        //CheckOutStepOne page
        CheckOutStepOnePage checkOutStepOnePage = new CheckOutStepOnePage(driver);
        Assert.assertEquals(checkOutStepOnePage.getTitle(), PageElementsEnum.CHECKOUT_STEP_ONE_PAGE_TITLE.getTitle());
        logger.info("The checkout step one page was loaded successfully");
        checkOutStepOnePage.enterFirstName(firstName);
        checkOutStepOnePage.enterLastName(lastName);
        checkOutStepOnePage.enterPostalCode(postalCode);
        checkOutStepOnePage.clickContinue();

        //CheckOutStepTwo page
        CheckOutStepTwoPage checkOutStepTwoPage = new CheckOutStepTwoPage(driver);
        Assert.assertEquals(checkOutStepTwoPage.getTitle(), PageElementsEnum.CHECKOUT_STEP_TWO_PAGE_TITLE.getTitle());
        logger.info("The checkout step two page was loaded successfully");
        checkOutStepTwoPage.clickFinishButton();

        //CheckOutComplete page
        CheckOutCompletePage checkOutCompletePage = new CheckOutCompletePage(driver);
        Assert.assertEquals(checkOutCompletePage.getTitle(), PageElementsEnum.COMPLETE_PAGE_TITLE.getTitle());
        logger.info("The checkout complete page was loaded successfully");
    }
}
