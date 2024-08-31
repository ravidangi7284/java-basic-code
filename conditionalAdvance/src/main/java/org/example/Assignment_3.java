//Calculate Discount Of Product

package org.example;

import java.util.Scanner;

public class Assignment_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of product : ");
        int amount = sc.nextInt();
        System.out.print("Enter the Discount percentage : ");
        int discount = sc.nextInt();

        double discountAmount= (amount*discount)/100;

        System.out.println("Discount of Product is "+ discountAmount);

        sc.close();

    }
}
