//Calculate CGPA Java Program

package org.example;

import java.util.Scanner;

public class Assignment_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your hindi marks : ");
        int hindiMarks= sc.nextInt();

        System.out.print("Enter your mathematics marks : ");
        int mathMarks= sc.nextInt();

        System.out.print("Enter your sanskrit marks : ");
        int sansMarks= sc.nextInt();

        System.out.print("Enter your social science marks : ");
        int sstMarks= sc.nextInt();

        System.out.print("Enter your science marks : ");
        int scienceMarks= sc.nextInt();

        int totalMarks = (hindiMarks + mathMarks + sansMarks + sstMarks + scienceMarks);
        int percentage = ( totalMarks * 100 ) / 500;
        double cgpa = percentage / 9.5;

        System.out.println("your marks percentage = " + percentage);
        System.out.println("Your marks CGPA = " + cgpa);

        sc.close();
    }
}
