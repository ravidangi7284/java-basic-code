//Perimeter Of Parallelogram

package org.example;

import java.util.Scanner;

public class Assignment_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of reactangle : ");
        int b = sc.nextInt();
        System.out.println("Enter the height of reactangle : ");
        int h = sc.nextInt();

        double Perimeter = 2*(h+b);
        System.out.println("Perimeter Of Parallelogram : "+Perimeter);
    }
}
