public class ReverseNumber {
    public static void main(String[] args) {
        int num = 123, reversedNum = 0, rem;

        while (num != 0) {
            rem = num % 10;
            reversedNum = reversedNum * 10 + rem;
            num = num / 10;
        }   

        System.out.println("Reversed Number : "+ reversedNum);
    }
}
