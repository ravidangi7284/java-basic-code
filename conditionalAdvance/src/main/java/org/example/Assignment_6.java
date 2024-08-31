//Power In Java

package org.example;

import java.util.Scanner;

public class Assignment_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer : ");
        int num= sc.nextInt();
        System.out.print("Enter the power of integer : ");
        int po=sc.nextInt();

        double op = Math.pow(num,po);

        System.out.println("your power output is "+op);
        sc.close();
    }
}
