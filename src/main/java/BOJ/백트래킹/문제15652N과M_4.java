package BOJ.백트래킹;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 문제15652N과M_4 {

    static int N;
    static int M;
    static int[] arr;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] nums = br.readLine().split(" ");
            N = Integer.parseInt(nums[0]);
            M = Integer.parseInt(nums[1]);
            arr = new int[M];
            tracking(arr, 0);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void tracking(int[] arr, int k) {
        if (k == M) {
            for (int i = 0; i < k; i++) {
                System.out.print(arr[i] + 1 + " ");
            }
            System.out.println();
            return;
        }
        int start = 0;
        if (k > 0) start = arr[k - 1];
        for (int i = start; i < N; i++) {
            arr[k] = i;
            tracking(arr, k + 1);
        }
    }
}
