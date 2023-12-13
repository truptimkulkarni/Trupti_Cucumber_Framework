package com.Spurqlabs.steps;

import com.Spurqlabs.Core.TestContext;
import com.Spurqlabs.Utils.WebUtils;
import com.Spurqlabs.Utils.configUtil;
import com.Spurqlabs.pages.basicCalculatorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

public class CalculatorSteps extends TestContext {

    basicCalculatorPage basiccalculatorpage;


    @Given("I am on basic calculator page")
    public void iAmOnCalculatorPage() throws IOException {

        //driver= WebUtils.initDriver();
        //driver.get("https://www.calculator.net/");
        driver.get(configUtil.getValue("App_Value"));
    }

    @When("I enter number {string} {string} {string}")
    public void iEnterNumber(String number1, String operator, String number2) {
        basiccalculatorpage=new basicCalculatorPage(driver);
        basiccalculatorpage.calculate(number1, operator, number2);

    }
    @Then("I see the result as {string}")
    public void iSeeTheResultAs(String expectedResult) throws InterruptedException {
        Assert.assertEquals(basiccalculatorpage.getResult(),expectedResult,"test passed");
        WebUtils.closeDriver();
    }


    @Then("I see result as {string}")
    public void iSeeResultAs(String expectedResult) throws InterruptedException {

        Assert.assertEquals(basiccalculatorpage.getResult(),expectedResult);
        WebUtils.closeDriver();

    }


    @When("I enter {string} {string} {string}")
    public void iEnterNumberOperatorNumber(String number1, String operator, String number2) {
        basiccalculatorpage=new basicCalculatorPage(driver);
        basiccalculatorpage.calculate(number1, operator, number2);
    }
}
