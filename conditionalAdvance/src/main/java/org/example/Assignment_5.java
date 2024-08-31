//Calculate Commission Percentage

package org.example;

import java.util.Scanner;

public class Assignment_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amount : ");
        int amount = sc.nextInt();
        System.out.print("Enter the Commission percentage : ");
        int commission = sc.nextInt();

        double commissionAmount= (amount*commission)/100;

        System.out.println("commission Amount is "+ commissionAmount);

        sc.close();

    }
}
