package Zohocodinground.strings.easyproblems;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {

        System.out.println(checkBalancedParenthesis2("{}[()]"));

    }

    public static boolean checkBalancedParenthesis(String brackets) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < brackets.length(); i++) {
            char ch = brackets.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.empty()) return false;

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return st.empty();
    }

    public static boolean checkBalancedParenthesis2(String brackets) {
       Stack<Character> stack = new Stack<>();

        for (int i = 0; i < brackets.length(); i++) {
            char chr = brackets.charAt(i);
            if (chr == '(' || chr == '{' || chr == '[') {
                stack.push(chr);
            } else {
                if (stack.empty())  {
                    return false;
                }

                char top = stack.pop();

                if ((chr == ')' && top != '(') ||
                        (chr == '}' && top != '{') ||
                        (chr == ']' && top != '[')) {
                    return false;
                }
             }
        }

        return stack.empty();
    }
}
