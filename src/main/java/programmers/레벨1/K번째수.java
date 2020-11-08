package programmers.레벨1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class K번째수 {

    public static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
                int[] tempArray = new int[commands[i][1]-commands[i][0]+1];
                for(int j=0; j<tempArray.length; j++) {
                    tempArray[j] = array[j+commands[i][0] -1];
                }
                Arrays.sort(tempArray);
                answer[i] = tempArray[commands[i][2]-1];
        }



        return answer;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }
}
