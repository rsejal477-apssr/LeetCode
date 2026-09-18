class Solution {
    public int[] getConcatenation(int[] nums) {
        int a = nums.length;
        int[] ans = new int[a*2];
        for(int i =0; i<nums.length;i++){
            ans[i] = nums[i];
            ans[a+i] = nums[i];
        }
        return ans;
        
    }
}