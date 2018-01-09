// Andy Nguyen, Kyle DuFrene, Ben Kroon
public class P {
    public static void main(String[] args) {

        System.out.println("  x^1  x^2  x^3  x^4  x^5");

        for (int x = 1; x < 7; x++) {
            for (int p = 1; p < 6; p++) {
                System.out.format("%5d", (int) Math.pow(x, p));
            }
            System.out.println();
        }
    }
}
