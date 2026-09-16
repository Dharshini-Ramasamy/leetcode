class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        String[] arr1=coordinate1.split("");
        String[] arr2=coordinate2.split("");
        int n=Integer.parseInt(arr1[1])%2;
        int m=Integer.parseInt(arr2[1])%2;
        if((arr1[0].equals("a")||arr1[0].equals("c")||arr1[0].equals("e")||arr1[0].equals("g"))&&(arr2[0].equals("a")||arr2[0].equals("c")||arr2[0].equals("e")||arr2[0].equals("g"))){
            if(n==m){
                return true;
            }
        }
       else if((arr1[0].equals("b")||arr1[0].equals("d")||arr1[0].equals("f")||arr1[0].equals("h"))&&(arr2[0].equals("b")||arr2[0].equals("d")||arr2[0].equals("f")||arr2[0].equals("h"))){
            if(n==m){
                return true;
            }
        }
        else if((arr1[0].equals("a")||arr1[0].equals("c")||arr1[0].equals("e")||arr1[0].equals("g"))&&(arr2[0].equals("b")||arr2[0].equals("d")||arr2[0].equals("f")||arr2[0].equals("h"))){
            if(n!=m){
                return true;
            }
        }
        else if((arr1[0].equals("b")||arr1[0].equals("d")||arr1[0].equals("f")||arr1[0].equals("h"))&&(arr2[0].equals("a")||arr2[0].equals("c")||arr2[0].equals("e")||arr2[0].equals("g"))){
            if(n!=m){
                return true;
            }
        }
        
      return false;
    }
}