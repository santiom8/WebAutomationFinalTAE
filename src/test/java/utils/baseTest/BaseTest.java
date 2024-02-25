package utils.baseTest;

import com.globant.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import utils.SetDriver;

public class BaseTest {


    protected WebDriver driver;
    protected LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    @Parameters({"username", "password", "url"})
    public void beforeMethod(String username, String password, String url) {
      /*  System.setProperty("webdriver.chrome.driver", "C:\\Users\\santi\\IdeaProjects\\webAutomationPractice\\src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();*/
        SetDriver setDriver = new SetDriver();
        driver = setDriver.getDriver();
/*        driver = initDriver.getDriver();*/
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

    //load the initial page


  /*  @AfterMethod()
    public void afterMethod() {
        driver.close();
    }*/
}
