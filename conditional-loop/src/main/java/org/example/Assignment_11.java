//Perimeter Of Rectangle


package org.example;

import java.util.Scanner;

public class Assignment_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of reactangle : ");
        int l = sc.nextInt();
        System.out.println("Enter the breadth of reactangle : ");
        int b = sc.nextInt();

        double Perimeter =2*(l+b);
        System.out.println("Perimeter of reactangle : "+Perimeter);
    }
}
