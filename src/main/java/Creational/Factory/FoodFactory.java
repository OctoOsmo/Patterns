package Creational.Factory;

/**
 * Created by al on 07.01.2016.
 */
public class FoodFactory {

    public Food getFood(FoodType foodType){
        if(foodType == null){
            return null;
        }
        if (foodType == FoodType.Apple){
            return new Apple();
        }else if (foodType == FoodType.Bread){
            return new Bread();
        }else if (foodType == FoodType.Orange){
            return new Orange();
        }else if (foodType == FoodType.Milk){
            return new Milk();
        }
        return null;
    }
}
