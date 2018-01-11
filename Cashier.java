package foodtrucka;
import java.util.Scanner;
public class Cashier {
    private static Scanner input = new Scanner(System.in);
    private static FoodTruckA foodtruck = new FoodTruckA();
    
    //WARNING: breaks if any input mismtches occur OR the owners don't exist
    public static void placeOrder()throws Exception{
        System.out.println("What would you like to order?");
        System.out.println("1) Hamburger");
        System.out.println("2) Pizza");
        System.out.println("3) Cheeseburger");
        System.out.println("4) Wings");
        System.out.println("5) Cheesie Boy");
        String choice = input.next();
            switch(choice){
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
            }
        String to = input.next();
        System.out.println("How much money would you like to transfer? ");
        double amount = input.nextDouble();
        bank.transfer(bank.getAccount(from), bank.getAccount(to), amount);
    }
    
    //WARNING: breaks if any input mismtches occur OR the owners don't exist
    public static void deposit() throws Exception{
        System.out.println("Whose account would you like to desposit into? ");
        String to = input.next();
        System.out.println("How much money would you like to deposit? ");
        double amount = input.nextDouble();
        Account account = bank.getAccount(to);
        account.takeDeposit(amount);
        System.out.println("$" + amount + " was deposited into " + to + "'s account.");
    }
    
    public static void withdraw() throws Exception{
        System.out.println("Whose account would you like to withdraw from? ");
        String from = input.next();
        System.out.println("How much money would you like to withdraw? ");
        double amount = input.nextDouble();
        Account account = bank.getAccount(from);
        account.giveMoney(amount);
        System.out.println("$" + account.giveMoney(amount) + " was withdrawn from " + from + "'s account.");
    }
    
    public static void openAccount(){
        System.out.println("Please enter a name for your account: ");
        String name = input.next();
        System.out.println("How much would you like to deposit as a starting balance? ");
        double amount = input.nextDouble();
        bank.openAccount(name, amount);
    }
    
    public static void closeAccount(){
        System.out.println("What is he name of the account owner "
                + "for the account you want to close? ");
        String name = input.next();
        System.out.println(name + "'s account was closed and the remaining $"
                + bank.closeAccount(name) + " was withdrawn.");
    }
    public static void checkBankStatus(){
        System.out.println("The bank currently manages " 
                + bank.getNumberOfAccounts() + " accounts");
        System.out.println("The bank currently has $" 
                + bank.getAvailableFunds() + " at its disposal.");
    }
    public static void checkAccountBalance() throws Exception{
        System.out.println("What is the name of the account owner?");
        String name = input.next();
        System.out.println("Balance of " + name + "'account is $" 
                + bank.getAccount(name).checkBalance());
    }
    public static void main(String[] args) throws Exception{
        System.out.println("Welcome to the Food Truck Fun Time!");
        boolean done = false;
        while(!done){
            System.out.println("What would you like to do?");
            System.out.println("1) Place an Order");
            System.out.println("2) Check order status");
            System.out.println("3) Check food truck balance");
            System.out.println("4) Donate to the Food Truck");
            System.out.println("5) Look at the menu");
            System.out.println("6) Leave");
            System.out.println(">>> ");
            
            String choice = input.next();
            switch(choice){
                case "1" :
                    placeOrder();
                break;
                
                case "2" :
                    closeAccount();
                break;
                
                case "3" :
                    checkAccountBalance();
                break;
                
                case "4" :
                   deposit();
                break;
                
                case "5" :
                    deposit();
                break;
                case "6" :
                    System.out.println("Thanks come again! Have a nice day!");
                    done = true;
                break;
                
                default:
                    System.out.println("I'm sorry, that choice does not exist and is invalid.");
                break;
            }
        }
        
    }
}
