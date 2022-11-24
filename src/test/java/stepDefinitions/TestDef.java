package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.Locators;
import net.serenitybdd.core.pages.PageObject;

public class TestDef extends PageObject {

    @Given("open the wifi settings page")
    public void openTheWifiSettingsPage() {
        clickOn(element(Locators.option_preference));
        clickOn(element(Locators.option_prefDependencies));
        clickOn(element(Locators.checkBox_Wifi));
        clickOn(element(Locators.option_wifiSettings));
    }

    @When("should able to enter the name as {string}")
    public void shouldAbleToEnterTheNameAs(String name) {
        typeInto(element(Locators.input_wifiName), name);
        clickOn(findAll(Locators.alert_buttons).get(1));
    }

    @Then("close the application")
    public void closeTheApplication() {
        try {
            Thread.sleep(2000);
            System.out.println("app closed!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
