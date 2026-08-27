class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int left=0;
        int odd=0;
        int even=0;
        int count=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]%2!=0){
                odd++;
                even=0;
            }
            while(odd==k){
                if(nums[left]%2!=0){
                    odd--;
                }
                left++;
                even++;
            }
            count+=even;
        }
        return count;
    }
}