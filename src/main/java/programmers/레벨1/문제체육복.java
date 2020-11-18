package programmers.레벨1;

import java.util.Arrays;

public class 문제체육복 {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        try {
            int[] student = new int[n];
            for (int i = 0; i < n; i++) {
                student[i] = 1;
            }
            for (int i = 0; i < reserve.length; i++) {
                student[reserve[i]-1]++;
            }
            for (int i = 0; i < lost.length; i++) {
                student[lost[i]-1]--;
            }

            for (int i = 0; i < student.length; i++) {
                if (student[i] <= 0) {
                    if (i != student.length-1 && student[i + 1] > 1) {
                        student[i + 1]--;
                        student[i]++;
                    } else if (i!=0 && student[i - 1] > 1) {
                        student[i - 1]--;
                        student[i]++;
                    }
                }
            }

            for(int i=0; i< student.length; i++) {
                if(student[i] >= 1) {
                    answer++;
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
    }
}
