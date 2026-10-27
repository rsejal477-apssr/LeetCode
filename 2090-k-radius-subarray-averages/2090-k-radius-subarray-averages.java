
class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            ans[i]=-1;
        }

        int size = 2 * k + 1;

        if (size > n) return ans;

        long sum = 0;

        for (int i = 0; i < size; i++) {
            sum += nums[i];
        }

        ans[k] = (int)(sum / size);

        for (int i = size; i < n; i++) {
            sum = sum + nums[i] - nums[i - size];
            ans[i - k] = (int)(sum / size);
        }

        return ans;
    }
}
