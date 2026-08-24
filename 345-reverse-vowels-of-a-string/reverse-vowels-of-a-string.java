class Solution {
    public String reverseVowels(String s) {
        char[]c=s.toCharArray();
        int d=0;
        int m=c.length-1;
        while(d<m){
            if(c[d]!='A'&&c[d]!='E'&&c[d]!='I'&&c[d]!='O'&&c[d]!='U'&&c[d]!='a'&&c[d]!='e'&&c[d]!='i'&&c[d]!='o'&&c[d]!='u'){
                d++;
            }
            else if(c[m]!='A'&&c[m]!='E'&&c[m]!='I'&&c[m]!='O'&&c[m]!='U'&&c[m]!='a'&&c[m]!='e'&&c[m]!='i'&&c[m]!='o'&&c[m]!='u'){
                m--;
            }
            else{
                char temp=c[d];
                c[d]=c[m];
                c[m]=temp;
                d++;
                m--;
            }
        }
        return new String(c);

    }
}