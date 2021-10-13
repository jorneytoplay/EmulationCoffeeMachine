package CoffeeMachine;

import CoffeeMachine.ProcessesMakingCoffee.CoffeeMachineResources;
import CoffeeMachine.TechnicalPart.TechnicalScanner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author jorneytoplay [ Memedlyaev Ekrem ]
 */
public class Main {
    /**
     *This method simulates the start of the coffee machine and,
     * upon successful start, creates a link to
     * CoffeeMachine and goes to the coffeeMachine.start() method
     */
    public static void main(String[] args) throws IOException {
        CoffeeMachineResources specifications = new CoffeeMachineResources();
        TechnicalScanner techScan = new TechnicalScanner();
        try {
            System.out.println("...The coffee machine starts up...");
            //We connect and check for operability of all complementary coffee machines
            techScan.scan();
            //Displaying the available resources in the coffee machine
            specifications.showsResources();
            //Emulating a delay in validation
            TimeUnit.SECONDS.sleep(3);
            CoffeeMachine coffeeMachine = new CoffeeMachine();
            System.out.println("☑Welcome☑");
            coffeeMachine.start(); //Запускаем панель управления
        } catch (InterruptedException e) {
            System.out.println("Error starting the coffee machine");
        }
    }
}
