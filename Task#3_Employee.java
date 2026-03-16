package Lab06Task03;

import java.util.Scanner;

public class Employee {
    private double salary;

    void setSalary (double salary){
        this.salary = salary;
    }

    double getSalary (){ return salary; }

    void displaySalary(){
        System.out.println(salary);
    }
}

class PermanentEmployee extends Employee {
    double calculateBonus (double salary){
        return  0.1 * salary;
    }


}

class Main {
    public static void main(String[] args){
        PermanentEmployee pe = new PermanentEmployee();
        Scanner sc = new Scanner(System.in);
        double salary;
        System.out.println("Enter salary of employee: ");
        salary = sc.nextDouble();
        pe.setSalary(salary);

        System.out.println("Salary of Employee is: " + pe.getSalary());

        double bonus = pe.calculateBonus(pe.getSalary());
        int empBonus = (int) bonus;

        System.out.println("Bonus for this employee is: " + empBonus);
    }
}