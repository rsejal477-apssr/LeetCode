class Solution {
    public int[] twoSum(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {

            int left = i+1;
            int right= numbers.length-1;

            while (left<= right) {
                int mid =left+(right-left) / 2;

                if (numbers[i]+numbers[mid]== target)
                    return new int[]{i+1,mid+1};

                else if (numbers[i]+numbers[mid] < target)
                    left= mid+ 1;

                else
                    right= mid-1;
            }
        }

        return new int[]{-1,-1};
    }
}