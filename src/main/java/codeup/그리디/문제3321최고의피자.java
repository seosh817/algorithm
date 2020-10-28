package codeup.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 문제3321최고의피자 {

    //String.format은 소수점 이하 0이 있을 경우 그대로 출력 ex)37.500000

    //Math.floor(a); 버림
    //Math.abs(a); 절대값
    //Math.ceil(a); 올림
    //Math.round는 반올림 ex)37.5
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());

            String[] prices = br.readLine().split(" ");

            int doughPrice = Integer.parseInt(prices[0]);
            int toppingPrice = Integer.parseInt(prices[1]);

            int doughCalorie = Integer.parseInt(br.readLine());


            int[] toppingCalories = new int[n];

            for (int i = 0; i < n; i++) {
                toppingCalories[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(toppingCalories);


            int totalPrice = doughPrice;
            int totalCalorie = doughCalorie;
            float prevTotalCaloriePerPrice = totalCalorie / (float) totalPrice;

            for (int i = n - 1; i >= 0; i--) {
                totalCalorie += toppingCalories[i];
                totalPrice += toppingPrice;
                float totalCaloriePerPrice = totalCalorie / (float) totalPrice;
                if (totalCaloriePerPrice > prevTotalCaloriePerPrice) {
                    prevTotalCaloriePerPrice = totalCaloriePerPrice;
                } else {
                    break;
                }
            }


            System.out.printf("%1d", (int) Math.floor(prevTotalCaloriePerPrice));


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
