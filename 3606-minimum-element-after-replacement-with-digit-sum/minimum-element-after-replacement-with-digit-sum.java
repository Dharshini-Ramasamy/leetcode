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
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[0];
    }
}