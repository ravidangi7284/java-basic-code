//Perimeter Of Square

package org.example;

import java.util.Scanner;

public class Assignment_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square : ");
        int s = sc.nextInt();

        double Perimeter = 4*s;
        System.out.println("Perimeter Of Square : "+Perimeter);
    }
}

