public class EvenOdd {
    public static void main(String[] args) {
        int num = 11;

        // if(num % 2 == 0 )
        //     System.out.println(num+ " is even");
        // else
        //     System.out.println(num+ " is Odd");

        String result = num % 2 == 0 ? " is Even" : " is Odd";
        System.out.println(num + result);
    }
}
