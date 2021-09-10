package CoffeeMachine.mode;

import CoffeeMachine.LoadingCoffeeList;
import CoffeeMachine.mode.Admin.AdminActions;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ShowActionsList {
    int cnt=1;
    FileInputStream fis;
    Properties property = new Properties();
    public void list(boolean admin, LoadingCoffeeList loadingCoffeeList){
        if(admin){
            Class<AdminActions> personClass = AdminActions.class;
            Method[] methods = personClass.getDeclaredMethods();
            for (Method method : methods)
            {
                System.out.println(cnt+"."+method.getName());
                cnt++;
            }
            cnt=1;
        }
        else {

        }
    }
}
