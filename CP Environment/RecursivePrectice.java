import java.util.Scanner;

public class RecursivePrectice {

    public static void blastOff(int n) {
        if (n > 0) {
            System.out.println(n);
            blastOff(n - 1);
        } else {
            System.out.println("Blastoff!");
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        if (n > 1) {
            return n * factorial(n - 1);
        }
        return n;
    }

    public static int getE(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += (1 / factorial(i));
        }
        return result;
    }

    public static int multRec(int x, int y) {
        if (y > 1) {
            return x + multRec(x, y-1);
        }
        return x;
    }

    public static double divRec(int x, int y) {
        if (y < 0) {
            System.out.println("Error");
            return -1;
        } else {
            if (y > 0) {
                return x - multRec(x, y-1);
            }
            return x;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        int x = scanner.nextInt();
        System.out.println("Input: ");
        int y = scanner.nextInt();

    }
}
