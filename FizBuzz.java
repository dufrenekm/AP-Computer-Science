/**
 * Created by Kyle DuFrene, Ben Kroon, and Andy Nguyen on 12/14/2017.
 */
public class FizBuzz {
    public static void main(String[] args) {
        for(int x =1; x <= 100; x++) {
            if (x % 3 == 0 && x % 5 ==0) {
                System.out.println(x + " FIZZBUZZ!!");
            } else if (x % 3 ==0) {
                System.out.println(x + " Fizz");
            } else if (x % 5 == 0) {
                System.out.println(x + " Buzz");
            } else {
                System.out.println(x);
            }
        }
    }
}
