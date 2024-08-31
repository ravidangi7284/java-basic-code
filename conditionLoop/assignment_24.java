//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class assignment_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entera number , if  you want to print the largest number then enter 0 :");
        int num = sc.nextInt();
        int largest = num;
        
        while (num != 0) {
            System.out.println("Enter another number, if you want to print the largest number then enter 0 :");
            num = sc.nextInt();
            if (num > largest) {
                largest = num;
            }
        }
        
        System.out.println("The largest number is: " + largest);
        sc.close();
    }
    
}
