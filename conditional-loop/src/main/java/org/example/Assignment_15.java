//Volume Of Prism


package org.example;

import java.util.Scanner;

public class Assignment_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of prism : ");
        int b = sc.nextInt();
        System.out.println("Enter the height of prism : ");
        int h = sc.nextInt();

        double Volume = b*h;
        System.out.println("Volume Of Prism : "+Volume);


    }
}