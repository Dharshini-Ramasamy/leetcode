class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                stack.pop();
            }
            else if(operations[i].equals("D")){
                int v=stack.peek()*2;
                stack.push(v);
            }
            else if(operations[i].equals("+")){
                int f=stack.pop();
                int seco=stack.peek();
                int th=f+seco;
                stack.push(f);
                stack.push(th);
            }
            else{
                int valuee=Integer.parseInt(operations[i]);
                stack.push(valuee);
            }
        }
        int total=0;
        while(!stack.isEmpty()){
            total+=stack.pop();
        }
        return total;
    }
}