//Perimeter Of Circle

package org.example;

import java.util.Scanner;

public class Assignment_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radious of circle : ");
        int r = sc.nextInt();

        double perimeter = 2 * 3.14 * r;
        System.out.println("perimeter of circle : "+perimeter);
    }
}
