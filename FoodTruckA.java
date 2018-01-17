package foodtrucka;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class FoodTruckA {
    private List<Food> inventory = new ArrayList<>();
    private double balance = 0;
    
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
        return Collections.frequency(inventory, type);
    }
    public void removeFoods(int amount, int type){
        for (int i = 0; i < amount; i++){
            this.inventory.remove(new Food(type));
        }
    }

    public int checkCertainFood(int type){
        return Collections.frequency(inventory, type);
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
