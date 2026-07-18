class Solution {
    public int gcd(int min,int max){
        while(max!=0){
            int rem=min%max;
            min=max;
            max=rem;
        }
        return min;
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        int result=gcd(min,max);
        return result;

    }
}