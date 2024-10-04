
public class ArrayImplementationOfStack {
    public static class Stack{
        int[] arr = new int[5];
        int idx = 0; // array iterator

        void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int pop(){
            if(idx == 0){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }

        int peek(){
            if(idx == 0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx-1];
        }

        void display(){
            for(int i = 0; i <= idx - 1; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }

        boolean isFull(){
            if(idx == arr.length){
                return true;
            }
            else{
                return false;
            }
        }

        boolean isEmpty(){
            if(idx == 0){
                return true;
            }
            else{
                return false;
            }
        }

        int capacity(){
            return arr.length;
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.isEmpty());
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
        st.push(7);     // stak is full
        System.out.println(st.capacity()); // 5
    }
}





