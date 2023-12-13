package com.Spurqlabs.steps;

import com.Spurqlabs.Core.TestContext;
import com.Spurqlabs.Utils.WebUtils;
import com.Spurqlabs.Utils.configUtil;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class ScientificCalculatorsSteps extends TestContext {

    //WebDriver driver;
    @Given("I am on Scientific calculator page")
    public void iAmOnScientificCalculatorPage() throws IOException {
        //driver= WebUtils.initDriver();
        //driver.get("https://www.calculator.net/scientific-calculator.html");/

        driver.get(configUtil.getValue("SApp_Value"));
    }
}
