package foodtrucka;
import java.util.Scanner;
import java.util.ArrayList;
public class Cashier {
    private static Scanner input = new Scanner(System.in);
    public static FoodTruckA foodtruck = new FoodTruckA();
    public static int typer;
    public static Food food = new Food(typer);
    
    public static void initialize(){
        ArrayList<Food> order = new ArrayList<>();
        for (int type = 1; type < 7;type++){
            for (int count = 1; count <= 10; count++){
                order.add(new Food(type));
            }
        }
        double cost = 0.0;
        for(Food food:order){
            cost += food.getPrice();
        }
        foodtruck.takeMoney(cost);
        foodtruck.restock(order);
    }
    public static void orderMenu(){
        System.out.println("1)Hamburger - $" + foodtruck.getMarkup() * food.prices[0]);
        System.out.println("2)Cheesburger - $" + foodtruck.getMarkup() * food.prices[1]);
        System.out.println("3)Hotdog - $" + foodtruck.getMarkup() * food.prices[2]);
        System.out.println("4)Soda - $" + foodtruck.getMarkup() * food.prices[3]);
        System.out.println("5)Cheesieboy - $" + foodtruck.getMarkup() * food.prices[4]);
        System.out.println("6) Water - $" + foodtruck.getMarkup() * food.prices[5]);
        System.out.println("7)Yeet - $" + foodtruck.getMarkup() * food.prices[6]);
        System.out.println("8)Done");
    }
    //not finished yetttttttt
    public static void testOrder(){
        orderMenu();
        int subtotal = 0;
        ArrayList<Food> order = new ArrayList<>();
        boolean chooser = true;
        System.out.println("Please make a choice of order:");
        int customer = input.nextInt();
        while(chooser){
        if (customer != 8){
            order.add(new Food(customer));
            subtotal += (foodtruck.getMarkup()*food.prices[customer-1]);

            break;
        }
        if (customer == 8){
            System.out.println("This will cost $" + subtotal);
            foodtruck.fulfillOrder(order);
            foodtruck.takeMoney(subtotal);
            general();
            }
        }
        
    }
    public static void placeOrder(){
        System.out.println("What food would you like to order?");
        System.out.println("1) Hamburger");
        System.out.println("2) Cheeseburger");
        System.out.println("3) Hotdog");
        System.out.println("4) Soda");
        System.out.println("5) Cheesieboy");
        System.out.println("6) Water");
        System.out.println("7) Yeet");
        String foodChoice = input.next();
        boolean ordering = true;
        while (ordering){
        switch (foodChoice){
            case "1":
                System.out.println("How many hamburgers would you like to order?");
                int hamburger = input.nextInt();
                if (hamburger <= foodtruck.checkCertainFood(Food.HAMBURGER)){
                    System.out.println("Your hamburgers will cost $" + (hamburger*(foodtruck.getMarkup()*Food.HAMBURGER)));
                    foodtruck.removeFoods(1, hamburger);
                    foodtruck.takeMoney(Food.HAMBURGER*hamburger);
                }
                
                else if (hamburger > foodtruck.checkCertainFood(Food.HAMBURGER)){
                    System.out.println("Sorry, we do not have enough of that food. Here is your $" + Food.HAMBURGER*hamburger + " back.");
                }
            break;    
            case "2":
                System.out.println("How many cheeseburgers would you like to order?");
                int cheeseburger = input.nextInt();
                if (cheeseburger <= foodtruck.checkCertainFood(Food.CHEESEBURGER)){
                    System.out.println("Your cheeseburgers will cost $" + (cheeseburger*Food.CHEESEBURGER));
                    foodtruck.removeFoods(2, cheeseburger);
                    foodtruck.takeMoney(Food.CHEESEBURGER*cheeseburger);
                }else if (cheeseburger >= foodtruck.checkCertainFood(Food.CHEESEBURGER)){
                    System.out.println("Sorry, we do not have enough of that food. Here is your $" + Food.CHEESEBURGER*cheeseburger + " back.");
                }
            break;
            case "3":
                System.out.println("How many hotdogs would you like to order?");
                int hotdog = input.nextInt();
                if (hotdog <= foodtruck.checkCertainFood(Food.HOTDOG)){
                    System.out.println("Your hotdogs will cost $" + (hotdog*Food.HOTDOG));
                    foodtruck.removeFoods(3, hotdog);
                    foodtruck.takeMoney(Food.HOTDOG*hotdog);
                }else if (hotdog >= foodtruck.checkCertainFood(Food.HOTDOG)){
                    System.out.println("Sorry, we do not have enough of that food. Here is your $" + Food.HOTDOG*hotdog + " back.");
                }
            break;
            case "4":
                System.out.println("How many sodas would you like to order?");
                int soda = input.nextInt();
                if (soda <= foodtruck.checkCertainFood(Food.SODA)){
                    System.out.println("Your sodas will cost $" + (soda*Food.SODA));
                    foodtruck.removeFoods(4, soda);
                    foodtruck.takeMoney(Food.SODA*soda);
                }else if (soda >= foodtruck.checkCertainFood(Food.SODA)){
                    System.out.println("Sorry, we do not have enough of that food. Here is your $" + Food.SODA*soda + " back.");
                }
            break;
            case "5":
                System.out.println("How many cheesieboys would you like to order?");
                int cheesieboy = input.nextInt();
                if (cheesieboy <= foodtruck.checkCertainFood(Food.CHEESIEBOY)){
                    System.out.println("Your cheesieboys will cost $" + (cheesieboy*Food.CHEESIEBOY));
                    foodtruck.removeFoods(5, cheesieboy);
                    foodtruck.takeMoney(Food.CHEESIEBOY*cheesieboy);
                }else if (cheesieboy >= foodtruck.checkCertainFood(Food.CHEESIEBOY)){
                    System.out.println("Sorry, we do not have enough of that food. Here is your $" + Food.CHEESIEBOY*cheesieboy + " back.");
                }
            break;
            case "6":
                System.out.println("How many waters would you like to order?");
                int water = input.nextInt();
                if (water <= foodtruck.checkCertainFood(Food.WATER)) {
                    System.out.println("Your waters will cost $" + (water * Food.WATER));
                    foodtruck.removeFoods(6, water);
                    foodtruck.takeMoney(Food.WATER * water);
                } else if (water >= foodtruck.checkCertainFood(Food.WATER)) {
                    System.out.println("Sorry, we do not have enough of that food. Here is your $" + Food.WATER*water + " back.");
                }
            break;
            case "7":
                System.out.println("How many yeets would you like to order?");
                int yeet = input.nextInt();
                if (yeet <= foodtruck.checkCertainFood(Food.YEET)) {
                    System.out.println("Your yeets will cost $" + (yeet*Food.YEET));
                    foodtruck.removeFoods(7, yeet);
                    foodtruck.takeMoney(Food.YEET * yeet);
                } else if (yeet >= foodtruck.checkCertainFood(Food.YEET)) {
                    System.out.println("Sorry, we do not have enough of that food. Here is your $" + Food.YEET*yeet + " back.");
                }
            break;
                
            default:
                System.out.println("We do not have that menu item!");
                general();
            break;
        }
            System.out.println("Would you like to order anything else? 1) Yes 2) No");
            int finalboy = input.nextInt();
            if (finalboy == 1){
                placeOrder();
            }
            if (finalboy == 2){
                System.out.println("Thank you, please come again!");
                general();
            }
            if (finalboy > 2 || finalboy < 1){
                System.out.println("That is not an available option.");
            }
        }
    }

    public static void checkInv(){
        System.out.println("What food would you like to check?");
        System.out.println("1) Hamburgers");
        System.out.println("2) Cheeseburgers");
        System.out.println("3) Hot dogs");
        System.out.println("4) Sodas");
        System.out.println("5) Cheesieboys");
        System.out.println("6) Water");
        System.out.println("7) Yeets");
        int cool = input.nextInt();
        System.out.println("We currently have " + foodtruck.checkCertainFood(cool) + " of that item.");
        general();
        if (cool > 7 || cool < 1){
            System.out.println("That choice does not exist sorry!");
            general();
        }
    }
    public static void menu(){
        System.out.println("------THE MENU OF DESTINY------");
        System.out.println("Hamburger is $" + foodtruck.getMarkup()*Food.HAMBURGER);
        System.out.println("Cheesburger is $" + foodtruck.getMarkup()*Food.CHEESEBURGER);
        System.out.println("Hotdog is $" + foodtruck.getMarkup()*Food.HOTDOG);
        System.out.println("Soda is $" + foodtruck.getMarkup()*Food.HOTDOG);
        System.out.println("Our house special, Cheesieboy is $" + foodtruck.getMarkup()*Food.CHEESIEBOY);
        System.out.println("Water costs $" + foodtruck.getMarkup()*Food.WATER + " (Very special)");
        System.out.println("One yeet is $" + foodtruck.getMarkup()*Food.YEET);
        System.out.println("-------------------------------");
        general();
    }
    public static void checkMoney(){
        System.out.println("The food truck currently has $" + foodtruck.checkBalance());
    }
    
    public static void owner(){
        System.out.println("Hey there biggity boss! What would ya like to do?");
        System.out.println("1) Restock the inventory");
        System.out.println("2) Check the food truck balance");
        System.out.println("3) Set the markup");
        System.out.println("4) Check the inventory of an item");
        System.out.println("5) Go back to the customer menu");
        String choice = input.next();
        boolean choosing = true;
        while(choosing){
            switch(choice){
                case "1":
                    System.out.println("What food would you like to add? ");
                    System.out.println("1) Hamburger; 2) Cheeseburger; 3) Hotdog; 4) Soda; 5) Cheesieboy; 6) Water; 7) Yeet");
                    int cool = input.nextInt();
                    System.out.println("What quantity?");
                    int quant = input.nextInt();
                    foodtruck.addFoods(quant, cool);
                    System.out.println("Added " + quant + " food to the inventory.");
                    general();
                break;
                case "2":
                    checkMoney();
                    owner();
                break;
                case "3":
                    System.out.println("What would you like the markup to be?");
                    double markup = input.nextDouble();
                    foodtruck.setMarkup(markup);
                    System.out.println("The markup is now " + foodtruck.setMarkup(markup));
                    general();
                break;
                case "4":
                    checkInv();
                break;
                case "5":
                    general();
                break;
                default:
                    System.out.println("Boy you own the truck cant you see thats not a choice??");
                break;
            }
        }
    }
    public static void general(){
        System.out.println("Hello customer! Welcome to Jackson's Food Truck."
                + "What would you like to do?");
        System.out.println("1) Place an Order");
        System.out.println("2) Look at the Menu and the Prices");
        System.out.println("3) Owner menu");
        String choice = input.next();
        boolean choosing = true;
        while(choosing){
            switch(choice){
                case "1":
                    testOrder();
                break;
                
                case "2":
                    menu();
                break;

                case "3":
                    owner();
                break;
                
                default:
                    System.out.println("Sorry, that is not an option.");
                break;
            }
        }
    }

    public static void main(String[] args){
        initialize();
        general();
    }
} 
