//Perfect Number In Java

package org.example;

import java.util.Scanner;

public class Assignment_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which you want check the perfect number or not : ");
        int num = sc.nextInt();
        int sum=0;
        for (int i = 1; i < num; i++) {
            if(num%i==0){
                sum=sum+i;
            }
        }
        if (sum==num){
            System.out.println("This number is perfect number");
        }else {
            System.out.println("This number is not a perfect number");
        }

    }
}
