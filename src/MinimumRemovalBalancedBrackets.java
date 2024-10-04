import java.util.Scanner;
import java.util.Stack;

public class MinimumRemovalBalancedBrackets {
    public static int minRemovalIsToMakeBalanced(String s) {
        // Stack to keep track of unmatched opening brackets
        Stack<Character> stack = new Stack<Character>();
        int remove = 0;
        // Iterate through each character in the string using a for loop
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                // Push opening bracket to the stack
                stack.push(ch);
            } else if (ch == ')') {
                // If stack is not empty and top is '(', pop it (balanced pair)
                if (stack.size() != 0 && stack.peek() == '(') {
                    stack.pop();
                } else {
                    // Unmatched closing bracket
                    remove++;
                }
            }
        }
        // Add the number of unmatched opening brackets left in the stack
        remove += stack.size();
        return remove;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int result = minRemovalIsToMakeBalanced(str);
        System.out.println("Minimum removals to make the sequence balanced: " + result);
    }
}


