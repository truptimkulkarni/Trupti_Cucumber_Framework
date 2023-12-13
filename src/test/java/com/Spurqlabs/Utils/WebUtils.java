package com.Spurqlabs.Utils;

import com.Spurqlabs.Core.TestContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class WebUtils extends TestContext {
   // public static WebDriver driver;
    public  static WebDriver initDriver() throws IOException {
        //driver = new ChromeDriver();
        if(configUtil.getValue("Browser").equals("Chrome")){
            driver= new ChromeDriver();
        } else if  (configUtil.getValue("Browser").equals("Firefox")){
            driver= new FirefoxDriver();
        }

        return driver;
    }

    public static void closeDriver() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
        driver.quit();
    }
}
