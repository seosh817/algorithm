package codeup;

import java.util.Scanner;

public class 문제1045정수2개입력받아자동계산 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(String.format("%.2f", (double) a / b));
    }
}
