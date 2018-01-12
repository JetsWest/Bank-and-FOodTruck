package foodtrucka;
import java.util.Scanner;
public class Cashier {
    private static Scanner input = new Scanner(System.in);
    private static FoodTruckA foodtruck = new FoodTruckA();
    
    public static void placeOrder() {
        boolean ordering = true;

            while (ordering){
                System.out.println("What would you like to order?");
                System.out.println("1) Hamburger");
                System.out.println("2) Pizza");
                System.out.println("3) Cheeseburger");
                System.out.println("4) Wings");
                System.out.println("5) Cheesie Boy");
                System.out.println("6) Water");
                System.out.println("7) Soda");
                String choice = input.next();
                switch(choice){
                case "1":
                    System.out.println("Your food will cost $" + Food.hamburger);
                    System.out.println();
                break;
                
                case "2":
                    System.out.println("Your food will cost $" + Food.pizza);
                    System.out.println();
                break;
                
                case "3":
                    System.out.println("Your food will cost $" + Food.cheeseburger);
                    System.out.println();
                break;
                
                case "4":
                    System.out.println("Your food will cost $" + Food.wings);
                    System.out.println();
                break;
                
                case "5":
                    System.out.println("Your food will cost $" + Food.cheesieboy);
                break;
                
                case "6":
                    System.out.println("Your drink will cost $" + Food.water);
                    System.out.println();
                break;
                 
                case "7" :
                    System.out.println("Your drink will cost $" + Food.soda);
                    System.out.println();
                break;
                 }
            System.out.println("Would you like to order anything else? 1) Yes 2) No");
            int newChoice = input.nextInt();
            if (newChoice == 1){
                ordering = true;
            }
            if (newChoice == 2){
                ordering = false;
            }else if (newChoice >= 3 || newChoice <1){
                System.out.println("That choice does not exist!");
            }
        }
            
    }
    public static void takeMoney(int type){}
    public static void checkMoney(){}
    public static void giveFood(){}
    public static void main(String[] args){
        placeOrder();
    }
}
