package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class DataTable_StepDefinitions {

    @Then("user should see below words displayed")
    public void user_should_see_below_words_displayed(Map<String , Object> listOfFruits) {

        System.out.println("How many fruits in the basket"+listOfFruits.size());
        System.out.println("listOfFruits = " + listOfFruits);

    }

}
