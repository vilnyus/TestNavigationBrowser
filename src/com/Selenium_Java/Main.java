package com.Selenium_Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void visit(String path) {
        chromeDriver.navigate().to(site_root_address_url);
    }

    public static void testGoToPageWithinSiteUsingFunction(){
        visit("/demo");
        visit("/demo/survey");
        visit("/");
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        testGoToPageWithinSiteUsingFunction();

        String site_root_address_url = "http://test.testwisely.com";
    }
}
