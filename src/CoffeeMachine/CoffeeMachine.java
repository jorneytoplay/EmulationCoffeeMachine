package CoffeeMachine;

import CoffeeMachine.mode.Admin.AdminPanel;
import CoffeeMachine.mode.Admin.AdministratorMode;
import CoffeeMachine.mode.MakeCoffee;
import CoffeeMachine.mode.User.UserPanel;

import java.util.Scanner;

public class CoffeeMachine {
    Scanner in = new Scanner(System.in);
    AdministratorMode admin = new AdministratorMode();
    LoadingCoffeeList loadingCoffeeList = new LoadingCoffeeList();
    MakeCoffee makeCoffee = new MakeCoffee();
    AdminPanel adminPanel = new AdminPanel();
    UserPanel userPanel = new UserPanel();
    String choose=null;
    private Integer bank= 0;
    private boolean adminMode = false;
    public void start() {
        for(;;){
            System.out.println("What do you want? (Select number)\n" +
                    "1.Make coffee\n" +
                    "2.Administrator Mode");
            choose = in.nextLine();
            if (choose.equals("1")) {
                System.out.println("What kind of coffee do you want");
            } else if (choose.equals("2")) {
                adminMode = admin.passwordCheck();
            } else {
                System.out.println("Try again");
            }
            if(adminMode){
                adminPanel.startPanel();
            }
            else { //ПОПРАВИТЬ ЦИКЛ БЕСОНЕЧЕН
                userPanel.startPanel();
            }
        }
    }

}
