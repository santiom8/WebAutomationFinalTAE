package com.globant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.basePage.BasePage;

public class CheckOutCompletePage extends BasePage {

    // find this element <h2 class="complete-header">Thank you for your order!</h2>
    @FindBy(className = "complete-header")
    private WebElement completeHeader;

    public CheckOutCompletePage(WebDriver driver) {
        super(driver);
    }

    public String getCompleteHeader() {
        return completeHeader.getText();
    }
}
