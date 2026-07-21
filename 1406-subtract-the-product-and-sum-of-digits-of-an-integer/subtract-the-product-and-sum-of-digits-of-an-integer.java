class Solution {
    public int subtractProductAndSum(int n) {
        int pro=1;
        int sum=0;
        int m=n;
        int temp=n;
        while(m!=0){
            int dig=m%10;
            sum+=dig;
            m/=10;
        }
        while(temp!=0){
            int dig=temp%10;
            pro=pro*dig;
            temp/=10;
        }
        return pro-sum;
    }
}