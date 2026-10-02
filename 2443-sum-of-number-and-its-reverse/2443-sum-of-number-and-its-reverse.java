class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0){
            return true;
        }
        for(int i=num/2;i<=num;i++){
            int temp=i;
            int rev=0;
            while(temp!=0){
                int dig=temp%10;
                rev=rev*10+dig;
                temp/=10;
            }
            if((i+rev)==num){
                return true;
            }
        }
        return false;
    }
}