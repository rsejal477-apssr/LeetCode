class Solution {


         int search(int[] nums, int target) {
            int start =0;
            int end = nums.length-1;

            while(start<=end){
                int mid = start + (end-start)/2;

                //target found
                if(nums[mid]==target){
                    return mid;
                }
                //left part is sorted
                if(nums[start]<=nums[mid]){

                    //target lies in the start sorted half
                    if(nums[start]<= target && target < nums[mid]){
                        end=mid-1;

                    }
                    else {
                        start = mid+1;
                    }
                }
                //right half is sorted
                else{
                    //target lies in the right sorted half
                    if(nums[mid]<target && target <= nums[end]){
                        start=mid+1;
                    }
                    else{
                        end=mid-1;
                    }

                }
            }
            return -1;
         }
}
         

       
       
          
