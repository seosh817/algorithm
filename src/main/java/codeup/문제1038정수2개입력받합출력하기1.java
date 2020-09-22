package codeup;

import java.util.Scanner;


// int가 -1073741824 ~ 1073741824 가범위인데 합이 범위 넘어가면 이상한 값 출력되므로 double로 캐스팅 후 더블로 더하고 소수점 자름
public class 문제1038정수2개입력받합출력하기1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        System.out.println(String.format("%.0f", a + b));
    }
}