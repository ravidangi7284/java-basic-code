//Area Of Circle Java Program

package org.example;

import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radious of circle : ");
        int r = sc.nextInt();

        double area = 3.14*r*r;
        System.out.println("Area of circle : "+area);
    }
}
