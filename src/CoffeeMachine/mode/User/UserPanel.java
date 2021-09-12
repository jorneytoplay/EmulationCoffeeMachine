package CoffeeMachine.mode.User;

import CoffeeMachine.TechnicalPart.Shaper;
import CoffeeMachine.mode.MakeCoffee;
import CoffeeMachine.mode.ShowActionsList;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class UserPanel {
    ShowActionsList showActionsList = new ShowActionsList();
    Shaper shaper = new Shaper();
    Scanner in = new Scanner(System.in);
    public int numberVolume = 0;
    boolean exit = false;

    public UserPanel() throws FileNotFoundException {
    }

    public void startPanel() throws IOException {
        System.out.println("...Choose coffee...");
        do {
            showActionsList.list(false);
            System.out.println("Coffee:");
            int numberCoffee = in.nextInt();
            System.out.println("...Choose volume...\n1.0,3\n2.0,5\n3.1,0");
            System.out.println("Volume:");
            numberVolume = in.nextInt();
            shaper.shapeOfOrder(numberCoffee,numberVolume);
        } while (!exit);
    }
}
