//Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class assignment_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1= scanner.nextInt();
        System.out.println("Enter the second number");
        int num2= scanner.nextInt();
        int product = calculateProduct(num1, num2);
        int sum = calculateSum(num1, num2);

        int difference = product - sum;
        System.out.println("Difference = " + difference);

        scanner.close();
    }

     static int calculateSum(int num1, int num2) {
        return num1+num2;
    }

     static int calculateProduct(int num1, int num2) {
        return (num1*num2);
    }
    
}
