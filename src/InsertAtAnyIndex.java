import java.util.Stack;
public class InsertAtAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st); // [1,2,3,4]
        int idx = 2;
        int x = 20;
        Stack<Integer> tempStack = new Stack<>();
        while(st.size() > idx){
            tempStack.push(st.pop());
        }
        System.out.println(tempStack); //[4,3]
        st.push(x);
        System.out.println(st); // [1,2,20]
        while(tempStack.size() > 0){
            st.push(tempStack.pop());
        }
        System.out.println(st); // [1,2,20,3,4]
        System.out.println(tempStack); // []
    }
}



