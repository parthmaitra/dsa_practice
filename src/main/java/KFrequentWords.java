import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> frequency = new HashMap();
        for(String word:words) {
            if(frequency.get(word)!=null){
                frequency.put(word, frequency.get(word)+1);
            }
            else {
                frequency.put(word, 1);
            }
        }
        return frequency.entrySet().stream().sorted((e1,e2)-> {
            int i = e2.getValue() - e1.getValue();
            return i!=0?i:e1.getKey().compareTo(e2.getKey());
        }
        ).map(e->e.getKey()).limit(k).collect(Collectors.toList());
    }
}
