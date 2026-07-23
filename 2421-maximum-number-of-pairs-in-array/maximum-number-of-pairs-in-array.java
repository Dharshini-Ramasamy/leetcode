class Solution {
    public int[] numberOfPairs(int[] nums) {
        int arr[]=new int[2];
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    if(nums[i]!=-1&&nums[j]!=-1){
                    count++;
                    nums[i]=-1;
                    nums[j]=-1;
                    break;
                }}
            }
        }
        arr[0]=count;
        arr[1]=nums.length-(2*count);
        return arr;
    }
}