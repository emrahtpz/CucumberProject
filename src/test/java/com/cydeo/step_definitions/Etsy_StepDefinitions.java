package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Etsy_StepDefinitions {

    @Given("user is on the Etsy landing page")
    public void user_is_on_the_etsy_landing_page() {

        String url = ConfigurationReader.getProperty("etsyUrl");

        Driver.getDriver().get(url);

    }
    @Then("user should see Etsy title as expected")
    public void user_should_see_etsy_title_as_expected() {

        String expectedTitle = "Etsy Turkey - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue("Title is not expected!", actualTitle.equals(expectedTitle));

    }

    EtsySearchPage etsySearchPage = new EtsySearchPage();

    @When("use types Wooden spoon in the search bar")
    public void use_types_wooden_spoon_in_the_search_bar() {

        etsySearchPage.etsySearchBar.sendKeys("Wooden spoon");

    }

    @When("user clicks the search button")
    public void user_clicks_the_search_button() {

        etsySearchPage.etsySearchButton.click();


    }

    @Then("user sees title is Wooden spoon - Etsy")
    public void user_sees_title_is_wooden_spoon_etsy() {

        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue("Title is not expected", actualTitle.equals(expectedTitle));

    }
}
