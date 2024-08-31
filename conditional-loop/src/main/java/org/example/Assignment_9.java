//Perimeter Of Equilateral Triangle

package org.example;

import java.util.Scanner;

public class Assignment_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of Equilateral Triangle : ");
        int s = sc.nextInt();

        double Perimeter = 3*s;
        System.out.println("Perimeter Of Equilateral Triangle : "+Perimeter);
    }
}