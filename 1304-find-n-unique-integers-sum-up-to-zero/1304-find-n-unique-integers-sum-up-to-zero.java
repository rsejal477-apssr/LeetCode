class Solution {
    public int[] sumZero(int n) {

        int[] ans = new int[n];
        int index =0;

        if(n%2 == 1){
            ans[index++] =0;
        }
        for(int i =1; index< n; i++){
            ans[index++] = i;
            ans[index++] = -i;
        }
        return ans;
    }
}