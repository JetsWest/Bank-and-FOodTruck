/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author atkins4440j
 */
public class Account {
    private double balance;
    private String owner;
    
    //constuctor
    //Format : public [name of class] ([info you need to build object])
    public Account(String owner, double startingBalance){
        this.balance = startingBalance;
        this.owner = owner;
    }
    
    public Account(String owner){
        this(owner, 0.0);
    }
    
    //WARNING: Silently breaks on negative deposits
    public void takeDeposit(double amount){
        this.balance += amount;
    }
    
    //WARNING: Silently gives as much money as left in the account on overdraft
    public double giveMoney(double amount){
        if (this.balance >= amount){
            this.balance -= amount;
            return amount;
        }else{
            double result = this.balance;
            this.balance = 0.0;
            return result;
        }
    }
       
    
    public double checkBalance(){
        return this.balance;
    }
    
    public String getOwner(){
        return this.owner;
    }
}
