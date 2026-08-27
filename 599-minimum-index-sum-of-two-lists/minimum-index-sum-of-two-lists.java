class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int count=0;
        int min=Integer.MAX_VALUE;
        int k=0;
        int sum=0;
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    sum=i+j;
                    if(sum<min){
                        min=sum;
                    }
                }
            }
        }
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    if(i+j==min){
                    count++;
                }}
            }
        }
        String arr[]=new String[count];
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                  if(i+j==min){
                    arr[k]=list1[i];
                    k++;
                  }
                }
            }
        }
        return arr;
    }
}