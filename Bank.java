/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import java.util.ArrayList;
/**
 *
 * @author atkins4440j
 */
public class Bank {
    private ArrayList<Account> accounts;
    
    public Bank(){
        this.accounts = new ArrayList<>();
    }
    
    public void openAccount(String owner, double startingBalance){
        Account account = new Account(owner, startingBalance);
        this.accounts.add(account);
    }
    
    public void openAccount(String owner){
        this.accounts.add(new Account(owner));
    }
    
    //WARNING: Silently returns 0 if no account is found
    public double closeAccount(String owner){
        Account removed=new Account("");
        for(Account account:this.accounts){
            if (account.getOwner().equalsIgnoreCase(owner)){
                removed = account;
                this.accounts.remove(account);
            }
        }
        return removed.checkBalance();
    }
    public void transfer(Account from, Account to, double amount){
        to.takeDeposit(from.giveMoney(amount));
    }
    
    public Account getAccount (String owner) throws Exception{
        for(Account account:this.accounts){
            if (account.getOwner().equalsIgnoreCase(owner)){
                this.accounts.remove(account);
            }
        }
        throw new Exception ("The owner specified does nothave an account in the bank");
    }
    
    public int getNumberOfAccounts(){
        return this.accounts.size();
    }
    public double getAvailableFunds(){
        double result = 0;
        for(Account account:this.accounts){
            result += account.checkBalance();
        }
        return result;
    }
}
