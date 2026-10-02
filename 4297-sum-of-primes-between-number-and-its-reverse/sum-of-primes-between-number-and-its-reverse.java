class Solution {
    public int sumOfPrimesInRange(int n) {
        int temp=n;
        int rev=0;
        int sum=0;
        while(temp!=0){
            int dig=temp%10;
            rev=rev*10+dig;
            temp/=10;
        }
        int start=Math.min(n,rev);
        int end=Math.max(n,rev);
        if(start==1){
            start=2;
        }
        for(int i=start;i<=end;i++){
            boolean found=false;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    found=true;
                    break;
                }
            }
            if(found==false){
               sum+=i;
            }
        }
        return sum;
    }
}