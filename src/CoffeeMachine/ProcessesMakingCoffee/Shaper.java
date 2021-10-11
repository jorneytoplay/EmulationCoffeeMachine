package CoffeeMachine.ProcessesMakingCoffee;


import java.io.FileNotFoundException;
import java.io.IOException;

public class Shaper extends LoadingCoffeeList { //Класс-сборщик, достающий наименование кофе и ведёт подсчёт затрат денег и ресурсов
    MakeCoffee makeCoffee = new MakeCoffee();

    public Shaper() throws FileNotFoundException {
    }

    public void shapeOfOrder(int numberCoffee, int volume) throws IOException {
        loadCoffee();
        int price;
        String coffeeName = null;
        double milk = 0, cream = 0, compressedAir = 0, coffee = 0;

        switch (numberCoffee) {
            case 1 -> {
                coffeeName = "Латте";
                milk = 0.2;
                cream = 0;
                compressedAir = 0.01;
                coffee = 0.003;
            }
            case 2 -> {
                coffeeName = "Эспрессо";
                milk = 0.2;
                cream = 0;
                compressedAir = 0.01;
                coffee = 0.003;
            }
            case 3 -> {
                coffeeName = "Капучино";
                milk = 0.2;
                cream = 0;
                compressedAir = 0.01;
                coffee = 0.002;
            }
            case 4 -> {
                coffeeName = "Американо";
                milk = 0;
                cream = 0.003;
                compressedAir = 0.02;
                coffee = 0.004;
            }
            case 5 -> {
                coffeeName = "Фраппе";
                milk = 0;
                cream = 0.001;
                compressedAir = 0.02;
                coffee = 0.002;
            }
        }

        switch (volume) {
            case 1 -> { //объём 0,3Л
                makeCoffee.eatingUpResources(milk, cream, compressedAir, coffee);
                price = coffeeList.get(coffeeName);
                makeCoffee.make(coffeeName, price);
            }
            case 2 -> { //объём 0,5Л
                milk *= 1.8;
                cream *= 1.8;
                compressedAir *= 1.8;
                coffee *= 1.8;
                makeCoffee.eatingUpResources(milk, cream, compressedAir, coffee);
                price = coffeeList.get(coffeeName) * 2;
                makeCoffee.make(coffeeName, price);
            }
            case 3 -> { //объём 1Л
                milk *= 3.3;
                cream *= 3.3;
                compressedAir *= 3.3;
                coffee *= 3.3;
                makeCoffee.eatingUpResources(milk, cream, compressedAir, coffee);
                price = coffeeList.get(coffeeName) * 3;
                makeCoffee.make(coffeeName, price);
            }
        }
    }
}
