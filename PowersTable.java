/**
 * Created by Andy Nguyen, Kyle DuFrene, Ben Kroon on 12/11/2017.
 */
public class PowersTable {
    public static void main(String[] args) {

        System.out.println("       x^1       x^2       x^3       x^4       x^5");

        for (int x = 1; x < 7; x++) {

            //System.out.print("%8d", x^1);
            System.out.format("%10d%10d%10d%10d%10d",
                    (int) Math.pow(x, 1),
                    (int) Math.pow(x, 2),
                    (int) Math.pow(x, 3),
                    (int) Math.pow(x, 4),
                    (int) Math.pow(x, 5));
            System.out.println();

        }

    }

}
