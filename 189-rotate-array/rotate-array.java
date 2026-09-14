class Solution { 
    public void rotate(int[] nums, int k) { 
        
        int[] arr = new int[nums.length]; 
        int n = k % nums.length; 
        
        for(int i = 0; i < n; i++) { 
            arr[i] = nums[nums.length - n + i]; 
        } 
        
        for(int i = n; i < nums.length; i++) { 
            arr[i] = nums[i - n]; 
        } 
        
        for(int i = 0; i < nums.length; i++) { 
            nums[i] = arr[i]; 
        } 
    } 
}