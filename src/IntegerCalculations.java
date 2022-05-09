import java.util.Scanner;

/**
 * This class takes two integers and returns the least common multiple, greatest common factor,
 * and whether or not each integer is a prime number or perfect number.
 *
 * @mfesta
 *
 */

public class IntegerCalculations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Integers for input
        int firstInt;
        int secondInt;

        // Loop through the request for integers while the input is negative.
        do {
            System.out.println("Enter the first positive integer: ");
            firstInt = scanner.nextInt();
        } while (firstInt <= 0);
        do {
            System.out.println("Enter the second positive integer: ");
            secondInt = scanner.nextInt();
        } while (secondInt <= 0);

        // Calculates the LCM and GCF of the pair of integers.
        System.out.println("The least common multiple (LCM) of " + firstInt +
                " and " + secondInt + " is " + findLCM(firstInt, secondInt) + ".");
        System.out.println("The greatest common factor (GCF) of " + firstInt +
                " and " + secondInt + " is " + findGCF(firstInt, secondInt) + ".");

        // Calculates if either integer is a prime number.
        if (isPrime(firstInt)) {
            System.out.println(firstInt + " is a prime number.");
        } else {
            System.out.println(firstInt + " is NOT a prime number.");
        }
        if (isPrime(secondInt)) {
            System.out.println(secondInt + " is a prime number.");
        } else {
            System.out.println(secondInt + " is NOT a prime number.");
        }

        // Calculates if either integer is a perfect number.
        if (isPerfect(firstInt)) {
            System.out.println(firstInt + " is a perfect number.");
        } else {
            System.out.println(firstInt + " is NOT a perfect number.");
        }
        if (isPerfect(secondInt)) {
            System.out.println(secondInt + " is a perfect number.");
        } else {
            System.out.println(secondInt + " is NOT a perfect number.");
        }

    }

    /**
     * This method calculates the least common multiple between the two integers.
     * @param firstInt - first inputted integer
     * @param secondInt - second inputted integer
     * @return - this returns the LCM in the while statement.
     */
    public static int findLCM(int firstInt, int secondInt) {
        int lcm = (firstInt > secondInt) ? firstInt : secondInt;

        while(true) {
            if (lcm % firstInt == 0 && lcm % secondInt == 0) {
                return lcm;
            }
            ++lcm;
        }
    }

    /**
     * This method calculates the greatest common factor between the two integers.
     * @param firstInt
     * @param secondInt
     * @return the greatest common facter if both integers are equal.
     */
    public static int findGCF(int firstInt, int secondInt) {
        while(firstInt != secondInt) {
            if (firstInt > secondInt) {
                firstInt -= secondInt;
            } else {
                secondInt -= firstInt;
            }
        }
        int gcf = firstInt;
        return gcf;
    }

    /**
     * This method calculates if either integer is a prime number.
     * @param number
     * @return
     */
    public static boolean isPrime(int number) {
        for(int i = 2; i <= number/i; ++i) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * This method calculates if either number is a perfect number.
     * @param number
     * @return
     */

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; ++i) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            return true;
        }
        return false;
    }
}
