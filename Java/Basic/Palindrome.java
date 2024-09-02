public class Palindrome {
    public static void main(String[] args) {
        int num = 12321;
        int reversednum = 0, rem, temp;

        temp = num;

        while (temp != 0) {
            rem = temp % 10 ;
            reversednum = reversednum * 10 + rem ;
            temp /= 10 ;
        }

        if(num == reversednum){
            System.out.println(num + " is a palindrome");
        }
        else
        System.out.println(num+ " is Not Palindrome.");

    }
}
