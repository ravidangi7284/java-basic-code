//Curved Surface Area Of Cylinder

import java.util.Scanner;

public class assignment_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
        
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();
        
        double curvedSurfaceArea = 2 * Math.PI * radius * (radius + height);
        
        System.out.printf("The curved surface area of the cylinder is %.2f square units.\n", curvedSurfaceArea);
        
        scanner.close();
        

    }
    
}
