package CoffeeMachine.mode.Admin;

import java.lang.reflect.Method;
import java.util.Scanner;

public class AdministratorMode implements AdminActions {
    Scanner in = new Scanner(System.in);
    private Integer pin=3352, pinIn= null;

    public boolean passwordCheck(){
        System.out.println("Please enter PIN");
        for (int i = 1; i <= 3; i++) {
            pinIn= in.nextInt();
            if(pinIn.equals(pin)){
                System.out.println("Welcome to admin mode");
                return true;
            }
            else {
                System.out.println("Wrong "+ (3-i) +" attempts left");
            }
        }
        return false;

    }


    @Override
    public void changeCoffeeList() {

    }

    @Override
    public void changePassword() {
        try {
            System.out.println("New PIN:");
            pin = in.nextInt();
            System.out.println("Password changed successfully");
        }catch (Exception e){
            System.out.println("An unknown error has occurred");
        }
    }

    @Override
    public void showPassword() {
        System.out.println("Admin PIN: "+pin);
    }

}
