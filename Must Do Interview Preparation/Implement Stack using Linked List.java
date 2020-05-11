class MyStack {

    StackNode top;
    
    // function to push element
    void push(int a) {
        
        // base case, when stack is empty
        if (top == null) {
            top = new StackNode(a);
        } 
        
        // make a new node at top and assign it as top
        else 
        {
            StackNode temp = new StackNode(a);
            temp.next = top;
            top = temp;
        }
    }
    
    // function to pop elements
    int pop() {
        StackNode temp = top;
        
        // base case, when stack is empty
        if (temp == null) {
            return -1;
        } 
        else
        
        // delete the element(node) at top
        {
            temp = temp.next;
            int r = top.data;
            top = temp;
            return r;
        }
    }
}
