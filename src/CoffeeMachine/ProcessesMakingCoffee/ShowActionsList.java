package CoffeeMachine.ProcessesMakingCoffee;

import CoffeeMachine.mode.Admin.AdminActions;

import java.lang.reflect.Method;
import java.util.Set;

/**
 * This class loads the list of coffees into the system
 * and displays them on the panel to the user
 */
public class ShowActionsList extends LoadingCoffeeList {
    int cnt = 1;

    /**
     * @param admin - if the user is an admin then
     *              he can change the list of coffee and prices (SOON)
     */
    public void list(boolean admin) {
        loadCoffee();
        if (admin) {
            Class<AdminActions> personClass = AdminActions.class;
            Method[] methods = personClass.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println(cnt + "." + method.getName());
                cnt++;
            }
            cnt = 1;
        } else {
            Set<String> keys = coffeeList.keySet();
            for (Object key : keys) {
                System.out.println(cnt + "." + key + ": " + coffeeList.get(key));
                cnt++;
            }
            cnt = 1;
        }
    }

    public void getRes() {
        loadCoffee();

    }
}
