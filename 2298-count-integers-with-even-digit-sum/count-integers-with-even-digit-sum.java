class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            int sum=0;
            int n=i;
            while(n!=0){
                int dig=n%10;
                sum+=dig;
                n/=10;
            }
            if(sum%2==0){
                count++;
            }
        }
        return count;
    }
}