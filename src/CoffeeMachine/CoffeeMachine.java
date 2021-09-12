package CoffeeMachine;

import CoffeeMachine.mode.Admin.AdminPanel;
import CoffeeMachine.mode.Admin.AdministratorMode;
import CoffeeMachine.mode.User.UserPanel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class CoffeeMachine {
    Scanner scanner = new Scanner(System.in);
    AdministratorMode admin = new AdministratorMode();
    AdminPanel adminPanel = new AdminPanel();
    UserPanel userPanel = new UserPanel();
    String choose=null;
    private boolean adminMode = false;

    public CoffeeMachine() throws FileNotFoundException {
    }

    public void start() throws IOException {
        for(;;){
            System.out.println("What do you want? (Select number)\n" +
                    "1.Make coffee\n" +
                    "2.Administrator Mode");
            System.out.print("Your choice:");
            choose = scanner.nextLine();

            if (choose.equals("1")) {
                System.out.println("What kind of coffee do you want");
                userPanel.startPanel();
            } else if (choose.equals("2")) {
                adminMode = admin.passwordCheck();
            } else {
                System.out.println("Try again");
            }

            if(adminMode){
                adminPanel.startPanel();//Если пользватель ввёл верный пароль то впустить в режим администратора ( ДОРАБОТАТЬ )
            }

        }
    }


}
