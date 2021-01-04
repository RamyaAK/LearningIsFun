package chapter3;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String args[]){
        int salary =1000;
        int bonus = 250;
        int bonusSalary = 1250;

        System.out.println("How many sales did the employee did for this month");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        if(sales>=10){ System.out.println("Additional bonus of "+bonus+" will be added to your salary! $"+bonusSalary);
        }else {
            System.out.println("You will be getting your salary without bonus $"+salary);
        }
    }
}
