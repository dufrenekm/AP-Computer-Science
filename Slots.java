/**
 * Created by Kyle DuFrene, Ben Kroon, and Andy Nguyen on 1/4/2018.
 */
import java.util.Scanner;
import java.util.Random;

public class Slots {

    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number_of_numbers_in_slotmachine = 7;

        double money = 5.00;
        double pot = 25.00;
        String input;
        int num1, num2, num3;
        boolean continue_loop = true;

        while (continue_loop) {

            System.out.println("The pot has: $" + pot);
            System.out.println("You have: $" + money);
            System.out.print("Hit enter to play 0.25. Type 'n' to quit");
            input = scanner.nextLine();

            if (input.equals("n")) break;

            money -= 0.25;
            pot += 0.25;

            num1 = random.nextInt(number_of_numbers_in_slotmachine) + 1;
            num2 = random.nextInt(number_of_numbers_in_slotmachine) + 1;
            num3 = random.nextInt(number_of_numbers_in_slotmachine) + 1;

            System.out.println("\nNumbers: " + num1 + " " + num2 + " " + num3);

            if (num1 == number_of_numbers_in_slotmachine && num2 == number_of_numbers_in_slotmachine && num3 == number_of_numbers_in_slotmachine) {
                System.out.println("JACKPOT!!!");
                money += pot;
                pot = 0;
            } else if (num1 == num2 && num1 == num3 && num2 == num3) {
                System.out.println("Straight!");
                money += 1;
                pot -= 1;
            }

            if (money <= 0) {
                System.out.println("You lose.");
                continue_loop = false;
            }
        }
    }

}
