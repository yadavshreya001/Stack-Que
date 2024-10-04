import java.util.Stack;

public class DisplayStackRecursively {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        // Push elements into the stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        // Display the stack recursively
        displayStack(st);
    }

    public static void displayStack(Stack<Integer> stack) {
    // Base case: if the stack is empty, return
        if (stack.size() == 0) {
            return;
        }
        // Get the top element
        int top = stack.pop();
        // Display the stack recursively
        displayStack(stack);
        // Print the top element
        System.out.print(top + " ");
        // Push the top element back to the stack
        stack.push(top);
    }
}



