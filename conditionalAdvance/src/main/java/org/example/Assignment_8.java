//Calculate Batting Average

package org.example;

import java.util.Scanner;

public class Assignment_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the scored of Batsman : ");
        int score = input.nextInt();

        System.out.print("Enter the total matches he/she batted in : ");
        int matches = input.nextInt();

        System.out.print("Enter the matches which he/she notout : ");
        int notout = input.nextInt();

        int totalMathches = matches-notout;
        double battingAverage = score/totalMathches;
        System.out.println("Batting Average of batsman is " + battingAverage);

        input.close();
    }


}
