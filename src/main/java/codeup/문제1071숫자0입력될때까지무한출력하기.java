package codeup;

import java.util.Scanner;

public class 문제1071숫자0입력될때까지무한출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }
            System.out.println(a);
        }

    }
}
