public class SumInRange {
    static int getsum(int sum, int a, int b){
        if(a>b) return sum;

        return a+ getsum(sum, a+1, b);
    }
    public static void main(String[] args) {
        int start = 5;
        int end = 10;

        int sum = getsum(0, start, end);
        System.out.println(sum);
    }

    public static void main1(String[] args){
        int start=5; 
        int end=10;
        int sum=0;

        for(int i=start; i<=end; i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}
