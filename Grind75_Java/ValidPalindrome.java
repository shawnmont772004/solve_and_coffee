public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome v = new ValidPalindrome();
        String str = "a man, a plan, a canal : panama";
        String temp = "";
        String rev = "";

        for (int i = 0; i < str.length(); i++) {
            char curr_Char = str.charAt(i);

            if (Character.isLetterOrDigit(curr_Char)) {
                temp = temp + curr_Char;
            }
        }

        System.out.println(temp);

        for (int i = temp.length() - 1; i >= 0; i--) {
            char curr_Char = temp.charAt(i);
            // System.out.println(curr_Char);
            rev = rev + curr_Char;
        }

        System.out.println(rev);

        if (rev.equals(temp)) {
            System.out.println("The given string '" + str + "' is a palindrome.");
        } else {
            System.out.println("The given string '" + str + "' is not a palindrome.");
        }

    }
}

// public static void main(String[] args) {
// StringBuilder sb = new StringBuilder("Hello");
// char ch = '!';
//
// sb.append(ch); // Append character using StringBuilder
//
// System.out.println(sb.toString()); // Output: Hello!
// }