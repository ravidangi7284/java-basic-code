//Calculate Average Of N Numbers

package org.example;

import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum, num,average,count;
        count=1;
        sum=0;
        System.out.print("Enter the number , when you want to show average then enter 0 : ");
        num=sc.nextInt();
        while (num!= 0){
            sum=sum+num;
            count++;
            System.out.print("Enter the another number , when you want to show average then enter 0 : ");
            num= sc.nextInt();
        }

        average=sum/count;
        System.out.println("Average = "+average);
        sc.close();
    }
}
