class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ListNode t=head;
        ArrayList<Integer>a=new ArrayList<>();
        while(t!=null){
            a.add(t.val);
            t=t.next;   
        }
        int ans[]=new int[a.size()];
        Stack<Integer>s=new Stack<>();
        s.push(0);
        for(int i=1;i<a.size();i++){
            int k=a.get(i);
            if(s.isEmpty()||k<=a.get(s.peek()))s.push(i);
            else
            {   while(!s.isEmpty()&&a.get(s.peek())<k){
                ans[s.pop()]=k;
            }
            s.push(i);
            }
             
 
        }return ans;
    }
}
