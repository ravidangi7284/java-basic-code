//Compound Interest Java Program

package org.example;

import java.util.Scanner;

public class Assignment_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Capital Amount : ");
        int amount = sc.nextInt();

        System.out.print("Enter the rate of Interest : ");
        double rate = sc.nextDouble();

        System.out.print("Enter the time period : ");
        double time = sc.nextDouble();



        double CI = amount * Math.pow((1 + rate / 100) , time );

        System.out.println("Compound Interest = " + CI);

        sc.close();
    }
}
