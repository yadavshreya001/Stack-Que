import java.util.Scanner;
import java.util.Stack;

public class ValidBracketSequence {
    public static boolean isBalanced(String s) {
        // Create a stack to keep track of opening brackets
        Stack<Character> stack = new Stack<Character>();
        // Traverse each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // If the character is an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If the character is a closing bracket
            else if (ch == ')' || ch == '}' || ch == ']') {
            /* Check if the stack is empty or the top of the stack is
            not the  corresponding opening bracket            */
                if (stack.size() == 0) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        // If the stack is empty, all brackets were matched correctly
        if (stack.size() > 0) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
