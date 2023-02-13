import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String a : args) {
            Integer freq = map.get(a);
            map.put(a, (freq == null) ? 1 : freq + 1);
        }
        System.out.println(map.size() + " different words: ");
        System.out.println(map);
    }
}
