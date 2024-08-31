//Calculate Electricity Bill

package org.example;

import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of unit you used : ");
        int unit= sc.nextInt();
        int fare;

        if (unit<=100){
            fare= unit*10;
            System.out.println("Your bill is "+fare);
        } else if (unit<=200) {
            fare = unit*12;            System.out.println("Your bill is "+fare);
        } else if (unit<=500) {
            fare = unit*15;
            System.out.println("Your bill is "+fare);
        } else if (unit<=1000) {
            fare = unit*20;
            System.out.println("Your bill is "+fare);
        }
    }
}
