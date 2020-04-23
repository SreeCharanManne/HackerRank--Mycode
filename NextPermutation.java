class Solution {
    public void nextPermutation(int[] array){
    if(array.length==1)return ;
    int i=array.length-1;
    while (i > 0 && array[i - 1] >= array[i])
        i--;
       
    if(i<=0){Arrays.sort(array);return;}
    int j = array.length - 1;
    while (array[j] <= array[i - 1])
        j--;

    int temp = array[i - 1];
    array[i - 1] = array[j];
    array[j] = temp;

    j = array.length - 1;
    while (i < j) {
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
    }
    
    }
}
