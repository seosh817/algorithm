package codeup;

import java.util.Scanner;

// https://codeup.kr/problem.php?id=1025
public class 문제1025정수1개입력받아나누어출력하기 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numString = scanner.next();

        int idx = 0;
        for (int i = numString.length() - 1; i >= 0; i--) {
            System.out.println("[" + Integer.parseInt(String.valueOf(numString.charAt(idx++))) * (int) Math.pow(10, i) + "]");
        }

    }
}
