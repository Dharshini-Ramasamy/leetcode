class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=findfirst(nums, target);
        int last=findlast(nums,target);
        return new int[]{first,last};
    }
    int findfirst(int nums[],int target){
        int first=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                first=mid;
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return first;
        }
        int findlast(int nums[],int target){
             int last=-1;
             int start=0;
             int end=nums.length-1;
             while(start<=end){
                int mid=(start+end)/2;
                if(nums[mid]==target){
                    last=mid;
                    start=mid+1;
                }
                else if(nums[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
        }
        return last;
    }
}
