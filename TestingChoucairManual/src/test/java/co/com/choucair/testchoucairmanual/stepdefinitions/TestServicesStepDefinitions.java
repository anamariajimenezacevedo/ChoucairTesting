package co.com.choucair.testchoucairmanual.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import static jdk.nashorn.internal.runtime.regexp.RegExpFactory.validate;


public class TestServicesStepDefinitions {
private Scenario scenario;
    @Before
    public void getScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @Given("^(.*)$")
    public void testUP(String step) {
    validate(step, scenario.getName());
    }
}