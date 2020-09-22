package codeup;

import java.util.Scanner;

public class 문제1040정수1개입력받아부호바꿔출력 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(String.format("%d", -num));
    }
}
