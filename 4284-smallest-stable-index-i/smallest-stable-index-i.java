class Solution {
    public int firstStableIndex(int[] nums, int k) {
        boolean found=false;
        for(int i=0;i<nums.length;i++){
            int max1=nums[0];
            int max2=nums[i];
            for(int j=0;j<=i;j++){
                if(nums[j]>max1){
                    max1=nums[j];
                }
            }
            for(int m=i;m<nums.length;m++){
                if(nums[m]<max2){
                    max2=nums[m];
                }
            }
            if(max1-max2<=k){
                return i;
            }
            
        }
        return -1;
    }
}