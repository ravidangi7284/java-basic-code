//Area Of Equilateral Triangle

package org.example;

import java.util.Scanner;

public class Assignment_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of Equilateral Triangle : ");
        int s = sc.nextInt();

        double area = 0.43301270189*s;
        System.out.println("Area Of Equilateral Triangle : "+area);
    }
}
