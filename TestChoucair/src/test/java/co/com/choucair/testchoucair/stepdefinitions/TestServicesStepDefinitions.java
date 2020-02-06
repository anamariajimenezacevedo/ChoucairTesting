package co.com.choucair.testchoucair.stepdefinitions;

import co.com.choucair.testchoucair.steps.TestServices;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestServicesStepDefinitions {

    @Steps
    TestServices user;

    @Given("^That I selected the service option$")
    public void thatISelectedTheServiceOption() {
        user.isTheHomePage ();
    }

    @When("^you selected the main section options correctly$")
    public void youSelectedTheMainSectionOptionsCorrectly() {
        user.isTheServicesPage ();
    }

    @Then("^you should see the message$")
    public void youShouldSeeTheMessage() {
        user.finalValidation ();
    }

    @When("^you selected the Solutions Briefcase options correctly$")
    public void youSelectedTheSolutionsBriefcaseOptionsCorrectly() {
        user.isTheOptionsBriefcase ();
    }

    @Then("^you should see the message the Solutions Briefcase section$")
    public void youShouldSeeTheMessageTheSolutionsBriefcaseSection()
    {
        user.finalValidationBriefcase ();
    }
}