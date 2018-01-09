import java.util.Scanner;

/**
 * Created by Kyle DuFrene, Andy Nguyen, and Ben Kroon 12/7/2017.
 *
 * Pseudocode
 *
 * Start scanner
 * Ask for degress
 * Convert to radians
 * Output sine, cosine and tangent
 */
public class Classy {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();
        angle = java.lang.Math.toRadians(angle);
        System.out.println("Sine: " + Math.round(Math.sin(angle)*100.0)/100.0);
        System.out.println("Cosine: " + Math.round(Math.cos(angle)*100.0)/100.0);
        System.out.println("Tangent: " + Math.round(java.lang.Math.tan(angle)*100.0) / 100.0);


    }
}
