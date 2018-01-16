package foodtrucka;

import java.util.ArrayList;
import java.util.List;

public class FoodTruckA {
    private List<Food> inventory = new ArrayList<>();
    private List<Food> inventory2 = inventory;
    
    public void addFood(int type){
        this.inventory.add(new Food(type));
    }
    public void removeFood(int type){
        this.inventory.remove(new Food(type));
    }
    public void addFoods(int amount, int type){
        for (int i = 0; i < amount; i++){
            this.inventory.add(new Food(type));
        }
    }
    public void removeFoods(int amount, int type){
        for (int i = 0; i < amount; i++){
            this.inventory.remove(new Food(type));
        }
    }
    public List<Food> countFood(int type){
        return this.inventory2;
    }
    public static void removeAll(int type){}
}

