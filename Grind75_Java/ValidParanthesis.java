import java.util.Stack;
import java.util.HashMap;

public class ValidParanthesis {
    HashMap<Character, Character> map = new HashMap<>();

    Stack<Character> stk = new Stack<>();

    public boolean vp_funcn(String s) {
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        for (int i = 0; i < s.length(); i++) {
            char curr_Char = s.charAt(i);
            if (curr_Char == ')' || curr_Char == ']' || curr_Char == '}') {
                if (stk.isEmpty()) {
                    return false;
                }
                if (stk.pop() != map.get(curr_Char)) {
                    return false;
                }
            } else {
                stk.push(curr_Char);
            }

        }
        if (stk.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "{{}}";

        ValidParanthesis v = new ValidParanthesis();
        boolean result = v.vp_funcn(s);

        if (result == true) {
            System.out.println("Paranthesis is valid");
        } else {
            System.out.println("Paranthesis is not  valid");
        }
    }
}

// for (int i = 0; i < s.length(); i++) {
// char currentChar = s.charAt(i);
// if (map.containsKey(currentChar)) {
// if (stack.isEmpty() || stack.pop() != map.get(currentChar)) {
// return false;
// }
// } else {
// stack.push(currentChar);
// }
// }
// return stack.isEmpty();