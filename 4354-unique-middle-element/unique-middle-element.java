class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid=nums.length/2;
        int num=nums[mid];
        for(int i=0;i<mid;i++){
            if(nums[i]==num){
                return false;
            }
            else{
                continue;
            }
        }
        for(int i=mid+1;i<nums.length;i++){
            if(nums[i]==num){
                return false;
            }
            else{
                continue;
            }
        }
        return true;
    }
}