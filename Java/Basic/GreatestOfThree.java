public class GreatestOfThree {
    public static void main(String[] args) {
        int a = 10;
        int b = 105;
        int c = 1000;

        int temp, result;
        temp = a>b ? a :b;

        result = temp>c ? temp : c;

        System.out.println(result + " is the greatest");
    }
}
