class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] arr=new String[score.length];
        for(int i=0;i<score.length;i++){
          int count=1;
          for(int j=0;j<score.length;j++){
            if(score[j]>score[i]){
                count++;
            }
        }
          if(count==1){
            arr[i]="Gold Medal";
          }
          else if(count==2){
            arr[i]="Silver Medal";
          }
          else if(count==3){
            arr[i]="Bronze Medal";
          }
          else{
            arr[i]=String.valueOf(count);
          }
        }
        return arr;        
    }
}