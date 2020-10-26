package programmers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class 문제2016년 {
    public static String solution(int a, int b) {
        String answer = "";
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        String[] year = new String[366];
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int want_day = 0;

        for(int i=0; i< year.length; i++) {
            year[i] = day[(i+5)% 7];
        }

        for(int i=0; i<a-1; i++) {
            want_day += month[i];
        }

        want_day += b-1;

        answer = year[want_day];

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(5, 24));
    }
}