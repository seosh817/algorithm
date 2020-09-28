package codeup.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문제3301거스름돈 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int money = Integer.parseInt(br.readLine());
            int count = 0;
            while (true) {
                if (money / 10 == 0) {
                    break;
                } else if (money / 50000 != 0) {
                    int tempCount = money / 50000;
                    count += tempCount;
                    money -= (50000 * (tempCount));
                } else if (money / 10000 != 0) {
                    int tempCount = money / 10000;
                    count += tempCount;
                    money -= 10000 * (tempCount);
                } else if (money / 5000 != 0) {
                    int tempCount = money / 5000;
                    count += tempCount;
                    money -= 5000 * (tempCount);
                } else if (money / 1000 != 0) {
                    int tempCount = money / 1000;
                    count += tempCount;
                    money -= 1000 * (tempCount);
                } else if (money / 500 != 0) {
                    int tempCount = money / 500;
                    count += tempCount;
                    money -= 500 * (tempCount);
                } else if (money / 100 != 0) {
                    int tempCount = money / 100;
                    count += tempCount;
                    money -= 100 * (tempCount);
                } else if (money / 50 != 0) {
                    int tempCount = money / 50;
                    count += tempCount;
                    money -= 50 * (tempCount);
                } else if (money / 10 != 0) {
                    int tempCount = money / 10;
                    count += tempCount;
                    money -= 10 * (tempCount);
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
