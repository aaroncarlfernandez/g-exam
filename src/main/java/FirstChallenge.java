import java.util.*;

public class FirstChallenge {

    public Character firstRepeatedChar(String input) {
        LinkedHashMap<Character, Integer> encounteredChar = new LinkedHashMap<>();

        for (char c: input.toCharArray()) {
            if (!encounteredChar.containsKey(c)) {
                encounteredChar.put(c,1);
            } else {
                encounteredChar.put(c,encounteredChar.get(c)+1);
            }
        }

        for (Map.Entry<Character,Integer> map : encounteredChar.entrySet()) {
            if (map.getValue()>1) return map.getKey();
        }

        return null;
    }
    
}
