class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int product=1;
        product=(nums[n-2]-1)*(nums[n-1]-1);
        return product;
        
        // for(int i=0;i<nums.length;i++){
        //     product*=(nums[nums[n-1]])-1*nums[nums-2]-1]);
        // }
    }
    // return product;
}