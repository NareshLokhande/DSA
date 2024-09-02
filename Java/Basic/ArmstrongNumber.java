public class ArmstrongNumber {
    public static void main(String[] args){
        int num = 407, len;

        len = order(num);

        if (armstrong(num, len)) {
            System.out.println(num + " is armstrong");
        }
        else
            System.out.println(num + " is Not armstrong");

    }
    static int order(int x){
        int len = 0;
        while(x != 0){
            len ++;
            x = x / 10;
        }
        return len;
    }
    static boolean armstrong(int num , int len){
        int sum = 0, temp, rem;
        temp = num;

        while (temp != 0){
            rem = temp % 10;
            sum = sum + (int)Math.pow(rem, len);
            temp /= 10;
        };
        return (sum == num);
    }
}
