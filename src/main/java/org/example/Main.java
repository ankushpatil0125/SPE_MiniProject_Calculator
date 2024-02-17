package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Scientific Calculator Operations:");
            System.out.println("Choose Operation You want to perform:");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Exit");

            System.out.print("Choose an option (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
//                    scanner = new Scanner(System.in);
                    System.out.print("Enter the number (x) for square root: ");
                    double x = scanner.nextDouble();
                    double sqroot=squareRoot(x);
                    System.out.println("Square Root of " + x + " is: " + sqroot);
                    break;
                case 2:
                    System.out.print("Enter the number (x) for factorial: ");
                    int y = scanner.nextInt();
                    long fact=factorial(y);
                    if(fact!=-1)
                        System.out.println("Factorial of " + y + " is: " + fact);
                    break;
                case 3:
                    System.out.print("Enter the number (x) for natural logarithm: ");
                    double z = scanner.nextDouble();
                    double nlog=naturalLogarithm(z);
                    System.out.println("Natural Logarithm of " + z + " is: " + nlog);
                    break;
                case 4:
                    System.out.print("Enter the base (x) for power: ");
                    double a = scanner.nextDouble();
                    System.out.print("Enter the exponent (b) for power: ");
                    double b = scanner.nextDouble();
                    double power=power(a,b);
                    System.out.println(a + " raised to the power of " + b + " is: " + power);
                    break;
                case 5:
                    System.out.println("Exiting the calculator...!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
    public static double squareRoot(double x) {

        return Math.sqrt(x);
    }
    public static long factorial(int x) {
        if (x < 0) {
            System.out.println("Factorial is not defined for negative numbers Please Enter positive nos");
            return -1;
        }
        long result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }
    public static double naturalLogarithm(double x) {
        return Math.log(x);
    }
    public static double power(double a,double b) {
        return Math.pow(a, b);
    }
}