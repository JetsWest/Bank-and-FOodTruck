package foodtrucka;
import java.util.Scanner;
public class Cashier {
    private static Scanner input = new Scanner(System.in);
    private static FoodTruckA foodtruck = new FoodTruckA();
    private static double balance = 100.00;

   
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
                    System.out.println("Your hamburgers will cost $" + (hamburger*Food.HAMBURGER));
                    foodtruck.removeFoods(1, hamburger);
                    foodtruck.takeMoney(Food.HAMBURGER*hamburger);
                }
                
                else if (hamburger > foodtruck.checkCertainFood(Food.HAMBURGER)){
                    System.out.println("Sorry, we do not have enough of that food.");
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
                    System.out.println("Sorry, we do not have enough of that food.");
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
                    System.out.println("Sorry, we do not have enough of that food.");
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
                    System.out.println("Sorry, we do not have enough of that food.");
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
                    System.out.println("Sorry, we do not have enough of that food.");
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
                    System.out.println("Sorry, we do not have enough of that food.");
                }
            break;
            case "7":
                System.out.println("How many yeets would you like to order?");
                int yeet = input.nextInt();
                if (yeet <= foodtruck.checkCertainFood(Food.YEET)) {
                    System.out.println("Your yeets will cost $" + (yeet * Food.YEET));
                    foodtruck.removeFoods(7, yeet);
                    foodtruck.takeMoney(Food.YEET * yeet);
                } else if (yeet >= foodtruck.checkCertainFood(Food.YEET)) {
                    System.out.println("Sorry, we do not have enough of that food.");
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
        System.out.println("Hamburger is $3");
        System.out.println("Cheesburger is $5");
        System.out.println("Hotdog is $4");
        System.out.println("Soda is $4");
        System.out.println("Our house special, Cheesieboy is $200");
        System.out.println("Water costs $10 (Very special)");
        System.out.println("One yeet is $2");
        System.out.println("-------------------------------");
        general();
    }
    public static void checkMoney(){
        System.out.println("The food truck currently has $" + foodtruck.checkBalance());
        general();
    }

    public static void general(){
        System.out.println("Hello customer! Welcome to Jackson's Food Truck."
                + "What would you like to do?");
        System.out.println("1) Place an Order");
        System.out.println("2) Check inventory of a certian item on the Food Truck");
        System.out.println("3) Look at the Menu and the Prices");
        System.out.println("4) Check the Food Truck money");
        String choice = input.next();
        boolean choosing = true;
        while(choosing){
            switch(choice){
                case "1":
                    placeOrder();
                break;
                
                case "2":
                    checkInv();
                break;
                
                case "3":
                    menu();
                break;
                
                case "4":
                    checkMoney();
                break;

                default:
                    System.out.println("Sorry, that is not an option.");
                break;
            }
        }
    }
    public static void main(String[] args){
        foodtruck.startingInv();
        general();
    }
} 
