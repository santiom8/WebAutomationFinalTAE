package com.globant.tests;


import com.globant.pages.LoginPage;
import com.globant.pages.MenuPage;
import com.globant.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.baseTest.BaseTest;

public class LogoutTest extends BaseTest {

    private String ProductsPageTitle = "Products";

    @Test()
    public void logoutTest() {
        ProductsPage productsPage = new ProductsPage(driver);
        Assert.assertEquals(productsPage.getTitle(), ProductsPageTitle);
        productsPage.clickMenu();
        MenuPage menuPage = new MenuPage(driver);
        menuPage.clickLogout();
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isDisplayed());
    }
}
