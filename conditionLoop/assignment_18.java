//Volume Of Pyramid

import java.util.Scanner;

public class assignment_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eneter the length of Pyramid");
        int length = scanner.nextInt();
        System.out.println("Enter the width of pyramid");
        int width = scanner.nextInt();
        System.out.println("Enter the height of pyramid");
        int height = scanner.nextInt();

        double volume = (1.0/3) * length * width * height;
        System.out.println("Volume of the pyramid is: " + volume);
        scanner.close();
    }
    
}
