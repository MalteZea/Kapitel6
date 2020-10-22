package Opg2.SumTheDigits;

public class Calculation {
    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        System.out.println("The additive sum of the the number is " + sum);
        return sum;
    }
}
