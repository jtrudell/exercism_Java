import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Etl {

    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
        Map<String, Integer> transformedScoring = new HashMap();

        for (Map.Entry<Integer, List<String>> entry : old.entrySet()) {
            Integer point = entry.getKey();
            for (String letter : entry.getValue()) {
                transformedScoring.put(letter.toLowerCase(), point);
            }
        }

        return transformedScoring;
    }
}
