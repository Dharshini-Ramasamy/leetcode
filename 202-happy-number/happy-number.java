class Solution {
    public boolean isHappy(int n) {
        int temp=n;
        while(temp!=1&&temp!=4){
            int sum=0;
            while(temp!=0){
                int dig=temp%10;
                sum+=dig*dig;
                temp/=10;
            } 
            temp=sum;
        }
        return temp==1;
    }
}