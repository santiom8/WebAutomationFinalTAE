package com.globant.tests;


import com.globant.Enum.PageElementsEnum;
import com.globant.pages.LoginPage;
import com.globant.pages.MenuPage;
import com.globant.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.baseTest.BaseTest;

public class LogoutTest extends BaseTest {

    @Test()
    public void logoutTest() {
        ProductsPage productsPage = new ProductsPage(driver);
        Assert.assertEquals(productsPage.getTitle(), PageElementsEnum.PRODUCTS_PAGE_TITLE.getTitle());
        productsPage.clickMenu();

        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickLogout();

        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isDisplayed());
    }
}
