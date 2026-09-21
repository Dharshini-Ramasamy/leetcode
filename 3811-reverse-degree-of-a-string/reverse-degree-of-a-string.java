class Solution {
    public int reverseDegree(String s) {
        int[] arr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
        int sum=0;
        for(int i=0;i<s.length();i++){
            int b=s.charAt(i)-97;
            int c=26-b;
            sum+=c*(i+1);
        }
        return sum;
    }
}