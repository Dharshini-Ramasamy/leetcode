class Solution {
    public String addStrings(String num1, String num2) {

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        char[] result = new char[Math.max(num1.length(), num2.length()) + 1];
        int k = result.length - 1;

        while (i >= 0 || j >= 0 || carry != 0) {

            int dig1 = 0;
            int dig2 = 0;

            if (i >= 0) {
                dig1 = num1.charAt(i) - '0';
            }

            if (j >= 0) {
                dig2 = num2.charAt(j) - '0';
            }

            int sum = dig1 + dig2 + carry;

            result[k] = (char)('0' + (sum % 10));

            carry = sum / 10;

            i--;
            j--;
            k--;
        }

        return new String(result, k + 1, result.length - k - 1);
    }
}