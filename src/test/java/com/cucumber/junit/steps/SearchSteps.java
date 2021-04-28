package com.cucumber.junit.steps;

import com.cucumber.junit.pages.HomePage;
import com.cucumber.junit.pages.ResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchSteps {

    private final HomePage homePage = new HomePage();
    private final ResultPage resultPage = new ResultPage();

    @When("the user clicks on the Search icon")
    public void clicksOnTheIcon() {
        homePage.searchIcon().click();
    }

    @And("the user types {string} to the search field")
    public void theUserTypesToTheSearchField(String query) {
        homePage.searchField().click();
        homePage.searchField().sendKeys(query);
    }

    @And("the user clicks on the {string} result section")
    public void clickOnSection(String section) {
        homePage.searchSection(section).click();
    }

    @And("the user clicks on the first Open Source link")
    public void theUserClicksOnTheFirstOpenSourceLink() {
        homePage.searchResult().click();
    }

    @Then("page with {string} title is displayed")
    public void pageWithLinkTitleIsDisplayed(String pageTitle) {
        assertThat(resultPage.isPageWithTitleDisplayed(pageTitle))
                .overridingErrorMessage("Page with title '%s' is not displayed", pageTitle)
                .isTrue();
    }
}
