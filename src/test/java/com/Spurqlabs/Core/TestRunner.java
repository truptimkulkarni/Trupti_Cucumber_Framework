package com.Spurqlabs.Core;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


    @CucumberOptions(features = {"src/test/resources"},
            glue = {"com/Spurqlabs/steps", "com/Spurqlabs/Core"},tags="@ui",
            plugin = { "pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                    "pretty", "json:test-output/Cucumber.json" })

public class TestRunner extends AbstractTestNGCucumberTests {
        @DataProvider
        @Override
        public Object[][] scenarios() {
            return super.scenarios();
        }
    }

