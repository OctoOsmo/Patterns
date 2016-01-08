package Creational.Factory;

/**
 * Created by al on 07.01.2016.
 */
public class FactoryMain {
    public static void main(String[] args) {
        FoodFactory foodFactory = new FoodFactory();

        Food f1 = foodFactory.getFood(FoodType.Apple);
        f1.printClassName();
        Food f2 = foodFactory.getFood(FoodType.Bread);
        f2.printClassName();
        Food f3 = foodFactory.getFood(FoodType.Orange);
        f3.printClassName();
        Food f4 = foodFactory.getFood(FoodType.Milk);
        f4.printClassName();
    }
}
