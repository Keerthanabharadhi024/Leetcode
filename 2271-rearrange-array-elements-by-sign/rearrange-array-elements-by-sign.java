class Solution {
    public int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int[] nums = new int[n];
        int pos = 0;
        int neg = 1;
        for(int num : arr){
            if(num>=0){
                nums[pos] = num;
                pos+=2;
            }
            else{
                nums[neg] = num;
                neg+=2;
            }
        }
        return nums;
    }
}