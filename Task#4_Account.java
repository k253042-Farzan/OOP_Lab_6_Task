package Lab06Task04;

import java.util.Scanner;
public class Account {
    private double balance;

    void setBalance (double balance){
        this.balance = balance;
    }

    double getBalance (){ return balance; }

}

class SavingAccount extends Account {
    void setBalance (double balance){
        super.setBalance(balance);
    }
}

class PremiumSaving extends SavingAccount {
    final double interestRate = 0.07;
    double calculateInterest (double balance){
        return interestRate * balance;
    }


}

class Main {
    public static void main(String[] args){
        PremiumSaving ps = new PremiumSaving();
        double balance;
        System.out.println("Enter balance in the account.");
        Scanner sc = new Scanner(System.in);
        balance = sc.nextDouble();
        ps.setBalance(balance);

        int interest =(int) ps.calculateInterest(ps.getBalance());
        System.out.println("Account balance is: " + ps.getBalance());
        System.out.println("Final interest: " + interest);

    }
}