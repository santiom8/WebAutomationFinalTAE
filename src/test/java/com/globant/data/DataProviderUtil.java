
package com.globant.data;
import org.testng.annotations.DataProvider;
public class DataProviderUtil {

    @DataProvider(name = "fillTheCheckoutStepOne")
    public static Object[][] testDataCheckoutStepOne() {
        return new Object[][] {
                {
                        "Santiago",
                        "Correa",
                        "23114"
                }
        };
    }
}
