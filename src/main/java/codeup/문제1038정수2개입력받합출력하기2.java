package codeup;

import java.util.Scanner;

public class 문제1038정수2개입력받합출력하기2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(String.format("%.0f", a + b));
    }
}
