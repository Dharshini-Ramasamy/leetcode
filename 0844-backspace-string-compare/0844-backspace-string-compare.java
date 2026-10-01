class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>stack=new Stack<>();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(!stack.isEmpty()){
                   stack.pop();
                }
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        Stack<Character>st=new Stack<>();
        if(t.charAt(0)!='#'){
        st.push(t.charAt(0));
        }
        for(int i=1;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(!st.isEmpty()){
                   st.pop();
                }
            }
            else{
                st.push(t.charAt(i));
            }
        }
        if(stack.equals(st)){
            return true;
        }
        return false;
        
    }
}