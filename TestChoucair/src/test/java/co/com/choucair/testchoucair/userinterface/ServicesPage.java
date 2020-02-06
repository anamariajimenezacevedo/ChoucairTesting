package co.com.choucair.testchoucair.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.awt.*;

public class ServicesPage extends PageObject {

    @FindBy(xpath = "//a[contains(text(),'Capacidades')]")
    private WebElementFacade capacitiesOption;

    @FindBy(xpath = "//a[contains(text(),'Cómo lo hacemos')]")
    private WebElementFacade howOption;

    @FindBy(xpath = "//a[contains(text(),'Portafolio de Soluciones')]")
    private WebElementFacade solutionsOption;

    @FindBy(xpath = "//h2[contains(text(),'Capacidades de Pruebas Centradas en el negocio')]")
    private WebElementFacade textCapacities;

    @FindBy(xpath = "//h2[contains(text(),'Cómo lo hacemos')]")
    private WebElementFacade textHow;

    @FindBy(xpath = "//h2[contains(text(),'Portafolio de soluciones de testing centradas en s')]")
    private WebElementFacade textSolutions;

    @FindBy(xpath = "//a[contains(text(),'Digital Performance Management')]")
    private WebElementFacade DPMoptions;

    @FindBy(xpath = "//strong[contains(text(),'Digital Performance Management')]")
    private WebElementFacade textDPM;

    @FindBy(xpath = "//a[contains(text(),'Pruebas Móviles')]")
    private WebElementFacade pruebasMovilesOptions;

    @FindBy(xpath = "//strong[contains(text(),'Pruebas para aplicativos móviles')]")
    private WebElementFacade textPruebasMoviles;

    @FindBy(xpath = "//a[contains(text(),'Business Intellingence')]")
    private WebElementFacade businessIntellingenceOptions;

    @FindBy(xpath = "//strong[contains(text(),'Pruebas para Business Intelligence')]")
    private WebElementFacade textBusinessIntellingence;


    public void selectCapacities() {
        capacitiesOption.click ();
        waitABit (1000);
        String text = textCapacities.getText ();
        if ("Capacidades de Pruebas Centradas en el negocio".equals (text)) {
            System.out.println ("The selected section is redirected correctly:" + " " + text);
        } else {
            String message = "The selected section is not redirected correctly:" + " " + text;
            JFrame v = new JFrame ("v");
            v.setLocation (100, 100);
            v.setSize (200, 200);
            v.setTitle (message);
            waitABit (1000);
            v.setVisible (true);
            v.add (new Panel ());
            v.setBounds (100, 100, 200, 200);
            v.setVisible (false);
        }
        waitABit (1000);


    }

    public void selectHow() {
        waitABit (1000);
        JavascriptExecutor js = (JavascriptExecutor) getDriver ();
        js.executeScript ("window.scrollBy(0,-350)", "");
        waitABit (1000);
        howOption.click ();
        waitABit (1000);
        String text = textHow.getText ();
        if ("Cómo lo hacemos".equals (text)) {
            System.out.println ("The selected section is redirected correctly:" + " " + text);
        } else {
            String message = "The selected section is not redirected correctly:" + " " + text;
            JFrame v = new JFrame ("v");
            v.setLocation (100, 100);
            v.setSize (200, 200);
            v.setTitle (message);
            waitABit (1000);
            v.setVisible (true);
            v.add (new Panel ());
            v.setBounds (100, 100, 200, 200);
            v.setVisible (false);
        }
        waitABit (1000);
    }

    public void selectSolutions() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver ();
        js.executeScript ("window.scrollBy(0,-1500)", "");
        waitABit (1000);
        solutionsOption.click ();
        String text = textSolutions.getText ();
        if ("Portafolio de soluciones de testing centradas en su negocio".equals (text)) {
            System.out.println ("The selected section is redirected correctly:" + " " + text);

            String message = "The test finished successfully";

            JFrame v = new JFrame ("v");
            v.setLocation (100, 100);
            v.setSize (200, 200);
            v.setTitle (message);
            waitABit (1000);
            v.setVisible (true);
            v.add (new Panel ());
            v.setBounds (100, 100, 200, 200);
            v.setVisible (false);

            if ("The test finished successfully" == message) {
                System.out.println (message);
            }
        } else {
            String message = "The selected section is not redirected correctly:" + " " + text + "the test did not finish correctly.";

            JFrame v = new JFrame ("v");
            v.setLocation (100, 100);
            v.setSize (200, 200);
            v.setTitle (message);
            waitABit (1000);
            v.setVisible (true);
            v.add (new Panel ());
            v.setBounds (100, 100, 200, 200);
            v.setVisible (false);
        }
        waitABit (1000);
    }

    public void selectDPM() {
        solutionsOption.click ();
        waitABit (1000);
        DPMoptions.click ();
        String text = textDPM.getText ();
        if ("Digital Performance Management".equals (text)) {
            System.out.println ("The selected section is redirected correctly:" + " " + text);
        } else {
            String message = "The selected section is not redirected correctly:" + " " + text;
            JFrame v = new JFrame ("v");
            v.setLocation (100, 100);
            v.setSize (200, 200);
            v.setTitle (message);
            waitABit (1000);
            v.setVisible (true);
            v.add (new Panel ());
            v.setBounds (100, 100, 200, 200);
            v.setVisible (false);
        }
        waitABit (1000);
    }

    public void selectPruebasMoviles() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver ();
        js.executeScript ("window.scrollBy(0,-3300)", "");
        pruebasMovilesOptions.click ();
        String text = textPruebasMoviles.getText ();
        if ("Pruebas para aplicativos móviles".equals (text)) {
            System.out.println ("The selected section is redirected correctly:" + " " + text);
        } else {
            String message = "The selected section is not redirected correctly:" + " " + text;
            JFrame v = new JFrame ("v");
            v.setLocation (100, 100);
            v.setSize (200, 200);
            v.setTitle (message);
            waitABit (1000);
            v.setVisible (true);
            v.add (new Panel ());
            v.setBounds (100, 100, 200, 200);
            v.setVisible (false);
        }
        waitABit (1000);
    }

    public void selectBusinessI() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver ();
        js.executeScript ("window.scrollBy(0,-2000)", "");
        businessIntellingenceOptions.click ();
        String text = textBusinessIntellingence.getText ();
        if ("Pruebas para Business Intelligence ".equals (text)) {
            System.out.println ("The selected section is redirected correctly:" + " " + text);

            String message = "The test finished successfully";

            JFrame v = new JFrame ("v");
            v.setLocation (100, 100);
            v.setSize (200, 200);
            v.setTitle (message);
            waitABit (1000);
            v.setVisible (true);
            v.add (new Panel ());
            v.setBounds (100, 100, 200, 200);
            v.setVisible (false);

            if ("The test finished successfully" == message) {
                System.out.println (message);
            }
        } else {

            String message = "The selected section is not redirected correctly:" + "" + text + "" + " and the test could not finish correctly";

            JFrame v = new JFrame ("v");
            v.setLocation (100, 100);
            v.setSize (200, 200);
            v.setTitle (message);
            waitABit (1000);
            v.setVisible (true);
            v.add (new Panel ());
            v.setBounds (100, 100, 200, 200);
            v.setVisible (false);
        }
    }
}