package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ReorderDataInLogFiles {
    private static int compare(String o1, String o2) {
        String o1Actual = Arrays.<String>stream(o1.split(" ")).skip(1).reduce(((s, s2) -> s + " " + s2)).get();
        String o2Actual = Arrays.stream(o2.split(" ")).skip(1).reduce(((s, s2) -> s + " " + s2)).get();
        int compare = o1Actual.compareTo(o2Actual);
        if (compare == 0) {
            o1Actual = o1.split(" ")[0];
            o2Actual = o2.split(" ")[0];
            return o1Actual.compareTo(o2Actual);
        } else {
            return compare;
        }
    }

    public String[] reorderLogFiles(String[] logs) {
        List<String> digitLogs = new ArrayList<>();
        List<String> letterLogs = new ArrayList<>();
        for(String log:logs){
            String iden = log.split(" ")[1];
            try{
               Float.parseFloat(iden);
               digitLogs.add(log);
            } catch(Exception e) {
                letterLogs.add(log);
            }
        }
        letterLogs.sort(ReorderDataInLogFiles::compare);
        letterLogs.addAll(digitLogs);
        return letterLogs.stream().toArray(String[]::new);
    }

}
