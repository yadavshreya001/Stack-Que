import java.util.Stack;
public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st); // [1,2,3,4]
        Stack<Integer> tempStack = new Stack<>();
        while(st.size() > 0){
            tempStack.push(st.pop());
        }
        System.out.println(tempStack); //[4,3,2,1]
        st.push(13);
        System.out.println(st); // [13]
        while(tempStack.size() > 0){
            st.push(tempStack.pop());
        }
        System.out.println(st); // [13,1,2,3,4]
        System.out.println(tempStack); // []
    }
}




