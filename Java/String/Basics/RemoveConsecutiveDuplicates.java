public class RemoveConsecutiveDuplicates {
    public static String removeDuplicates(String S) {

        // if(S.length()==0){
        //     return S;
        // }

        // char[] result = new char[S.length()];
        // int j = 0;
        
        // result[j++] = S.charAt(0);

        // for (int i = 0; i < S.length(); i++) {
        //     // If the current character is not the same as the last added character, add it
        //     if (S.charAt(i) != result[j-1]) {
        //         result[j++] = S.charAt(i);
        //     }
        // }

        
        // // Convert the relevant portion of the character array to a string
        // return new String(result, 0, j);

        // solution 2
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            if (result.length() == 0 || S.charAt(i) != result.charAt(result.length() - 1)) {
                result.append(S.charAt(i));
            }
        }

        return result.toString();

    }


    public static void main(String[] args) {
        String S = "aabb";
        System.out.println(removeDuplicates(S));  // Output: "ab"
    }
}
