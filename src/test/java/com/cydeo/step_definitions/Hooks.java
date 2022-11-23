package com.cydeo.step_definitions;


import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //import from io.cucumber.java not from jUnit
    @Before(value = "@login" )
    public void setupLoginScenario(){
        System.out.println("--Setting up browser with further details...");
    }

    @Before
    public void setupScenario(){
        System.out.println("--Setting up browser with further details...");
    }

    @After
    public void tearDown(Scenario scenario){

        //if my scenario fails
           // take a screenshot

        //scenario.isFailed();

        if (scenario.isFailed()) {

            byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }


        System.out.println("--Teardown steps are being applied...");
        //Driver.closeDriver();
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("---setup applying for each steps...");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("---teardown applying for each step");
    }



}
