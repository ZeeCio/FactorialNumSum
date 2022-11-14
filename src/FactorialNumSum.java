import java.util.Scanner;

public class FactorialNumSum {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int numInput = x.nextInt();     // Input number
        int sum = 0;

        // Looping through each number in range 1 -- numInput
        for (int i = 1; i <= numInput; i++) {
            sum += findFactorialOf(i);        // Sum of factorials of each number in range
        }
        System.out.println(sum);

    } // End of main

    public static int findFactorialOf(int n) {          // Method to find factorial of number
        int fact = 1;                                   // Multiply by 1 - start
        for (int i = 1; i <= n; i++) {
            fact = fact * i;                            // top-up values in fact: 1 * (i - loop) 1*2*3*4.....n
        }return fact;
    } // End of findFactorialOf

} // End of class