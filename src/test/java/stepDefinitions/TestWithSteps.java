package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.StepClass;

public class TestWithSteps {

    @Steps
    StepClass stepClass;

    @Given("step open the wifi settings page")
    public void stepOpenTheWifiSettingsPage() {
        stepClass.selectPreference();
        stepClass.selectPreferenceDependencies();
        stepClass.checkWifi();
        stepClass.selectWifiSettings();
    }

    @When("step should able to enter the name as {string}")
    public void stepShouldAbleToEnterTheNameAs(String name) {
        stepClass.enterWifiName(name);
        stepClass.clickOkButton();
    }

    @Then("step close the application")
    public void stepCloseTheApplication() {
        stepClass.closeApplication();
    }
}
