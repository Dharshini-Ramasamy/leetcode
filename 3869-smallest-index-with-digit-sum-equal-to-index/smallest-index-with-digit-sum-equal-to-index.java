class Solution {
    public int smallestIndex(int[] nums) {
        int min=Integer.MAX_VALUE;
        boolean found=false;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int sum=0;
            while(temp!=0){
                int dig=temp%10;
                sum+=dig;
                temp/=10;
            }
            if(sum==i&&sum<min){
                min=sum;
                found=true;
            }
        }
        if(found==false){
            return -1;
        }
        return min;
        
    }
}