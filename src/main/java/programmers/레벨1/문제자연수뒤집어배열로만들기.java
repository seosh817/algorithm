package programmers.레벨1;

import java.util.Arrays;

public class 문제자연수뒤집어배열로만들기 {
    public static int[] solution(long n) {
        String nString = n + "";
        String[] nStringArray = nString.split("");
        int[] nIntArray = new int[nStringArray.length];

        for(int i=0; i<nStringArray.length; i++) {
            nIntArray[i] = Integer.parseInt(nStringArray[nStringArray.length-1-i]);
        }

        return nIntArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }
}
