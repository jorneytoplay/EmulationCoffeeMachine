package CoffeeMachine.mode.User;

import CoffeeMachine.LoadingCoffeeList;
import CoffeeMachine.mode.ShowActionsList;

import java.util.Scanner;

public class UserPanel {
    ShowActionsList showActionsList = new ShowActionsList();
    Scanner in = new Scanner(System.in);
    private int chooseUser = 0;
    boolean exit = false;
    public void startPanel(){
        System.out.println("...Choose coffee...");
        for(;;){
            showActionsList.list(false,loadingCoffeeList);
            System.out.println("0.Exit");
            chooseUser = in.nextInt();
            if(exit) break;
        }
    }
}
