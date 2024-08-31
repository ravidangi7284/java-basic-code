//Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.Scanner;

public class assignment_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum, num;
        sum= 0;
        num= sc.nextInt();
        sum=sum+num;
        while (num!=0) {
            num= sc.nextInt();
            sum = sum+num;

            
        }
        System.out.println("sum: " + sum);
        sc.close();

    }
    
}
