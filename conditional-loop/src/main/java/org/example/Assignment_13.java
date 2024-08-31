//Perimeter Of Rhombus


package org.example;

import java.util.Scanner;

public class Assignment_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of Rhombus : ");
        int s = sc.nextInt();

        double Perimeter = 4*s;
        System.out.println("Perimeter Of Rhombus : "+Perimeter);
    }
}

