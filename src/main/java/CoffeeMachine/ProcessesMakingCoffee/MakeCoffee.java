package CoffeeMachine.ProcessesMakingCoffee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * This class creates coffee and spends the resources of the coffee machine
 */
public class MakeCoffee {
    Properties prop = new Properties();
    FileInputStream in = new FileInputStream("resources/resources.properties");

    public MakeCoffee() throws FileNotFoundException {
    }

    /**
     * This method emulates the creation of coffee and
     * all the processes that take place.
     */
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

    /**
     * Calculates the remaining resources of the espresso machine
     * after the coffee has been created
     *
     * @param coffee - type coffee
     */
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

    /**
     * This method changes the amount of resources of the coffee machine
     * after the coffee has been created.
     *
     * @param p - machine resource data
     */
    public void saveProperties(Properties p) throws IOException {
        FileOutputStream fr = new FileOutputStream("resources/resources.properties");
        p.store(fr, "Properties");
        fr.close();
    }
}
