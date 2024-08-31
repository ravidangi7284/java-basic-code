//Volume Of Sphere

import java.util.Scanner;

public class assignment_17 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the radius of Sphere");
            double radius = sc.nextDouble();
            double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
            System.out.println("Volume of Sphere: " + volume);
        }
        
    }
    
}
