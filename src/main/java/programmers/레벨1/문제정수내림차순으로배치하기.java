package programmers.레벨1;

import java.util.Arrays;
import java.util.Comparator;

public class 문제정수내림차순으로배치하기 {

    public static long solution(long n) {
        String stringN = String.valueOf(n);
        String[] arr = stringN.split("");

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            builder.append(arr[i]);
        }

        long answer = Long.parseLong(builder.toString());
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
