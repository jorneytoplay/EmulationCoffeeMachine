package CoffeeMachine.mode.Admin;

import CoffeeMachine.LoadingCoffeeList;
import CoffeeMachine.mode.ShowActionsList;

import java.util.Scanner;

public class AdminPanel {
    AdministratorMode administratorMode = new AdministratorMode();
    ShowActionsList showActionsList = new ShowActionsList();
    Scanner in = new Scanner(System.in);
    private int chooseAdmin = 0;
    boolean exit = false;
    public void startPanel(){
        System.out.println("...Take action...");
        for(;;) {
            showActionsList.list(true, loadingCoffeeList);
            System.out.println("0.Exit");
            chooseAdmin = in.nextInt();
            switch (chooseAdmin){
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
            if(exit)break;
        }
    }
}
