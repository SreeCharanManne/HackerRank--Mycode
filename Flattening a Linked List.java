Node flatten(Node root)
{
Node temp=root;
ArrayList <Integer> a= new ArrayList <> ();
while(temp!=null){
Node b=temp;
while(b!=null){
a.add(b.data);
b=b.bottom;
}
temp=temp.next;
}
Collections.sort(a);
root=null;
Collections.reverse(a);
int i=0;
while(a.size()>i){
Node some=new Node(a.get(i++));
some.bottom=root;
root=some;
}
return root;
}
