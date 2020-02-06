package co.com.choucair.testchoucair.steps;

import net.thucydides.core.annotations.Step;
import co.com.choucair.testchoucair.userinterface.*;

public class TestServices {

    HomePage homePage;
    ServicesPage servicesPage;

    @Step
    public void isTheHomePage() {
        homePage.open ();
        homePage.selectOptions ();
    }

    @Step
    public void isTheServicesPage() {
        servicesPage.selectCapacities ();
        servicesPage.selectHow ();
    }

    @Step
    public void finalValidation() {
        servicesPage.selectSolutions ();
    }

    @Step
    public void isTheOptionsBriefcase() {
        servicesPage.selectDPM ();
        servicesPage.selectPruebasMoviles ();

    }

    @Step
    public void finalValidationBriefcase() {
        servicesPage.selectBusinessI ();

    }
}
