class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    arr[0]=nums[i];
                }
            }
        }
        
        for(int i=1;i<nums.length+1;i++){
            boolean found=false;
            for(int j=0;j<nums.length;j++){
            
            if(nums[j]==i){
               found=true;
               break;
            }}
            if(found==false){
                arr[1]=i;
                break;
            }
        }
        return arr;
    }
}