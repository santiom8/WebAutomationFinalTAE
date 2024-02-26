package com.globant.Enum;

public enum PageElementsEnum {
    PRODUCTS_PAGE_TITLE("Products"),
    YOUR_CART_PAGE_TITLE("Your Cart"),
    CHECKOUT_STEP_ONE_PAGE_TITLE("Checkout: Your Information"),
    CHECKOUT_STEP_TWO_PAGE_TITLE("Checkout: Overview"),
    COMPLETE_PAGE_TITLE("Thank you for your order!");

    private String title;
    PageElementsEnum(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

}
