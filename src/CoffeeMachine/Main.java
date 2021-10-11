package CoffeeMachine;

import CoffeeMachine.ProcessesMakingCoffee.CoffeeMachineResources;
import CoffeeMachine.TechnicalPart.TechnicalScanner;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws IOException {
        CoffeeMachineResources specifications = new CoffeeMachineResources();
        TechnicalScanner techScan = new TechnicalScanner();
        try {
            System.out.println("...The coffee machine starts up...");
            techScan.scan(); //Подключаем и проверяет на работоспособность все комплектубщие кофемашины
            specifications.showsResources(); //Выводим доступные ресурсы в кофемашине
            TimeUnit.SECONDS.sleep(3); //Эмулируем задержку в проверке
            CoffeeMachine coffeeMachine = new CoffeeMachine();
            System.out.println("☑Welcome☑");
            coffeeMachine.start(); //Запускаем панель управления
        } catch (InterruptedException e) {
            System.out.println("Error starting the coffee machine");
        }
    }
}
