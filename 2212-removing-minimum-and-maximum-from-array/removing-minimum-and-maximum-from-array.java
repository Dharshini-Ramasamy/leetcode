class Solution {
    public int minimumDeletions(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int minidx=0;
        int maxidx=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]<min){
            min=nums[i];
            minidx=i;
           }
           if(nums[i]>max){
            max=nums[i];
            maxidx=i;
           }
        }
        int mini=Math.min(minidx,maxidx);
        int maxi=Math.max(minidx,maxidx);
        int count1=maxi+1;
        int count2=nums.length-mini;
        int count3=(mini+1)+(nums.length-maxi);
        return Math.min(count1,Math.min(count2,count3));
    }
}