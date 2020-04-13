class MinStack {
    
    Stack<int[]> stack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<int[]>();
        
    }
    
    // method to push a new element along with the min value till that point
    public void push(int x) {
        // if the stack is empty push the element to stack, min=element itself
		if (stack.empty()) {
			stack.push(new int[] { x, x });
			return;
		}

		// compare the top min element with the new element, if new element is
		// smaller
		// then add the new min as the current element
		int currentMin = stack.peek()[1];
		stack.push(new int[] { x, Math.min(currentMin, x) });
        
        
    }
    
    public void pop() {
        stack.pop();
        
    }
    
    public int top() {
        return stack.peek()[0];
        
    }
    
    public int getMin() {
        return stack.peek()[1];
        
    }
    
    public boolean isEmpty() {
        return stack.empty();
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
