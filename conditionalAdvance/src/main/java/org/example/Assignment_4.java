//Calculate Distance Between Two Points

package org.example;

import java.util.Scanner;

public class Assignment_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x1 : ");
        int x1= sc.nextInt();
        System.out.print("Enter the value of x2 : ");
        int x2= sc.nextInt();
        System.out.print("Enter the value of y1 : ");
        int y1= sc.nextInt();
        System.out.print("Enter the value of y2 : ");
        int y2= sc.nextInt();

        double distance = Math.sqrt((x2-x1)*(y2-y1));

        System.out.println("Distance between two point is " + distance);

        sc.close();

    }
}
