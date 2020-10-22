package Opg2.SumTheDigits;

//(Sum the digits in an integer) Write a method that computes the sum of the digits
//in an integer. Use the following method header: public static int sumDigits(long n)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number for calculation ");
        long n = input.nextLong();
        Calculation.sumDigits(n);
    }
}
