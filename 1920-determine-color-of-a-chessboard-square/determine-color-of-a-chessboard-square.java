class Solution {
    public boolean squareIsWhite(String coordinates) {
        char[] arr=coordinates.toCharArray();
        char[] arr2={'a','c','e','g'};
        char[] arr3={'b','d','f','h'};
        for(int i=0;i<arr2.length;i++){
            if(arr[0]==arr2[i]&&arr[1]%2!=0){
                return false;
            }
            if(arr[0]==arr3[i]&&arr[1]%2==0){
                return false;
            }
        }
        return true;
    }
}