package com.Spurqlabs.Core;

import com.Spurqlabs.Utils.WebUtils;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Hooks extends TestContext {

    @Before
    public void beforeScenario() throws IOException {
        driver= WebUtils.initDriver();
    }

    public void afterScenario() throws InterruptedException {
        WebUtils.closeDriver();
    }
}
