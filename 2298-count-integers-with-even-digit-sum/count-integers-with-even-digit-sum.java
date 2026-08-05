class Solution {
    public int countEven(int num) {
        int sum=0;
        int temp=num;
        while(temp!=0){
            int dig=temp%10;
            sum+=dig;
            temp/=10;
        }
        if(sum%2==0){
            return num/2;
        }
        else{
            return (num-1)/2;
        }
    }
}