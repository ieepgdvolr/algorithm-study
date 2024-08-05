package interview.ch06;

import java.util.*;

public class anagramTest {
    public static void main(String[] args) {
        String[] arrStr = {"eat", "tea", "tan", "ate", "ant", "cat"};
        groupAnagrams(arrStr);
    }

    public static List groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for(String word : strs){
            char[] arrChar = word.toCharArray();
            Arrays.sort(arrChar);
            String key = new String(arrChar);

            if(!result.containsKey(key)){
                result.put(key, new ArrayList<>());
            }
            result.get(key).add(word);
        }
        return new ArrayList(result.values());
    }
}
