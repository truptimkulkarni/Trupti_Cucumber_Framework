package com.Spurqlabs.pages;

import com.Spurqlabs.Core.TestContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class basicCalculatorPage  {
    WebDriver driver;
    public basicCalculatorPage(WebDriver driver1){
        driver=driver1;
    }
    public void calculate(String number1, String operator, String number2){

        driver.findElement(By.xpath("//span[text()='"+number1+"']")).click();
        driver.findElement(By.xpath("//span[text()='"+operator+"']")).click();
        driver.findElement(By.xpath("//span[text()='"+number2+"']")).click();

    }

    public String getResult(){

        return  driver.findElement(By.id("sciOutPut")).getText().trim();
    }
}
