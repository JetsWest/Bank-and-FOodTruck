package foodtrucka;

import java.util.ArrayList;
import java.util.List;

public class FoodTruckA {
    private List<Food> inventory = new ArrayList<>();
    private double balance = 100000.00;
    private double markup;
    public static int typer;
    public static Food food = new Food(typer);
    
    public FoodTruckA(){
    this.inventory = new ArrayList<>();
    this.balance = 10000000.00;
    this.markup = 1;
    }
    public ArrayList<Food> restock(ArrayList<Food> order){
        ArrayList<Food> result = new ArrayList<>();
        while(this.balance >0 && order.size() >0){
            this.balance -= order.get(0).getPrice();
            result.add(order.get(0));
            this.inventory.add(order.remove(0));
        }
        return result;
    }
    public int addFoods(int amount, int type){
        for (int i = 0; i < amount; i++){
            this.inventory.add(new Food(type));
        }
        return checkCertainFood(type);
    }
    public ArrayList<Food> fulfillOrder(ArrayList<Food> order){
        ArrayList<Food> result = new ArrayList<>();
        int current = 0;
        while(current < order.size() && this.inventory.size()>0){
            if (this.inventory.contains(order.get(current))){
            result.add(order.get(current));
            this.balance += order.get(current).getPrice()*this.markup;
            inventory.remove(order.remove(current));
        }else{
            current++;
            }
       }
        return result;
    }
    public void removeFoods(int amount, int type){
        for (int i = 0; i < amount; i++){
            if (inventory.get(i).getType() == type){
                this.inventory.remove(type);
            }
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
    
    public double checkBalance(){
        return this.balance;
    }
    public void takeMoney(double price){
        this.balance += price;
    }
    public double setMarkup(double fraction){
        this.markup = fraction; 
        return markup;
    }
    

}
