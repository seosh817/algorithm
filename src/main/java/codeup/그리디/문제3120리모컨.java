package codeup.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문제3120리모컨 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] temps = br.readLine().split(" ");
            int startTemp = Integer.parseInt(temps[0]);
            int targetTemp = Integer.parseInt(temps[1]);
            int need = Math.abs(targetTemp - startTemp);
            int count = 0;

            while (true) {
                if (need == 0) {
                    break;
                } else if (need >= 8) {
                    need -= 10;
                    count++;
                } else if (need >= 3) {
                    need -= 5;
                    count++;
                } else if (need > 0) {
                    need -= 1;
                    count++;
                } else if (need > -3) {
                    need += 1;
                    count++;
                } else {
                    need *= 1;
                }
            }
            System.out.println(count);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
