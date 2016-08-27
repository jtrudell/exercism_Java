import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public Map<String, Integer> phrase(String phrase) {
        HashMap<String, Integer> tally = new HashMap();
        String formatted = phrase.replaceAll("[^a-zA-Z0-9\\s]", "");
        String[] words = formatted.split(" ");
        for (String word : words) {
            int count = 0;
            word = word.toLowerCase();
            if (tally.containsKey(word)) {
                count = tally.get(word);
            }
            if (!word.equals("")) {
                tally.put(word, count + 1);
            }
        }
        return tally;
    }
}
