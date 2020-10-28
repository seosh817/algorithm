package codeup;

import java.util.Scanner;

public class 문제1077정수1개입력받아그수까지출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int start = 0;

        while (start <= num) {
            System.out.println(start);
            start++;
        }
    }
}
