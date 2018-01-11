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
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Where a program ACTUALLY runs!!!
        Account jackson = new Account("michael", 20);
        jackson.takeDeposit(30);
        double loveMoney = jackson.giveMoney(5);
        System.out.println("Jackson's accout has $" + jackson.checkBalance() + " within it.");
        double knack2Money = jackson.giveMoney(60);
        System.out.println("Jackson has $" + knack2Money + " to buy Knack 2 BABEYYYYYYYYYY");
    }
    
}
    