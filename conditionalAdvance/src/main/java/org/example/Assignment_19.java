//Sum Of A Digits Of Number

package org.example;

import java.util.Scanner;

public class Assignment_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int sum=0;

        while (num != 0){
            int digit =num%10;
            sum= sum + digit;
            num= num/10;
        }
        System.out.println("Sum of a Digit of number is "+ sum);

        sc.close();
    }
}
