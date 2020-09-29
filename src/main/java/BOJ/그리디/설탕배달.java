package BOJ.그리디;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//그리디, 다이나믹 프로그래밍
public class 설탕배달 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());

            int count = 0;
            int remain = 0;
            if (n / 5 > 0) {
                count += n / 5;
                remain = n % 5;
            } else {
                count = -1;
            }
            if (remain % 3 > 0) {
                count += (remain / 3) + 1;
            } else {
                count += remain / 3;
            }

            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
