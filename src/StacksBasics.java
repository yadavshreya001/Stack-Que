import java.util.Stack;

public class StacksBasics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        System.out.println(st.isEmpty()); //true
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);  // [1,2,3,4]
        System.out.println(st.size()); // 4
        st.pop(); // 4
        st.pop(); // 3
        System.out.println(st); // [1,2]
        System.out.println(st.size()); // 2
        st.push(5);
        System.out.println(st); // [1,2,5]
        System.out.println(st.peek()); // 5
        System.out.println(st.size()); // 3
        System.out.println(st.isEmpty()); // false

    }
}
