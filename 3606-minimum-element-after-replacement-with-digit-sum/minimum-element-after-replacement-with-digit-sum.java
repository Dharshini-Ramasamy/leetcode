class Solution {
    public int minElement(int[] nums) {
        int[]arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            while(nums[i]!=0){
                int dig=nums[i]%10;
                sum+=dig;
                nums[i]/=10;
            }
            arr[i]=sum;
        }
         Arrays.sort(arr);
        return arr[0];
    }
}