
public class LinkedListImplementationOfStack {

    //User defined data type
    public static class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }

    //user defined data structure
    public static class LLStack{
        Node head = null;
        private int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }

        int peek(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }

        //USing recursion with helper function
        void displayRec(Node h){
            if(h == null){
                return ;
            }
            displayRec(h.next);
            System.out.print(h.val + " ");
        }

        void display(){
            displayRec(head);
            System.out.println();
        }

        //This display() is for reverse of stack
        void displayReverseStack(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + "  ");
                temp = temp.next;
            }
            System.out.println();
        }
        //since, we are making int size as private
        // So, we are accessing it through a getter
        int size(){
            return size;
        }


        boolean isEmpty(){
            if(size == 0){
                return true;
            }
            else {
                return false;
            }
        }

    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        System.out.println(st.isEmpty()); //true
        st.push(1);
        st.display();       // [1]
        st.push(2);
        st.display();       // [1,2]
        st.push(3);
        st.display();       // [1,2,3]
        st.push(4);
        st.display();       // [1,2,3,4]
        st.push(5);
        st.display();       // [1,2,3,4,5]
        System.out.println(st.size());    // 5



        System.out.println(st.isEmpty());
        st.push(1);
        st.displayReverseStack();       // [1]
        st.push(2);
        st.displayReverseStack();       // [2,1]
        st.push(3);
        st.displayReverseStack();       // [3,2,1]
        st.push(4);
        st.displayReverseStack();       // [4,3,2,1]
        st.push(5);
        st.displayReverseStack();       // [5,4,3,2,1]
        System.out.println(st.size());    // 5
    }
}
