public class SumOfNaturalNumbers{
    static int getsum(int n){
        if(n==0)
            return n;
        return n + getsum(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        int sum = getsum(n);

        System.out.println("Sum of "+n+ " Natural numbers using recursion is "+sum);
    }
    public static void main1(String[] args){
        int num  = 5;
        int sum=0;

        for(int i=1; i<=num; i++){
            sum +=i;
        }
        System.out.println("Sum of first "+num+" natural numbers is: "+sum);
    }
}