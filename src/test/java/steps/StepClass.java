package steps;

import locators.Locators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class StepClass extends PageObject {

    @Step
    public void selectPreference() {
        clickOn(element(Locators.option_preference));

    }

    @Step
    public void selectPreferenceDependencies() {
        clickOn(element(Locators.option_prefDependencies));

    }

    @Step
    public void checkWifi() {
        clickOn(element(Locators.checkBox_Wifi));
    }

    @Step
    public void selectWifiSettings() {
        clickOn(element(Locators.option_wifiSettings));

    }

    @Step
    public void enterWifiName(String name) {
        typeInto(element(Locators.input_wifiName), name);
    }

    @Step
    public void clickOkButton() {
        clickOn(findAll(Locators.alert_buttons).get(1));
    }

    @Step
    public void closeApplication() {
        try {
            Thread.sleep(2000);
            System.out.println("app closed!");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
