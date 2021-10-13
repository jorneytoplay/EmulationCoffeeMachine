package CoffeeMachine.ProcessesMakingCoffee;

import java.util.HashMap;

public class LoadingCoffeeList {
    public HashMap<String, Integer> coffeeList = new HashMap<>(); //Класс подгрузчик списка кофе

    /**
     * Adds coffee to the list to coffemachine
     */
    public void loadCoffee() {
        coffeeList.put("Латте", 60);
        coffeeList.put("Эспрессо", 70);
        coffeeList.put("Американо", 80);
        coffeeList.put("Фраппе", 100);
        coffeeList.put("Капучино", 90);
    }
}
