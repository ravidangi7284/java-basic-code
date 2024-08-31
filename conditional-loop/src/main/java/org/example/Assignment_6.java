//Area Of Rhombus  Diagonal

package org.example;

import java.util.Scanner;

public class Assignment_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Diagonal : ");
        int p = sc.nextInt();
        System.out.println("Enter the second Diagonal : ");
        int q = sc.nextInt();

        double area = (p*q)/2;
        System.out.println("Area Of Rhombus : "+area);
    }
}


