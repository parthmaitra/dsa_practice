package general;

public class IsSubSequence  {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while(j<t.length()&&i<s.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        if(i==s.length()){
            return true;
        }
        return false;
    }
}
