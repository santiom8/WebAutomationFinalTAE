package com.globant.Enum;

public enum PageElementsQuantityEnums {

    //Enums for RemovingElementsCartTest
    QUANTITY_PRODUCTS_ADDED(3),
    QUANTITY_PRODUCTS_AFTER_REMOVE(0),
    //Enums for PurchaseTest
    PRODUCT_ADDED(1);

    //Enums for PurchaseTest

    private final int value;

    PageElementsQuantityEnums(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
