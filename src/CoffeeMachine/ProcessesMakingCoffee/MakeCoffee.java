package CoffeeMachine.ProcessesMakingCoffee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class MakeCoffee {
    Properties prop = new Properties();
    FileInputStream in = new FileInputStream("C:\\Users\\71376160\\IdeaProjects\\EmulationCoffeeMachine\\src\\CoffeeMachine\\resources.properties");

    public MakeCoffee() throws FileNotFoundException {
    }

    public void make(String coffeeName, int price) throws IOException {
        prop.load(in);
        System.out.println("Coffee:" + coffeeName + " Price:" + price + "₽");
        System.out.println("...Please wait, the coffee is done ...");
        try {
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Profit!");
        } catch (InterruptedException e) {
            System.out.println("Something went wrong while making coffee");
        }
    }

    public void eatingUpResources(double milk, double cream, double compressedAir, double coffee) throws FileNotFoundException {
        CoffeeMachineResources coffeeMachineResources = new CoffeeMachineResources();
        try {
            prop.load(in);
            Double milk_after = Double.parseDouble(prop.getProperty("milk")) - milk;
            Double cream_after = Double.parseDouble(prop.getProperty("cream")) - cream;
            Double compressedAir_after = Double.parseDouble(prop.getProperty("compressed_air")) - compressedAir;
            Double coffee_after = Double.parseDouble(prop.getProperty("coffee")) - coffee;
            prop.setProperty("milk", String.valueOf(milk_after));
            prop.setProperty("cream", String.valueOf(cream_after));
            prop.setProperty("compressed_air", String.valueOf(compressedAir_after));
            prop.setProperty("coffee", String.valueOf(coffee_after));
            saveProperties(prop);

            coffeeMachineResources.showsResources();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveProperties(Properties p) throws IOException {
        FileOutputStream fr = new FileOutputStream("C:\\Users\\71376160\\IdeaProjects\\EmulationCoffeeMachine\\src\\CoffeeMachine\\resources.properties");
        p.store(fr, "Properties");
        fr.close();
    }
}
