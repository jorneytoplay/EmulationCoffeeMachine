package CoffeeMachine;

import CoffeeMachine.TechnicalPart.CoffeeMachineResources;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class StartWorking {

    public static void main(String[] args) throws IOException {
        System.out.println("...The coffee machine starts up...");
        try {
            System.out.println("...Number of resources...");
            CoffeeMachineResources specifications = new CoffeeMachineResources();
            specifications.showsResources();
            TimeUnit.SECONDS.sleep(3);
            CoffeeMachine coffeeMachine = new CoffeeMachine();
            System.out.println("Welcome");
            coffeeMachine.start();
        } catch (InterruptedException e) {
            System.out.println("Error starting the coffee machine");
        }
    }
}
