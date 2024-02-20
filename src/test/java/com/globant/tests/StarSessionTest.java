package com.globant.tests;

import com.globant.data.DataProvider;
import com.globant.pages.LoginPage;
import com.globant.pages.ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class StarSessionTest {

    @Test(dataProvider = "valid-login", dataProviderClass = DataProvider.class)
    public void testHomePage(String username, String password) {
        String driverPath = "C:\\Users\\santi\\IdeaProjects\\WebAutomation\\src\\test\\utils\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        //get element html

  /*      WebElement element = driver.findElement(By.id("user-name"));
        element.click();
        element.sendKeys(username);
        WebElement element2 = driver.findElement(By.id("password"));
        element2.click();
        element2.sendKeys(password);
        WebElement element3 = driver.findElement(By.id("login-button"));
        element3.click();*/
        //use login page
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();

        /*WebElement element = driver.findElement(By.className("inventory_container"));*/
    /*    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        List<WebElement> lang_list = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".btn.btn_primary.btn_small.btn_inventory")));*/
        ProductsPage productsPage = new ProductsPage(driver);
        List<WebElement> productsPageRetrieve = productsPage.getProductNames();
        productsPage.addRandomProductToCart();
        productsPage.addRandomProductToCart();
        productsPage.addRandomProductToCart();
        String tin = productsPage.getShoppingCartBadge().getText();
        productsPage.clickShoppingCart();
        /*WebElement elementSelect =  productsPageRetrieve.get(0);
        elementSelect.click();
        WebElement elementSelect2 =  productsPageRetrieve.get(1);
        elementSelect2.click();
*/
    }
}
