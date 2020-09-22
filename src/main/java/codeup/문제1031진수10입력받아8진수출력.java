package codeup;

import java.util.Scanner;

public class 문제1031진수10입력받아8진수출력 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(String.format("%o", num));
    }
}
