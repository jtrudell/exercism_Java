import java.util.Map;
import java.util.HashMap;

public class DNA {
    char[] letters;

    DNA(String dnaString) {
        letters = dnaString.toCharArray();
    }

    public int count(char letter) {
        Map<Character, Integer> currentCount = this.nucleotideCounts();
        if (currentCount.containsKey(letter)) {
            return currentCount.get(letter);
        }
        throw new IllegalArgumentException();
    }

    public Map<Character, Integer> nucleotideCounts() {
        HashMap<Character, Integer> currentCount = new HashMap();
        currentCount.put('A', 0);
        currentCount.put('C', 0);
        currentCount.put('G', 0);
        currentCount.put('T', 0);
        for (int i=0; i<letters.length; i++) {
            char letter = letters[i];
            int count = currentCount.get(letter);
            currentCount.put(letter, count + 1);
        }
        return currentCount;
    }
}
