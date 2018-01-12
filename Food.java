package foodtrucka;

import java.util.ArrayList;

public class Food {
    private ArrayList<Food> foods;
    
    public static final int unknown = 0;
    public static final int hamburger = 10;
    public static final int wings = 5;
    public static final int cheeseburger = 12;
    public static final int pizza = 15;
    public static final int cheesieboy = 25;
    public static final int water = 1;
    public static final int soda = 2;
    
    private double price;
    private int type;
    
    
    public Food(int type){
        if(type == pizza){
            this.price = 15.00;
        }else if(type == wings){
            this.price = 5.00;
        }else if(type == cheesieboy){
            this.price = 25.00;
        }else if(type == hamburger){
            this.price = 10.00;
        }else if(type == cheeseburger){
            this.price = 12.00;
        }else if(type == water){
            this.price = 1.00;
        }else if(type == soda){
            this.price = 2.00;
        }else{
            this.price = 0.00;
            this.type = unknown;
        }
        this.type = type;
    }
}
