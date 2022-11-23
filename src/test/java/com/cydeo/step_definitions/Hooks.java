package com.cydeo.step_definitions;


import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

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
    public void tearDown(){

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
