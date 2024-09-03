import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    static BigInteger fact(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }

        return BigInteger.valueOf(n).multiply(fact(n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find Factorial : ");
        int n = sc.nextInt();

        System.out.println("Factorial of " + n + " is : " + fact(n));

        sc.close();
    }
}
