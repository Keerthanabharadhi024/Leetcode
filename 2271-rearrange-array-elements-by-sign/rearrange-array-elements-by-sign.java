class Solution {
    public int[] rearrangeArray(int[] arr) {
        int pos = 0;
        int neg = 0;
        for(int nums : arr){
            if(nums>=0){
                pos++;
            }
            else{
                neg++;
            }
        }
        int[] p = new int[pos];
        int[] n = new int[neg];
        int ind1 = 0;
        int ind2 = 0;
        for(int nums : arr){
            if(nums>=0){
                p[ind1++] = nums;
            }
            else{
                n[ind2++] = nums;
            }
        }
        int in1 = 0;
        int in2 = 0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i] = p[in1];
                in1++;
            }
            else{
                arr[i]= n[in2];
                in2++;
            }
        }
        return arr;
    }
}