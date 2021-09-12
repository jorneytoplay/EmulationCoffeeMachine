package CoffeeMachine.mode;

import CoffeeMachine.TechnicalPart.LoadingCoffeeList;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MakeCoffee {
    Properties prop = new Properties();
    FileInputStream in = new FileInputStream("C:\\Users\\71376160\\IdeaProjects\\EmulationCoffeeMachine\\src\\CoffeeMachine\\resources.properties");

    public MakeCoffee() throws FileNotFoundException {
    }

    public void make(String coffeeName,int volume) throws IOException {
        prop.load(in);
        String instruction="Coffee:"+coffeeName+" Volume:"+volume;
        if ("Латте".equals(coffeeName)) {
            System.out.println(instruction);
        }
    }
    public void eatingUpResources(double milk,double cream, double compressedAir,double coffee){
        try {
            prop.load(in);
            Double milk_after = Double.parseDouble(prop.getProperty("milk"))-milk;
            Double cream_after = Double.parseDouble(prop.getProperty("cream"))-milk;
            Double compressedAir_after = Double.parseDouble(prop.getProperty("compressed_air"))-milk;
            Double coffee_after = Double.parseDouble(prop.getProperty("coffee"))-milk;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
