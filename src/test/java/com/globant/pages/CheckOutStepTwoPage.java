package com.globant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import utils.basePage.BasePage;

public class CheckOutStepTwoPage extends BasePage {
    @FindBy(id = "finish")
    private WebElement finishButton;

    public CheckOutStepTwoPage(WebDriver driver) {
        super(driver);
    }

    public void clickFinishButton() {
        finishButton.click();
    }
}
