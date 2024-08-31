//Volume Of Cylinder

import java.util.Scanner;

public class assignment_16 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter the radius of the Cylinder");
            int radius = sc.nextInt();
            System.out.println("Enter the height of the Cylinder");
            int height = sc.nextInt();

            double volume = Math.PI * Math.pow(radius, 2) * height;
            System.out.println(volume);
        }
    }
    
}
