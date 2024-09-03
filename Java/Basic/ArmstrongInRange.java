import java.util.Scanner;

public class ArmstrongInRange {
    
    private static int getOrder(int num){
        int len = 0;

        while (num != 0) {
            len++;
            num /= 10;
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This program finds armstrong Numbers in a Range ");
        System.out.print("Enter the Lower And Upper Ranges : ");
        int Lower = sc.nextInt();
        int Upper = sc.nextInt();

        sc.close();
        
        System.out.println("Armstrong Numbers between " + Lower + " and " + Upper + " are : " );

        for(int num = Lower; num <= Upper; num++){
            int sum = 0, temp, digit, len;

            len = getOrder(num);

            temp = num;

            while (temp != 0) {
                digit = temp % 10;
                sum = sum + (int) Math.pow(digit, len);
                temp /= 10;
            };

            if(sum == num)
            System.out.print(num + " ");
        }
    }
}
