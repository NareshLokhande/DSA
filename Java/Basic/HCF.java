import java.util.Scanner;

public class HCF {
    // the number which is the largest common factor of both numbers

    static int getHCF(int a, int b) {
        return b == 0 ? a : getHCF(a, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two numbers to find their GCD : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int HCF = getHCF(num1, num2);

        // Method 1
        // for (int i = 1; i <= num1 || i <= num2; i++) {
        // if (num1 % i == 0 && num2 % i == 0) {
        // HCF = i;
        // }
        // }
        System.out.println("The HCF is : " + HCF);

        sc.close();
    }
}
