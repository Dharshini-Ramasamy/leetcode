class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr=new int[num_people];
        int candy=1;
        int i=0;
        while(candies!=0){
        if(candy<candies){
           arr[i]+=candy;
           i++;
           candies-=candy;
           candy++;
        }
        else{
            arr[i]+=candies;
            candies=0;
        }
        if(i==num_people){
            i=0;
        }
        }
        return arr;
        
    }
}