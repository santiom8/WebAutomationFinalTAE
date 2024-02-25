package com.globant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class CheckOutStepOnePage extends BasePage {
    @FindBy(id = "first-name")
    private WebElement firstName;
    @FindBy(id = "last-name")
    private WebElement lastName;
    @FindBy(id = "postal-code")
    private WebElement postalCode;
    @FindBy(id = "continue")
    private WebElement continueButton;


    public CheckOutStepOnePage(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    public void enterPostalCode(String postalCode) {
        this.postalCode.sendKeys(postalCode);
    }

    public void clickContinue() {
        continueButton.click();
    }

}
