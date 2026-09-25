class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);

        int sumA = 0;
        int sumB = 0;

        for (int x : aliceSizes) {
            sumA += x;
        }

        for (int x : bobSizes) {
            sumB += x;
        }

        int diff = (sumA - sumB) / 2;

        int i = 0;
        int j = 0;

        while (i < aliceSizes.length && j < bobSizes.length) {

            if (aliceSizes[i] - bobSizes[j] == diff) {
                return new int[]{aliceSizes[i], bobSizes[j]};
            }

            if (aliceSizes[i] - bobSizes[j] < diff) {
                i++;
            } else {
                j++;
            }
        }

        return new int[0];
    }
}