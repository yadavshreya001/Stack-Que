import java.util.Scanner;
import java.util.Stack;

public class CopyStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<Integer>();
        System.out.println("Enter the no. of elements you want to enter: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the stack: ");
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st); // [1,2,3,4,5]

        Stack<Integer> stack1 = new Stack<>();
        while(st.size() > 0){
            stack1.push(st.pop());

//            int x = st.peek();
//            stack1.push(x);
//            st.pop();
        }
        System.out.println(stack1); // [5,4,3,2,1]

        Stack<Integer> stack2 = new Stack<>();
        while(stack1.size() > 0){
            stack2.push(stack1.pop());

//            int x = stack1.peek();
//            stack2.push(x);
//            stack1.pop();
        }
        System.out.println(stack2); // [1,2,3,4,5]
    }
}
