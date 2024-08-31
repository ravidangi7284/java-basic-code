//Future Investment Value

package org.example;

import java.util.Scanner;

public class Assignment_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("present value of the investment : ");
        int pv = sc.nextInt();

        System.out.println("annual interest rate : ");
        double r = sc.nextDouble();

        System.out.println("number of years the money is invested : ");
        double n = sc.nextDouble();

        double fv = pv * Math.pow((1+r/100) , n);

        System.out.println("Future Investment Value : " + fv);

        sc.close();
    }


}
