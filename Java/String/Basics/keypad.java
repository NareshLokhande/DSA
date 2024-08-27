//Convert a sentence into its equivalent mobile numeric keypad sequence

// Java implementation to convert a sentence into its equivalent
// mobile numeric keypad sequence

public class keypad {

    private static String printSequence(String[] arr, String input) {

        String output = "";

        int n = input.length();
        for (int i = 0; i < n; i++) {
            // If the character is a space, add '0'
            if (input.charAt(i) == ' ') {
                output = output + "0";
            } else {
                // For uppercase letters
                if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                    int position = input.charAt(i) - 'A';
                    output = output + arr[position];
                }
                // For lowercase letters (handling conversion to uppercase)
                else if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                    int position = input.charAt(i) - 'a';
                    output = output + arr[position];
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String str[] = {"2", "22", "222", "3", "33", "333",
                        "4", "44", "444", "5", "55", "555",
                        "6", "66", "666", "7", "77", "777",
                        "8", "88", "888", "9", "99", "999"};

        String input = "MIHIr";

        System.out.println(printSequence(str, input));
    }
}
