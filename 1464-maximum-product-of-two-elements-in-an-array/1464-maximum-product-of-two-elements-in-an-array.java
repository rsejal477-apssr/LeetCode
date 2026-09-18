class Solution {
    public int maxProduct(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        int a = (nums[n-1]-1)* (nums[n-2]-1);
        // if there exist a negative value we will use b
        //int b = (nums[0]-1)* (nums[1]-1);


        //return Math.max (a,b);
        return a;
    }
}