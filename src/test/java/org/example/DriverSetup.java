package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DriverSetup {
    public WebDriver browser;

    @BeforeSuite
    public void openABrowser(){
        browser = new FirefoxDriver();
    }

    @AfterSuite
    public void quiteBrowser(){
        browser.close();
    }
}
