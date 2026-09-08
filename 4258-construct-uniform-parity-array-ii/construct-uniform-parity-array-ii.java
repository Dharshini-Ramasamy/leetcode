class Solution {
    public boolean uniformArray(int[] nums1) {
      int min=nums1[0];
      for(int i=1;i<nums1.length;i++){
        if(nums1[i]<min){
            min=nums1[i];
        }
      }
      int parity=min%2;
      for(int j=0;j<nums1.length;j++){
        if(nums1[j]%2==parity){
            continue;
        }
        int n=nums1[j]-min;
        if(n<1||n%2!=parity){
            return false;
        }
      }
      return true;
    }
}