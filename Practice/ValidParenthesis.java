import java.util.Stack;

class ValidParenthesis {
    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.empty() || (c == ')' && stack.peek() != '(') ||
                        (c == ']' && stack.peek() != '[') ||
                        (c == '}' && stack.peek() != '{')) {
                    return false;
                }
                stack.pop(); 
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String str = "()[]{}}";

        if (isValid(str)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }
    }
}
