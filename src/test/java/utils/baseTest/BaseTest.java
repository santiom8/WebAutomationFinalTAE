package utils.baseTest;

import com.globant.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import utils.SetDriver;

import java.time.Duration;

public class BaseTest {
    protected WebDriverWait wait;

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected static final Logger logger = LogManager.getLogger(BaseTest.class);

    @BeforeMethod(alwaysRun = true)
    @Parameters({"username", "password", "url"})
    public void beforeMethod(String username, String password, String url) {
        SetDriver setDriver = new SetDriver();
        wait = new WebDriverWait(setDriver.getDriver(), Duration.ofSeconds(20));
        driver = setDriver.getDriver();
        navigateTo(url);
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    @AfterMethod()
    public void afterMethod() {
        driver.close();
    }
}
