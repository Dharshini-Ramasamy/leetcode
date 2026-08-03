class Solution {
    public int minElement(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]!=0){
                int dig=nums[i]%10;
                sum+=dig;
                nums[i]/=10;
            }
            ans=Math.min(sum,ans);
        }
        return ans;
    }
}