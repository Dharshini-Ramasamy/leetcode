class Solution {
    public int subtractProductAndSum(int n){
        int temp=n;
        int pro=1;
        int sum=0;
        while(temp!=0){
            int dig=temp%10;
            pro*=dig;
            sum+=dig;
            temp/=10;
        }
        return pro-sum;
    }
}