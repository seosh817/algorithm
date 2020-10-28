package codeup;

import java.util.Scanner;

public class 문제1046정수3개입력받아합과평균출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a + b + c);
        System.out.println(String.format("%.1f", (a + b + c) / 3f));
    }
}
