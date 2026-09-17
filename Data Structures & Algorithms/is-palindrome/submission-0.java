class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        char ch[] = s1.toCharArray();
        int p1=0, p2=ch.length-1;

        while(p1<p2){
            // while(!((ch[p1]>=48 && ch[p1]<=57) ||
            // (ch[p1]>=65 && ch[p1]<=90)    ||
            // (ch[p1]>=97 && ch[p1]<=122)) && p1<p2) {
            while(!Character.isLetterOrDigit(ch[p1]) && p1<p2){
                p1++;
            }
            // while(!((ch[p2]>=48 && ch[p2]<=57) ||
            // (ch[p2]>=65 && ch[p2]<=90)    ||
            // (ch[p2]>=97 && ch[p2]<=122)) && p2>p1) {
            while(!Character.isLetterOrDigit(ch[p2]) && p2>p1){
                p2--;
            }
            if(ch[p1]!=ch[p2])
                return false;
            else{
                p1++;
                p2--;
            }
        }
        return true;
    }
}
