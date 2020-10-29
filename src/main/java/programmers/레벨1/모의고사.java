package programmers.레벨1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사 {

    public static int[] solution(int[] answers) {
        int[] array1 = new int[]{1, 2, 3, 4, 5};
        int[] array2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] array3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] countList = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (array1[i % 5] == answers[i]) countList[0]++;
            if (array2[i % 8] == answers[i]) countList[1]++;
            if (array3[i % 10] == answers[i]) countList[2]++;
        }

        int max = countList[0];
        for(int i=0; i<countList.length; i++) {
            if(max < countList[i]) {
                max = countList[i];
            }
        }

        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < countList.length; i++) {
            if (max == countList[i]) {
                array.add(i);
            }
        }

        int[] answer = new int[array.size()];
        for (int i=0; i< array.size(); i++) {
            answer[i] = array.get(i) + 1;
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 2, 4, 2})));
    }
}
