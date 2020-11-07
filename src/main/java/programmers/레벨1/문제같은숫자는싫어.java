package programmers.레벨1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문제같은숫자는싫어 {

    public static int[] solution(int []arr) {
        List<Integer> list = new ArrayList();
        int pre = -100, cur;
        for(int i=0; i<arr.length; i++) {
            cur = arr[i];
            if(pre!=cur) {
                list.add(arr[i]);
            }
            pre = cur;
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
    }
}
