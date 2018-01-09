import java.util.Scanner;

/**
 * Created by Kyle DuFrene, Ben Kroon, Andy Nguyen on 12/8/2017.
 */
public class December8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an account value: ");
        double balance = scanner.nextDouble();
       // System.out.println("Are the payments monthly or yearly? Enter an y for yearly or an m for monthly: ");
       //   char term = scanner.next().toLowerCase().toCharArray()[0];
        System.out.println("Enter number of years: ");
        double termNumber = scanner.nextDouble();

        System.out.println("Interest rate: ");
        double intrest = scanner.nextDouble();

        double num = intrest*balance;
        double denom = 1.0-Math.pow(((1.0+intrest)),-termNumber);
        System.out.println("$" + num/denom + " annually");
        System.out.println("$" + num/denom/12 + " monthly");

    }
}
