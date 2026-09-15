class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] arr=new String[score.length];
        for(int i=0;i<score.length;i++){
            arr[i]=String.valueOf(score[i]);
        }
        int m=Integer.MIN_VALUE;
        int d=Integer.MIN_VALUE;
        int v=Integer.MIN_VALUE;
        for(int i=0;i<score.length;i++){
            if(score[i]>m){
                v=d;
                d=m;
                m=score[i];
            }
            else if(score[i]<m&&score[i]>d){
                v=d;
                d=score[i];
            }
            else if(score[i]<d&&score[i]>v){
                v=score[i];
            }
        }
        for(int i=0;i<score.length;i++){
            if(score[i]==m){
                arr[i]="Gold Medal";
            }
            else if(score[i]==d){
                arr[i]="Silver Medal";
            }
            else if(score[i]==v){
                arr[i]="Bronze Medal";
            }
            else{
               int count=1;
               for(int j=0;j<score.length;j++){
                if(score[j]>score[i]){
                    count++;
                }
               }
               arr[i]=String.valueOf(count);
            }
        }
        return arr;

        
    }
}