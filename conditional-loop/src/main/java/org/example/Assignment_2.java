//Area Of Triangle

package org.example;

import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of triangle : ");
        int b = sc.nextInt();
        System.out.println("Enter the height of triangle : ");
        int h = sc.nextInt();

        double area = (h*b)/2 ;
        System.out.println("Area of traingle : "+area);
    }
}
