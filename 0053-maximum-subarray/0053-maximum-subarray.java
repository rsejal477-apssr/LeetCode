class Solution {
    public int maxSubArray(int[] nums) {

        int CurrentSum = nums[0];
        int MaxSum = nums[0];

        for(int i =1; i< nums.length;i++){
            CurrentSum = Math.max(nums[i],CurrentSum+ nums[i]);
            MaxSum = Math.max(MaxSum,CurrentSum);
        }

        return MaxSum;
    }
}