import java.util.Arrays;

public class PrintDuplicate {

    public static void print(String str){
        int len = str.length();

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedString = new String(chars);

        //loop through sorted string
        for(int i = 0; i < len; i++){
            int count = 1;

            while(i < len-1 && sortedString.charAt(i) == sortedString.charAt(i+1)){
                count++;
                i++;
            }

            if(count >1){
                System.out.println(sortedString.charAt(i) + ", count = " + count);
            }
        }
    }

    public static void main(String[] args) {
        String str = "Naaresh Lokhande";
        print(str);
    }
}
