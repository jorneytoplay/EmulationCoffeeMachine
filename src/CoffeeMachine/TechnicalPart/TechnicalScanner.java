package CoffeeMachine.TechnicalPart;

import CoffeeMachine.TechnicalPart.Details.ControlPanel;
import CoffeeMachine.TechnicalPart.Details.Heater;
import CoffeeMachine.TechnicalPart.Details.Piston;

import java.util.concurrent.TimeUnit;

/**
 * This class was created to check the
 * readiness of the coffee machine components.
 */
public class TechnicalScanner {
    /**
     * the scan method is waiting for a response from
     * all the components of the coffee machine
     */
    public void scan() throws InterruptedException {
        System.out.println("...Technical analysis...");
        TimeUnit.SECONDS.sleep(2);
        Heater heater = new Heater();
        System.out.println(heater);
        TimeUnit.SECONDS.sleep(2);
        Piston piston = new Piston();
        System.out.println(piston);
        TimeUnit.SECONDS.sleep(2);
        ControlPanel controlPanel = new ControlPanel();
        System.out.println(controlPanel);
        System.out.println("...The coffee machine is working...");
        TimeUnit.SECONDS.sleep(2);

    }
}
