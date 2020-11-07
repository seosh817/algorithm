package programmers.레벨1;

import java.util.Arrays;

public class 문제문자열다루기기본 {

    public static boolean solution(String s) {
        char[] charArray = s.toCharArray();
        for(int i=0; i< charArray.length; i++) {
            if(!Character.isDigit(charArray[i])) {
                return false;
            }
        }
        if(!(s.length() == 4 || s.length() == 6)) return false;
        return true;
    }


    public static void main(String[] args) {
        System.out.println(solution("a234"));
    }
}
