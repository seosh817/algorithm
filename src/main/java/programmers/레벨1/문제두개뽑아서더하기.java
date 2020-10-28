package programmers.레벨1;

import java.util.*;

public class 문제두개뽑아서더하기 {

    public static int[] solution1(int[] numbers) {
        int[] answer = {};
        List<Integer> array = new ArrayList();
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                if(!array.contains(numbers[i] + numbers[j])) {
                    array.add(numbers[i] + numbers[j]);
                }
            }
        }

        Collections.sort(array);
        answer = new int[array.size()];
        for(int i=0; i< array.size(); i++) {
            answer[i] = array.get(i);
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution1(new int[]{2, 1, 3, 4, 1})));
    }
}
