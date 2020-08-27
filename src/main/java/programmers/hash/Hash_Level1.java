package programmers.hash;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hash_Level1 {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String [] args) {
        System.out.println(solution(new String [] {"leo", "kiki", "eden"}, new String [] {"eden", "kiki"}));
    }
}
