import java.util.Scanner;
/**
 * Created by Kyle DuFrene, Andy Nguyen, Ben Kroon on 12/12/2017.
 */
public class Necklace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first starting number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second starting number: ");
        int secondNumber = sc.nextInt();

        int currentNumber1 = firstNumber, currentNumber2 = secondNumber;
        int sum = 0;

        System.out.print(firstNumber + " " + secondNumber + " ");

        do {
            sum = currentNumber1 + currentNumber2;
            sum = sum % 10;
            currentNumber1 = currentNumber2;
            currentNumber2 = sum;
            System.out.print(sum + " ");
        } while (currentNumber1 != firstNumber || currentNumber2 != secondNumber);
    }
}
