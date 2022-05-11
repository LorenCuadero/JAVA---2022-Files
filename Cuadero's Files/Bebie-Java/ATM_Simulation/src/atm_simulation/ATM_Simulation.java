package pelingon_atmsimulation;
import java.util.Scanner;

public class Pelingon_ATMSimulation {

   
    public static void main(String[] args) {
        int balance = 15000, withdraw,deposit; 
        Scanner s = new Scanner (System.in);
        while (true) {
            System.out.println("CHOOSE A TRANSACTION");
            System.out.println("A. BALANCE INQUIRY");
            System.out.println("B. WITHDRAW");
            System.out.println("C. DEPOSIT");
            System.out.println("D. EXIT");
            System.out.print("Choose your transaction: ");
            String bank = s.nextLine();
            
            switch (bank){
                case "A":
                    System.out.println("Your Balance: " + balance);
                    System.out.println("");
                    break;
                    
                case "B":
                    System.out.print("Enter money to be withdrawn: ");
                    withdraw = s.nextInt();
                    if (balance >= withdraw ) {
                         balance = balance - withdraw;
                         
                        System.out.println("Your new balance is " + balance);
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;
                    
                case "C": 
                    System.out.println("Your current balance is " + balance);
                    System.out.println("How much do you want to deposit: ");
                    deposit = s.nextInt();
                    balance = balance + deposit;
                    System.out.println("Thank you for depositing. Your new balance is " + balance);
                    break;
                    
                case "D":
                    System.exit(0);
                    }
            
            }
    }
    
}