class Solution {
    public int specialArray(int[] nums) {
        
        for (int x =0; x<=nums.length;x++){
            int count = 0;


            for(int i =0; i< nums.length;i++){
                if(nums[i]>=x){
                    count++;
                }
            }
            if (count==x){
                return x;
            }
        }
        return -1;
        
    }
}