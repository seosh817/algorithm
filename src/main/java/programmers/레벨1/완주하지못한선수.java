package programmers.레벨1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 완주하지못한선수 {

    /*
        Set<String> keys = hashMap.keySet();
        for(String key: keys) {
            System.out.println(key);
        }
        keys.forEach(key -> System.out.println(key));

        Collection<Integer> values = hashMap.values();
        values.forEach(System.out::println);

        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        hashMap.forEach((key, value) -> {
            System.out.println("key :"+ key);
            System.out.println("value :"+ value);
        });

        if(hashMap.containsKey("key")) {

        }else {

        }

        hashMap.getOrDefault("key", 0);
*/

    public static String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            hashMap.put(participant[i], hashMap.getOrDefault(participant[i], 0) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            if (hashMap.containsKey(completion[i])) {
                hashMap.put(completion[i], hashMap.get(completion[i]) - 1);
            }
        }

        String answer = "";
        Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() != 0) {
                answer = entry.getKey();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }
}
