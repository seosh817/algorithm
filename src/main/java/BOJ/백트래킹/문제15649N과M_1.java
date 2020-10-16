package BOJ.백트래킹;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 문제15649N과M_1 {

    static int N;
    static int M;
    static int[] arr;
    static boolean[] checked;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] nums = br.readLine().split(" ");
            N = Integer.parseInt(nums[0]);
            M = Integer.parseInt(nums[1]);
            arr = new int[M];
            checked = new boolean[N];
            tracking(arr, checked, 0);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void tracking(int[] arr, boolean[] checked, int k) {
        if (k == M) { // m개를 모두 택하였다면 출력
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i]+1 + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) { //0부터 n-1의 숫자에 대해 (만약 N이 3이라면 0출발, 1출발, 2출발)
            if(!checked[i]) { //아직 i가 사용되지 않았다면
                arr[k] = i; // k번째 수를 i로 정함 (
                checked[i] = true; // i가 사용되었다고 표시
                tracking(arr, checked, k+1); // 다음 수를 정하기 위해 한단계 들어감
                checked[i] = false; // k번째 수를 i로 확정한 경우에 대해서 확인하였으므로 i를 이제 사용 X
            }
        }

    }


}