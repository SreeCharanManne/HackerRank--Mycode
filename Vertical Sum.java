class Tree{
    public ArrayList <Integer> verticalSum(Node root) {
   
    TreeMap<Integer,Integer> hm1 = new TreeMap<Integer,Integer>();
    vSum(root,0,hm1);
    ArrayList <Integer>n=new ArrayList<>();
        
    for(Map.Entry x1:hm1.entrySet())
    {
        n.add((int)x1.getValue());
    }
    return n;

}

    public void vSum(Node root,int hd,TreeMap<Integer,Integer> hm)
     {
        if(root==null)return;
        vSum(root.left,hd-1,hm);
        int sum=(hm.get(hd)==null)?0:hm.get(hd);
        hm.put(hd,(sum+root.data));
        vSum(root.right,hd+1,hm);
    }
}
