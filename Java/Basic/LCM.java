import java.util.Scanner;

//LCM is a Least Common Multiple, means LCM of two numbers is the number which is the smallest common multiple of both numbers

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 Numbers You want LCM Of : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int LCM = 0;
        sc.close();

        // Method 1 Loop
        // int max = (num1 > num2) ? num1 : num2;

        // for (int i = max; i <= num1 * num2; i++) {
        //     if (i % num1 == 0 && i % num2 == 0) {
        //         LCM = i;
        //         break;
        //     }
        // }

        // Method 2 Using GCD
        LCM = getLCM(num1, num2);

        System.out.println("The LCM : " + LCM);
    }

    static int getLCM(int a, int b) {
        return (a * b) / getHCF(a, b);  // formula
    }

    static int getHCF(int a, int b) {
        return (b == 0) ? a : getHCF(b, a % b);
    }
}
