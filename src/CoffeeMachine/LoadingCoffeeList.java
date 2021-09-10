package CoffeeMachine;

import java.util.HashMap;
import java.util.Set;

public class LoadingCoffeeList {
    HashMap<String,Integer> coffeeList = new HashMap<String,Integer>();
    public void loadCoffee(){
        coffeeList.put("Латте",120);
        coffeeList.put("Эспрессо",100);
        coffeeList.put("Американо",80);
        coffeeList.put("Фраппе",110);
        coffeeList.put("Капучино",90);
    }
}
