class Solution {
    public boolean isPalindrome(String s) {
     String b="";
     s=s.toLowerCase();
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(Character.isLetterOrDigit(ch)){
            b=b+ch;
        }
     }
     String c="";
     for(int i=b.length()-1;i>=0;i--){
        c=c+b.charAt(i);
     }return b.equals(c);
    }
}