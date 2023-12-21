package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenAWebPage extends DriverSetup {
//    public static void main (String[] args){
//        WebDriver browser = new ChromeDriver();
//        browser.get("https://github.com/sumu9897?tab=repositories");
//    }
    @Test
    public void openAPage(){

//        WebDriver browser = new FirefoxDriver();
        browser.get("https://www.toptenmartltd.com/");
//        System.out.println(browser.getTitle());
        Assert.assertEquals(browser.getTitle(),"Top Ten Mart – Top Fashion Brand in Banglades");
//        browser.close();
    }

}
