//LCM Of Two Numbers

package org.example;

import java.util.Scanner;

public class Assignment_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        int hcf=1;

        for (int i = 1; i <= num1; i++) {
            if(num1 % i==0 && num2 % i==0){
                hcf=i;
            }
        }
        System.out.println("hcf is "+ hcf);
    }
}

