package chapter2;


import java.util.Scanner;

public class CoffeeCraze {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter season of the year");
        String season = scanner.nextLine();

        System.out.println("Pls enter a whole number");
        int number = scanner.nextInt();

        System.out.println("On one fine "+season+" day, I drink a minimum of "+number+" cups of Coffee!");
    }
}
