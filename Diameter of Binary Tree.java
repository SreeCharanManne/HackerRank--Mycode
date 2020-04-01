class Tree
{ int max= Integer.MIN_VALUE;
/* Complete the function to get diameter of a binary tree */
int diameter(Node node)
{
findMax(node);
return max;

}

int findMax(Node node){
if(node==null)
return 0;
else{
int left = findMax(node.left);
int right = findMax(node.right);
if(max<left+right+1) max=left+right+1; 
return left>right?left+1:right+1;
}
}
}
