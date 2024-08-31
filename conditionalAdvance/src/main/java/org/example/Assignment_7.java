//Calculate Depreciation of Value

package org.example;

import java.util.Scanner;

public class Assignment_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial value of asset : ");
        float v = sc.nextInt();
        System.out.print("Enter the rate of change of asset : ");
        float r = sc.nextInt();
        System.out.print("Enter the holding time of asset : ");
        float t = sc.nextInt();

        double v2 = v * Math.pow((1 - r / 100), t);

        System.out.println(v2);
    }
}
