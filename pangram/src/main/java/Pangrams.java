/**
 * Created by jentrudell on 8/27/16.
 */

import java.util.*;

public class Pangrams {
    public static boolean isPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        char[] letters = sentence.toLowerCase().toCharArray();
        HashMap<Character, Integer> alphabet = new HashMap();
        for (int i = 0; i < letters.length; i++) {
            Character letter = letters[i];
            if (Character.isLetter(letter) && !alphabet.containsKey(letter)) {
                alphabet.put(letter, 1);
            }
        }
        if (alphabet.size() == 26) {
            return true;
        };
        return false;
    }
}
