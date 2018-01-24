package foodtrucka;

import java.util.ArrayList;
import java.util.List;

public class Food {
    public static final int UNKNOWN = -1;
    public static final int HAMBURGER = 1;
    public static final int CHEESEBURGER = 2;
    public static final int HOTDOG = 3;
    public static final int SODA = 4;
    public static final int CHEESIEBOY = 5;
    public static final int WATER = 6;
    public static final int YEET = 7;
    public static final double[] prices = new double[]{3.0,5.0,4.0,7.0,200.0,10.0,2.0};
    private double price;
    private int type;
    public int balance;
    
    public Food(int type){
        if(type==HAMBURGER){
            this.price = 3.00;
            this.type = 1;
        }else if(type==CHEESEBURGER){
            this.price = 5.00;
            this.type = 2;
        }else if(type==HOTDOG){
            this.price = 4.00;
            this.type = 3;
        }else if(type==SODA){
            this.price = 7.00;
            this.type = 4;
        }else if(type==CHEESIEBOY){
            this.price = 200.00;
            this.type = 5;
        }else if(type==WATER){
            this.price=10.00;
            this.type = 6;
        }else if(type==YEET){
            this.price = 2.00;
            this.type = 7;
        }else{
            this.price = 0.00;
            this.type = UNKNOWN;
        }
    }
    public double getPrice(){
        return this.price;
    }
    public int getType(){
        return this.type;
    }

}
