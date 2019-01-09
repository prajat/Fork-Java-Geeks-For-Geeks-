import java.util.*;


class stackoperations {
    // Function to insert element to stack
    public static void insert(Stack<Integer> st, int x) {
        // Your code here

        st.push(x);
    
        

    }

    // Function to pop element from stack
    public static void remove(Stack<Integer> st)
    {
        int x = st.pop();// Your code here
        
    }

    // Function to return top of stack
    public static void headOf_Stack(Stack<Integer> st) {
        int x = st.peek();// Your code here
                System.out.println(x + " ");
    }

    // Function to find the element in stack
    public static void find(Stack<Integer> st, int val)
    {
    
        if(st.contains(val)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}