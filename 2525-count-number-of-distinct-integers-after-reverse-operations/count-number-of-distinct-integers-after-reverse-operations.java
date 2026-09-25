class Solution {
    public int countDistinctIntegers(int[] nums) {
        int[] arr=new int[nums.length*2];
        int j=nums.length;
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int rev=0;
            while(temp!=0){
                int dig=temp%10;
                rev=rev*10+dig;
                temp/=10;
            }
            arr[j]=rev;
            j++;

        }
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return set.size();
    }
}