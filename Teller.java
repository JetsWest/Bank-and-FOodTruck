
package bank;

import java.util.Scanner;
public class Teller {  
    private static Scanner input = new Scanner(System.in);
    private static Bank bank = new Bank();
    
    //WARNING: breaks if any input mismtches occur OR the owners don't exist
    public static void transfer()throws Exception{
        System.out.println("Whose account would you like to draw from? ");
        String from = input.next();
        System.out.println("Whose account would you like to transfer to? ");
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
        System.out.println("Welcome to the Bank Management System!");
        boolean done = false;
        while(!done){
            System.out.println("What would you like to do?");
            System.out.println("1) Open an Account");
            System.out.println("2) Close an Account");
            System.out.println("3) Check account's balance");
            System.out.println("4) Deposit money to an account");
            System.out.println("5) Withdrawl money from an account");
            System.out.println("6) Transfer money to an account");
            System.out.println("7) Check bank status");
            System.out.println("8) Quit");
            System.out.println(">>> ");
            
            String choice = input.next();
            switch(choice){
                case "1" :
                    openAccount();
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
                    withdraw();
                break;
                
                case "6" :
                    transfer();
                break;
                
                case "7" :
                    checkBankStatus();
                break;
                
                case "8" :
                    System.out.println("Thanks for using the system!");
                    done = true;
                break;
                
                default:
                    System.out.println("I'm sorry, that choice does not exist and is invalid.");
                break;
            }
        }
        
    }
}
