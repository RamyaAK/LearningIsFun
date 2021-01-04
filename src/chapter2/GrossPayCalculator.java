package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main (String args[]){

        System.out.println("Enter the number of hours the employee has worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("Enter the employees pay rate");
        double rate = scanner.nextDouble();

        double grossPay = hours * rate ;

        System.out.println("The total gross pay of an employee is $"+ grossPay);

    }
}
