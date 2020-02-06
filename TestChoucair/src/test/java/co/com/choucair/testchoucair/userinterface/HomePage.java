package co.com.choucair.testchoucair.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.choucairtesting.com")
public class HomePage extends PageObject {
    @FindBy(xpath = "//li[@id='menu-item-6142']//a[contains(text(),'Servicios')]")
    private WebElementFacade servicesOption;

    public void selectOptions() {
        servicesOption.click ();
        JavascriptExecutor js = (JavascriptExecutor) getDriver ();
        js.executeScript ("window.scrollBy(0,350)", "");
        waitABit (1000);
    }
}
