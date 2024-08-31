//Volume Of Cone Java Program

package org.example;

import java.util.Scanner;

public class Assignment_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radious of cone : ");
        int r = sc.nextInt();
        System.out.println("Enter the height of cone : ");
        int h = sc.nextInt();

        double Volume = 3.14*r*r*(h/3);
        System.out.println("Volume Of Cone : "+Volume);


    }
}


