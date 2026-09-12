class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr=new int[nums.length];
        int n=k%nums.length;
        int m=nums.length-n;
        for(int i=0;i<n;i++){
            arr[i]=nums[m];
            m++;
        }
        int j=0;
        for(int i=n;i<nums.length;i++){
            arr[i]=nums[j];
            j++;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        
    }
}