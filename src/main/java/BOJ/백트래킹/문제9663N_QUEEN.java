package BOJ.백트래킹;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 문제9663N_QUEEN {

    static int n;
    static int cnt = 0;
    static int[] columns;


    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            n = Integer.parseInt(br.readLine());
            columns = new int[n];
            tracking(0);
            System.out.println(cnt);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void tracking(int cur) {
        if (cur == n) { // N개를 전부 놓는데 성공하였다면
            cnt++; // 배치 가능 수 하나 증가시키고 종료
/*            for (int i = 0; i < n; i++) {
                System.out.print(columns[i]);
            }
            System.out.println();*/
            return;
        }
        for (int i = 0; i < n; i++) { // row를 0부터 n까지 탐색
            columns[cur] = i; // (cur,i)에 돌을 놓자
            if (checkRow(cur)) { // (cur, i)에 놓았을 때 이전 돌들에 대해 직선, 대각선에 놓여있는지 체크
                tracking(cur + 1);
            }
        }
    }

    private static boolean checkRow(int cur) {
        for (int i = 0; i < cur; i++) {
            if (columns[cur] == columns[i]) return false; //같은 행 안됨
            if (Math.abs(columns[i] - columns[cur]) == Math.abs(cur - i)) return false;
        }
        return true;
    }
}
