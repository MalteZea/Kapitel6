package Opg5.SortThreeNumbers;

//Write a method with the following header to display three
//numbers in decreasing order:
//public static void displaySortedNumbers(
//double num1, double num2, double num3)
//Write a test program that prompts the user to enter three numbers and invokes the
//method to display them in decreasing order.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input three number: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
       // SortedNumbers.displaySortedNumbers(num1, num2, num3);
    }
}
