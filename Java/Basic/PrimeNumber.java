public class PrimeNumber {
// Prime number has only 2 factors 1 and itself
// Time Complexity = O(n)
// Space Complexity = O(1)

    private static void checkPrime(int n){
        int count=0;
        
        if(n < 0){
            System.out.println("Not Prime");
            System.exit(0);
        }

        for(int i=1; i<=n; i++){
            if(n % i == 0)
            count +=1;
        }

        if(count >2)
        System.out.println("Not Prime");
        else
        System.out.println("Prime");
    }

    public static void main(String[] args){
        int n = 23;
        // Method 1
        // checkPrime(n);

        // Method 2
        boolean isprime = true;

        if (n<2) {
            isprime = false;
        }
        else{
            for(int i=2; i<n; i++){
                if (n%i == 0) {
                    isprime = false;
                    break;
                }
            }
        }

        String result = isprime ? "Prime" : "Not Prime";
        System.out.println("The number " + n + " is : " + result);

    }
}
