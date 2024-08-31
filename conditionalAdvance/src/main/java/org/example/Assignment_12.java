//Reverse A String In Java

package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Assignment_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String whoose to reverse : ");
        String str = sc.next();
        String str2= "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            str2 = ch + str2;
        }

        System.out.println("Reversed String = " + str2);

        sc.close();
    }
}
