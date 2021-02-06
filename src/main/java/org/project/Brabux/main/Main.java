package org.project.Brabux.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\franc\\Videos\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless","--disable-gpu","--window-size==1920,1200","--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
    }
}
