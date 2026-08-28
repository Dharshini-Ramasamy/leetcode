class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=k;
        while(true){
            boolean found=false;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==n){
                  found=true;
                  break;
                }}
                if(found==false){
                   return n;
                }
                n+=k; 
            }
        }
    }
