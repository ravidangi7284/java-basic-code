//Area Of Isosceles Triangle

package org.example;

import java.util.Scanner;

public class Assignment_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of triangle : ");
        int b = sc.nextInt();
        System.out.println("Enter the height of triangle : ");
        int h = sc.nextInt();

        double area = (h*b)/2 ;
        System.out.println("Area Of Isosceles Triangle : "+area);
    }
}
