import java.util.Stack;

public class ReverseStackRecursively {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        // Push elements into the stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Original Stack: " + st);
        // Reversing the stack
        reverseStack(st);
        System.out.println("Reversed Stack: " + st);
    }

    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack, temp);
        }
    }

    // Function to insert an element at the bottom of the stack
    private static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            int temp = stack.pop();
            insertAtBottom(stack, item);
            stack.push(temp);
        }
    }
}

