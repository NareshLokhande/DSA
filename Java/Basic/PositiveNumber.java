class PositiveNumber{
    public static void main(String[] args) {
        int num=-5;

        if(num==0)
            System.out.println("Zero");
        else {
            String result = num > 0 ? "Positive" : "Negative";
            System.out.println(result);
        }
    }
}
