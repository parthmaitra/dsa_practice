package general;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> chars = new HashMap<>();
        int maxLength=0,i=0,j=0;
        if(s.length()==1){
            return 1;
        }
        while(i<s.length()){
            if(chars.get(s.charAt(i))!=null) {
                maxLength=Math.max(maxLength,i-j);
                System.out.println(i+" "+j+" "+maxLength);
                j=chars.get(s.charAt(i))+1;
                chars.replace(s.charAt(i),i);

                int finalJ = j;

                Map<Character, Integer> newMap = chars.entrySet().stream()
                        .filter(entry->entry.getValue()<finalJ)
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
                chars = (HashMap<Character, Integer>) newMap;
            }
            chars.put(s.charAt(i),i);
            i++;
        }
        System.out.println(i+" "+j+" "+maxLength);
        return Math.max(maxLength,i-j);
    }

    public static void main(String[] args) {
        System.out.println(new LongestSubstringWithoutRepeatingChars()
                .lengthOfLongestSubstring("abcabcbb"));
    }
}
