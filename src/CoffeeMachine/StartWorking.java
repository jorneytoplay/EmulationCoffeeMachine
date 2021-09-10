package CoffeeMachine;

import java.util.concurrent.TimeUnit;

public class StartWorking {
    public static void main(String[] args) {
        System.out.println("...The coffee machine starts up...");
        try {
            TimeUnit.SECONDS.sleep(3);
            CoffeeMachine coffeeMachine = new CoffeeMachine();
            System.out.println("Welcome");
            coffeeMachine.start();
        } catch (InterruptedException e) {
            System.out.println("");
        }
    }
}
