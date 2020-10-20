package BOJ.백트래킹;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 문제1182부분수열의합 {

    static int n;
    static int s;
    static int[] array;
    static int[] trackingArray;
    static int cnt;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] nums = br.readLine().split(" ");
            n = Integer.parseInt(nums[0]);
            s = Integer.parseInt(nums[1]);
            cnt = 0;
            String[] tempArray = br.readLine().split(" ");
            array = new int[n];
            trackingArray = new int[n];
            for (int i = 0; i < tempArray.length; i++) {
                array[i] = Integer.parseInt(tempArray[i]);
            }
            backtracking(0, 0);
            if (s == 0) {
                cnt--;
            }
            System.out.println(cnt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void backtracking(int cur, int sum) {
        if (cur == n) { // 다 탐색 하였을 경우에만 결과값을 출력 (이유: 전부 탐색 안했는데 결과를 출력해버리면 선택하지 않았을 경우 계속 0인데 다 더해버리니까)
            if (s == sum) {
                cnt++;
            }
            return;
        }

        // 1, -7 .... 2, -3
        backtracking(cur + 1, sum + array[cur]);
        backtracking(cur + 1, sum);
    }
}