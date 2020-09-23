package codeup;

import java.util.Scanner;

public class 문제1044정수1개입력받아1더해출력 {

    // int의 범위가 -2147483648 ~ +2147483647 이므로 2147483648은 int에 넣을수 없어서 쓰레기값이 뜬다.
    // 그래서 double에서 소숫점 짜르는걸로 해결해야함
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.println(String.format("%.0f", ++num));
    }
}
