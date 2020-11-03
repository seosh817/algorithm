package programmers.레벨1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 문제문자열내마음대로정렬하기 {

    public static String[] solution(String[] strings, int n) {


        Arrays.sort(strings, new Comparator<String>() {

            //앞에 값(o1)과 뒤의 값(o2)을 비교해서 리턴값을 양수로 주면 값을 바꿈 -> 오름차순
            //앞에 값(o1)과 뒤의 값(o2)을 비교해서 리턴값을 음수로 주면 값을 바꾸지 않음 -> 내림차순
            @Override
            public int compare(String o1, String o2) {
                if (o1.charAt(n) > o2.charAt(n)) {
                    return 1;
                } else if (o1.charAt(n) == o2.charAt(n)) {
                    return o1.compareTo(o2);
                } else {
                    return -1;
                }
            }
        });

        return strings;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"abce", "abde", "cdx"}, 1)));
    }
}
