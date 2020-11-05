package programmers.레벨1;

import java.util.Arrays;

public class 문제카카오다트게임 {
    public static int solution(String dartResult) {
        int[] scores = new int[3];
        try {
            String temp = "";
            int idx = 0;
            for (int i = 0; i < dartResult.length(); i++) {
                char c = dartResult.charAt(i);
                if (c >= '0' && c <= '9') {
                    temp += c;
                } else {
                    if (!temp.equals("")) {
                        scores[idx] = Integer.parseInt(temp);
                        temp = "";
                        idx++;
                    }
                    if (c == 'S') {
                        scores[idx - 1] = (int) Math.pow(scores[idx - 1], 1);
                    } else if (c == 'D') {
                        scores[idx - 1] = (int) Math.pow(scores[idx - 1], 2);
                    } else if (c == 'T') {
                        scores[idx - 1] = (int) Math.pow(scores[idx - 1], 3);
                    } else if (c == '*') {
                        if (idx - 1 == 0) {
                            scores[idx - 1] = scores[idx - 1] * 2;
                        } else {
                            scores[idx - 1] = scores[idx - 1] * 2;
                            scores[idx - 2] = scores[idx - 2] * 2;
                        }
                    } else if (c == '#') {
                        scores[idx-1] = scores[idx-1] * -1;
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return scores[0] + scores[1] + scores[2];
    }

    public static void main(String[] args) {
        System.out.println(solution("1S2D*3T"));
    }
}
