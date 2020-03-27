class Level_order_traversal
{
    //You are required to complete this method
    static void levelOrder(Node node) 
    {
        // Your code here
        Node curr=node;
        Queue<Node>q=new LinkedList<Node>();
        q.add(node);
        while(!q.isEmpty()){

         curr=q.poll();
         
         System.out.print(curr.data+" ");
         if(curr.left!=null)
         q.add(curr.left);
         if(curr.right!=null)
         q.add(curr.right);

}
        
    }
}
