class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
    

        for (int i =0; i<arr.length;i++){
            int left = 0;
            int right = arr.length- 1;

            while (left<=right){
                int mid = left + (right-left)/2;
                

                if(arr[mid] == arr[i]*2 && mid != i ){
                    return true;
                
                }
                if (arr[mid]< arr[i]*2){
                    left = mid +1;
                }
                else {
                    right = mid-1;
                }
            }

        }
        return false;
        
    }
}