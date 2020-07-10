package programmers.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//https://programmers.co.kr/learn/courses/30/lessons/42578?language=java
public class Hash_Level2_Camouflage {

    public static int solution(String[][] clothes) {
        int answer = 0;

        Map<String, Integer> hm = new HashMap<String, Integer>();

        for(int i=0; i<clothes.length; i++) {
            String kind = clothes[i][1];
            int num = 1;
            if (hm.containsKey(kind)) {
                num = hm.get(kind) +1;
            }
            hm.put(kind, num);
        }

        Iterator<String> keys = hm.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            answer *= hm.get(key) + 1;
        }

        answer --;

        return answer;
    }

    public static void main(String [] args) {
        System.out.println(solution(new String [][] {{ "yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"} , {"green_turban", "headgear"}}));
    }
}
