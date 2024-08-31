//Check Leap Year Or Not

package org.example;

import java.util.Scanner;

public class Assignment_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year which you want to check leap year or not : ");
        int year = sc.nextInt();

        if (year%100==0){
            if (year%400==0){
                System.out.println("This year is Leap Year");
            }else {
                System.out.println("This year is not Leap Year");
            }
        }else if (year%4==0){
            System.out.println("This year is Leap Year");
        }else {
            System.out.println("This year is not Leap Year");
        }
    }
}
