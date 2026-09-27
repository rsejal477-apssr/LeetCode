class Solution {
    public int mySqrt(int x) {

        if(x<2){
            return x;
        }
        int left = 1;
        int right = x/2;
        


        while (left<=right){
            int mid =left + (right - left)/2;
            long s=(long) mid * mid;
            if (x==s){
                return  mid;
            }
            if(x< s){
                right = mid-1;
            }
            else {
        
                left = mid +1;
            }

        }

        return right;
        
    }
}