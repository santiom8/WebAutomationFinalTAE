package com.globant.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    public static WebDriver driver;

    public static void initialization(){
        String driverPath = "C:\\Users\\santi\\IdeaProjects\\WebAutomation\\src\\test\\utils\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver =  new ChromeDriver();
    }
}
