public class SumOfDigit {
    public static void main(String[] args) {
        int num = 12345;
        
        // Method 1
        //int sum = 0;

        // while (num != 0) {
        //     sum += num % 10;
        //     num /= 10;
        // }

        // System.out.println("Sum of digit : " + sum);

        //Method 2  : Recursion

        System.out.println("Sum of Digits : "+getsum(num));
    }

    static int getsum(int num){
        if(num == 0)
        return 0;

        return (num % 10) + getsum(num/10);
    }
}
