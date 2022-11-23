package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.pages.WikipediaSearchPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wikipedia_StepDefinitions {

    WikipediaSearchPage wikipediaSearchPage = new WikipediaSearchPage();
    @Given("user is on the Wikipedia home page")
    public void user_is_on_the_wikipedia_home_page() {

        String url = ConfigurationReader.getProperty("wikiUrl");
        Driver.getDriver().get(url);

    }

    @When("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {

        wikipediaSearchPage.searchButton.click();

    }


    @When("user writes {string} in the wiki search box")
    public void userWritesInTheWikiSearchBox(String arg0) {

        wikipediaSearchPage.wikiSearchBox.sendKeys(arg0);

    }

    @Then("user sees {string} in the wiki title")
    public void userSeesInTheWikiTitle(String arg0) {

        String expectedTitle = arg0+" - Wikipedia";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Title is not same", actualTitle, expectedTitle);
    }
}
