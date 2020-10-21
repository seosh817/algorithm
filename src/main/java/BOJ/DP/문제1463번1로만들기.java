package BOJ.DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 문제1463번1로만들기 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            int[] d = new int[n+1];
            d[1] = 0;
            for (int i = 2; i <= n; i++) {
                d[i] = d[i - 1] + 1;
                if (i % 2 == 0) d[i] = Math.min(d[i], d[i / 2] + 1);
                if (i % 3 == 0) d[i] = Math.min(d[i], d[i / 3] + 1); //이게 Best
            }
            System.out.println(d[n]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
