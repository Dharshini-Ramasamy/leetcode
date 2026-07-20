class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int b=0;
        for(int i=1;i<=n;i++){
            int s=(i-1)%7;
            sum+=b+s+1;
            if(i%7==0){
                b++;
            }

        }
        return sum;
    }
}