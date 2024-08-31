//Java Program Vowel Or Consonant

package org.example;



import java.util.Scanner;

public class Assignment_16 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the charactor which you want to check the vowel or consonant : ");
        String str = sc.next();


        if (str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")){
            System.out.println("vowel");
        } else if (str.equals("A") || str.equals("E") || str.equals("I") || str.equals("O") || str.equals("U")) {
            System.out.println("vowel");
        }else {
            System.out.println("consonant");
        }
    }
}
