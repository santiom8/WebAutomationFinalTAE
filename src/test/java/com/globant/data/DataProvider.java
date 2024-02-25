
package com.globant.data;

public class DataProvider {

    @org.testng.annotations.DataProvider(name = "valid-login")
    public static Object[][] testDataValidLogIn() {
        return new Object[][]{
                {
                        "standard_user",
                        "secret_sauce"
                }
        };
    }
}
