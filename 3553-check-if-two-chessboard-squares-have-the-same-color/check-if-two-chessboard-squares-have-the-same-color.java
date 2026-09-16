class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {

        String[] arr1 = coordinate1.split("");
        String[] arr2 = coordinate2.split("");

        int n = Integer.parseInt(arr1[1]) % 2;
        int m = Integer.parseInt(arr2[1]) % 2;

        boolean first = arr1[0].equals("a") ||
                        arr1[0].equals("c") ||
                        arr1[0].equals("e") ||
                        arr1[0].equals("g");

        boolean second = arr2[0].equals("a") ||
                         arr2[0].equals("c") ||
                         arr2[0].equals("e") ||
                         arr2[0].equals("g");

        if (first && second) {
            return n == m;
        }

        if (!first && !second) {
            return n == m;
        }

        if (first && !second) {
            return n != m;
        }

        return n != m;
    }
}