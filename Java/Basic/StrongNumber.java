import java.util.Scanner;

public class StrongNumber {

    static boolean FoundStrong(int num) {
        int digit, sum = 0;

        int temp = num;

        boolean flag = false;
        while (temp != 0) {
            digit = temp % 10;
            sum = sum + fact(digit);

            temp = temp / 10;
        }

        if(sum == num)
            flag = true;
        else
            flag = false;

        return flag;
    }

    static int fact(int digit){
        int fact = 1;

        for(int i=2; i<= digit; i++){
            fact = fact *i ;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to find the Strong Number : ");
        int n = sc.nextInt();

        if (FoundStrong(n))
            System.out.println(n + " is A STRONG Number");
        else
            System.out.println(n + " is NOT A STRONG Number");
           sc.close();
    }
}