package homework_week4_maninisheth;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class PrimeNumberOrNot {
    public static void main(String[] args) {
        int num, i, count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        num = scan.nextInt();

        for (i = 2; i < num; i++) {
           //condition for non prime number
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0)
            System.out.println(" \nit is a Prime Number.");
        else
            System.out.println(" \nit is not a Prime Number.");
        scan.close();
    }
}
