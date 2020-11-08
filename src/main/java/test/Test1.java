package test;

import java.util.*;

public class Test1 {

    static int solution(long n) {
        int answer = 0;
        try {

            String[] array = String.valueOf(n).split("");
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for(int i=0; i< array.length; i++) {
                int temp = Integer.parseInt(array[i]);
                hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);
            }

            Iterator<Integer> keys = hashMap.keySet().iterator();

            System.out.println(hashMap);
            while(keys.hasNext()) {
                int key = keys.next();
                if(key != 0) {
                    if(n % key == 0) {
                        answer++;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2232));
        //System.out.println(solution(1234));
        //System.out.println(solution(2550));
    }
}
