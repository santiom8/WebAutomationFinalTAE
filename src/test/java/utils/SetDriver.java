package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetDriver {

    protected WebDriver driver;

    public SetDriver(){
        //TODO: verify the browser version
        System.setProperty("webdriver.chrome.driver","C:\\Users\\santi\\IdeaProjects\\WebAutomationFinalTAE\\src\\test\\utils\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
