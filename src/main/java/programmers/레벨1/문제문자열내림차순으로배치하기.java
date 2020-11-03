package programmers.레벨1;

import java.util.Arrays;
import java.util.Comparator;

public class 문제문자열내림차순으로배치하기 {
    public static String solution(String s) {

        String[] array = s.split("");
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        String answer ="";
        for(int i=0; i< array.length; i++) {
            answer += array[i];
        }


        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
}
