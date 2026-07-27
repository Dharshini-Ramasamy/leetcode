class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int pro=1;
        int pro2=1;
        int pro3=1;
        int pro4=1;
        pro*=nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];
        pro2*=nums[0]*nums[1]*nums[2];
        pro3*=nums[nums.length-2]*nums[nums.length-1]*nums[0];
        pro4*=nums[nums.length-1]*nums[0]*nums[1];
        int max1=Math.max(pro,pro2);
        int max2=Math.max(pro3,pro4);
        return Math.max(max1,max2);
    }
}