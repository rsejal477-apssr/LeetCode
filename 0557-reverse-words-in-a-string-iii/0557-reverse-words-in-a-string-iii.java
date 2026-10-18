
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            for (int j = word.length() - 1; j >= 0; j--) {
                result += word.charAt(j);
            }

            if (i < words.length - 1) {
                result += " ";
            }
        }

        return result;
    }
}
