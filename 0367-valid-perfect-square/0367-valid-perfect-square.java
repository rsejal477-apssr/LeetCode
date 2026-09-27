class Solution {
    public boolean isPerfectSquare(int num) {
        if (num ==1){
            return true;
        }

        int left = 1;
        int right = num/2;

        while (left<=right){
            int mid = left + (right - left)/2;
            long s = (long) mid*mid;

            if (num == s){
                return true;
            }
            if (num< s){
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return false;
        
    }
}