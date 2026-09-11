class Solution {
    public String reversePrefix(String s, int k) {

        char[] arr = s.toCharArray();
        char[] result = new char[s.length()];

        int index = 0;

        for (int i = k - 1; i >= 0; i--) {
            result[index] = arr[i];
            index++;
        }

        for (int i = k; i < s.length(); i++) {
            result[index] = arr[i];
            index++;
        }

        return new String(result);
    }
}