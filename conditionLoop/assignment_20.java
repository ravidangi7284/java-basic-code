//Total Surface Area Of Cube

import java.util.Scanner;

public class assignment_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the side length of the cube: ");
        double sideLength = sc.nextDouble();
        
        double surfaceArea = 6 * Math.pow(sideLength, 2);
        
        System.out.println("The total surface area of the cube is: " + surfaceArea);
        
        sc.close();

    }
}
    



