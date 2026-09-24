class Solution {
    public String convert(String s, int numRows) {
        if(numRows<=1 || s.length()<=numRows){
            return s;
        }
       String b[]=new String[numRows];
       for(int i=0;i<b.length;i++){
        b[i]="";
       }
       int index=0;
       boolean g=false;
       for(char ch:s.toCharArray()){
        b[index]+=ch;
        if(index==0 || index==numRows-1){
            g=!g;
            }
            index+=g? 1:-1;
        
       }
        String c="";
        for(String d:b){
            c=c+d;
        }
        return c;
    }
}
