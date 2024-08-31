//Find Ncr & Npr

package org.example;

import java.util.Scanner;

public class Assignment_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items : ");
        int n = sc.nextInt();

        System.out.println("Enter the number of items being chosen at a time : ");
        int r = sc.nextInt();

        int nCr = factorial(n) / factorial(r) * factorial(n-r);
        int nPr = factorial(n) / factorial(n-r);

        System.out.println("nCr = " + nCr);
        System.out.println("nPr = " + nPr);

        sc.close();


    }

    static  int factorial(int n){
        int fact=1;
        if (n==0){
            return 1;
        }
        for (int i = 1; i <=n ; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
