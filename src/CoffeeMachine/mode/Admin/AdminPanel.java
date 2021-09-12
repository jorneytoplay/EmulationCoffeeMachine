package CoffeeMachine.mode.Admin;

import CoffeeMachine.mode.ShowActionsList;

import java.util.Scanner;

public class AdminPanel {
    AdministratorMode administratorMode = new AdministratorMode();
    ShowActionsList showActionsList = new ShowActionsList();
    Scanner in = new Scanner(System.in);
    boolean exit = false;
    public void startPanel(){
        System.out.println("...Take action...");
        do {
            showActionsList.list(true);
            System.out.println("0.Exit");
            int chooseAdmin = in.nextInt();
            switch (chooseAdmin) {
                case 1:

                    break;
                case 2:
                    administratorMode.changePassword();
                    break;
                case 3:
                    administratorMode.showPassword();
                    break;
                case 0:
                    exit = true;
                    break;
            }
        } while (!exit);
    }
}
