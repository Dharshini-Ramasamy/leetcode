class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev=0;
        int temp=num;
        int tempp=0;
        while(temp!=0){
            int digit=temp%10;
            rev=rev*10+digit;
            temp/=10;
        }
        while(rev!=0){
           int digit=rev%10;
           tempp=tempp*10+digit;
           rev/=10;
        }
        if(tempp==num){
            return true;
        }
        return false;


    }
}