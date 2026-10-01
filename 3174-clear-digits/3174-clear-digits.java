class Solution {
    public String clearDigits(String s) {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'){
                if(!stack.isEmpty()){
                   stack.pop();
                }
            }
            else{
                stack.push(s.charAt(i));
            }
            
        }
        String d="";
        while(!stack.isEmpty()){
            d=stack.pop()+d;
        }
        return d;
    }
}