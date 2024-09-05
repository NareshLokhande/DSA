import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base and its power to Find product : ");

        int base = sc.nextInt();
        int x = sc.nextInt();

        System.out.println("Required power is : " + power(base, x));

        sc.close();
    }

    static int power(int base, int x){
        if(x==0)  // base condition
            return 1;
        return (base * power(base, x-1));
    }
}
