class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int minlen=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
             sum+=nums[right];
             while(sum>=target){
                int currentlength=right-left+1;
                minlen=Math.min(minlen,currentlength);
                sum-=nums[left];
                left++;
             }
        }
        if(minlen>nums.length){
            return 0;
        }
        else{
            return minlen;
        }
    }
}