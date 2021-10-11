package CoffeeMachine.ProcessesMakingCoffee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

/**
 * This class list the resources of the coffee machine and spends them (soon)
 */
public class CoffeeMachineResources { //Класс конструктор выводящий список ресурсов
    Properties prop = new Properties();
    HashMap<String, Integer> resources = new HashMap<>();
    FileInputStream in = new FileInputStream("C:\\Users\\71376160\\IdeaProjects\\EmulationCoffeeMachine\\src\\CoffeeMachine\\resources.properties");

    public void showsResources() throws IOException {
        prop.load(in);
        System.out.println("...Number of resources...");
        System.out.println("Milk:" + prop.getProperty("milk") + "L");
        System.out.println("Cream:" + prop.getProperty("cream") + "L");
        System.out.println("Compressed air:" + prop.getProperty("compressed_air") + "m³");
        System.out.println("Coffee:" + prop.getProperty("coffee") + "kg");
    }

    public CoffeeMachineResources() throws FileNotFoundException {
    }
    //  public HashMap getResources() throws IOException {
    //      prop.load(in);
    //      prop.put("Milk",prop.getProperty("milk"));
    //      prop.put("Cream",prop.getProperty("cream"));
    //      prop.put("Compressed air",prop.getProperty("compressed_air"));
    //      prop.put("Coffee",prop.getProperty("coffee"));
    //      return getResources();
    //  }
}

