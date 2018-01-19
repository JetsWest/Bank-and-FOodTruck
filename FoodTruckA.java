package foodtrucka;

import java.util.ArrayList;
import java.util.List;

public class FoodTruckA {
    private final List<Food> inventory = new ArrayList<>();
    private double balance = 100.00;
    
    public void startingInv(){
        addFoods(10, Food.HAMBURGER);
        addFoods(10, Food.CHEESEBURGER);
        addFoods(10, Food.HOTDOG);
        addFoods(10, Food.SODA);
        addFoods(10, Food.CHEESIEBOY);
        addFoods(10, Food.WATER);
        addFoods(10, Food.YEET);
    }
    public void addFood(int type){
        this.inventory.add(new Food(type));
    }
    public void removeFood(int type){
        this.inventory.remove(new Food(type));
    }
    public int addFoods(int amount, int type){
        for (int i = 0; i < amount; i++){
            this.inventory.add(new Food(type));
        }
        return checkCertainFood(type);
    }
    public void removeFoods(int amount, int type){
        for (int i = 0; i < amount; i++){
            this.inventory.remove(new Food(type));
        }
    }
    public int checkCertainFood(int type){
        int count = 0;
        for (int i = 0; i < inventory.size(); i++){
            if (inventory.get(i).getType() == type){
                count++;
            }
        }
        return count;
    }
    public void removeAll(int type){
        inventory.clear();
    }
    public double checkBalance(){
        return this.balance;
    }
    public void takeMoney(int price){
        this.balance += price;
    }

}
