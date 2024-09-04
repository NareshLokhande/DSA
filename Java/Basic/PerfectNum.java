import java.util.Scanner;

public class PerfectNum {
    // Number that can be represented as the sum of factors excluding itself
    // 6 = 1*2*3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to find the Perfect number : ");
        int n = sc.nextInt();
        sc.close();
        
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == n) {
            System.out.println(n + " is A PERFECT Number");
        } else
            System.out.println(n + " is NOT A PERFECT Number");
    }
}