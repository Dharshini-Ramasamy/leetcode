class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int b=s.charAt(i)-97;
            int c=26-b;
            sum+=c*(i+1);
        }
        return sum;
    }
}