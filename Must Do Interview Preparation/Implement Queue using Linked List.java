/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
    
    // This function should add an item at
    // rear
     public MyQueue() 
    { 
        this.front = this.rear = null; 
    } 
  
	void push(int a)
	{
        QueueNode temp = new QueueNode(a); 
  
        if (this.rear == null) { 
            this.front = this.rear = temp; 
            return; 
        } 
 
        this.rear.next = temp; 
        this.rear = temp; 
        
	}

    // the removed item.
	int pop()
	{
        // Your code here
        if (this.front == null) 
            return -1; 
  
        // Store previous front and move front one node ahead 
        QueueNode temp = this.front; 
        this.front = this.front.next; 
  
        // If front becomes NULL, then change rear also as NULL 
        if (this.front == null) 
            this.rear = null;
        return temp.data;
	}
}




