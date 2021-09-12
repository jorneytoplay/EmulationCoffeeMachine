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
    FileInputStream in = new FileInputStream("C:\\Users\\71376160\\IdeaProjects\\EmulationCoffeeMachine\\src\\CoffeeMachine\\resources.properties");
    Properties prop = new Properties();
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
            choose = scanner.nextLine();
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
