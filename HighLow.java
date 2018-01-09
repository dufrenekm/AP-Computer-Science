/**
Created by Ben Kroon, Kyle DuFrene, and Andy Nguyen
 */
import java.util.Scanner;
import java.util.Random;
public class HighLow {
    public static void main(String args[]) {
        System.out.println("High Low Game\n\nRULES");
        System.out.println("Numbers 1 through 6 are low");
        System.out.println("Numbers 8 through 13 are high");
        System.out.println("Number 7 is neither high nor low");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continue_loop = true;
        String input;
        int points = 1000;
        int point_risk = 0;
        int low_or_high = 0;
        int actual = 0;
        while (continue_loop) {
            System.out.println("You have " + points + " points.\n");
            System.out.print("Enter points to risk: ");
            point_risk = scanner.nextInt();
            System.out.print("Predict (1=High, 0=Low): ");
            low_or_high = scanner.nextInt();
            actual = random.nextInt(13) + 1;
            System.out.println("Number is " + actual);

            if ((low_or_high == 0 && actual < 7) ||
                (low_or_high == 1 && actual > 7)) {
                System.out.println("You win.");
                points += point_risk * 2;
            } else {
                System.out.println("You lose.");
                points -= point_risk;
            }
            if (points <= 0) {
             System.out.println("LOSSSEEEEERRRRRRRRR!!!!!!!!!!!!!");
                continue_loop = false;
            } else {
                System.out.print("Play again? ");
                input = scanner.next();

                if (input.equals("n")) continue_loop = false;
            }
        }
    }
}
