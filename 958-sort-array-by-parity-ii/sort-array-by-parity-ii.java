class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even=0;
        int odd=1;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(even<nums.length){
            if(nums[i]%2==0){
                arr[even]=nums[i];
                even+=2;
            }}
            if(nums[i]%2==1){
                if(odd<nums.length){
                arr[odd]=nums[i];
                odd+=2;
            }}
            
        }
        return arr;
    }
    }