package com.cydeo.step_definitions;

import com.cydeo.pages.LibraryPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class DataTable_StepDefinitions {

    LibraryPage libraryPage = new LibraryPage();

    @Then("user should see below words displayed")
    public void user_should_see_below_words_displayed(Map<String , Object> listOfFruits) {

        System.out.println("How many fruits in the basket"+listOfFruits.size());
        System.out.println("listOfFruits = " + listOfFruits);

    }

    @Given("user is on the login page of library app")
    public void user_is_on_the_login_page_of_library_app() {
        String url = ConfigurationReader.getProperty("libraryUrl");
        Driver.getDriver().get(url);
    }
    @When("user enters username and password as below")
    public void user_enters_username_and_password_as_below(Map<String,String> user13) throws InterruptedException {

        String username = user13.get("username");// the alternative way create object of

        libraryPage.emailInputBox.sendKeys(username);
        libraryPage.passwordInputBox.sendKeys(user13.get("password"));

        libraryPage.signIn.click();
        Thread.sleep(1000);

    }

    @Then("user should see title is Library")
    public void userShouldSeeTitleIsLibrary() {




        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Library";

        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
