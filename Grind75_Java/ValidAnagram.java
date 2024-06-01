import java.util.HashMap;

public class ValidAnagram {

    public boolean validanag(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        System.out.println(map1);
        System.out.println(map2);

        return map1.equals(map2);

    }

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        String str1 = "Shawn";
        String str2 = "nashw";
        boolean status = va.validanag(str1, str2);
        if (status == true) {
            System.out.println("The given 2 strings are  an anagram ");
        } else {
            System.out.println("The given 2 strings are not an anagram ");
        }

    }
}
