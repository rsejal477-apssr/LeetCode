class Solution {
    public int largestAltitude(int[] gain) {
        int current = 0;
        int highest = 0;

    for(int i =0; i< gain.length; i++){
        current = current + gain[i];
        highest = Math.max(highest,current);
    }
        return highest;
    }
}