import java.util.Scanner;

public class AutomorphicNum {
    // the square of the number ends with the same number or not

    static int isAutomorphic(int n) {
        int square = n * n;
        while (n != 0) {
            if (n % 10 != square % 10) {
                return 0;
            }

            n /= 10;
            square /= 10;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to Check if Automorphic : ");
        int num = sc.nextInt();
        int square = num * num;

        if (isAutomorphic(num) == 1) {
            System.out.println("Num : " + num + " , Square: " + square + " - is Automorphic");
        } else
            System.out.println("Num : " + num + " , Square: " + square + " - is Not Automorphic");
        sc.close();
    }
}
