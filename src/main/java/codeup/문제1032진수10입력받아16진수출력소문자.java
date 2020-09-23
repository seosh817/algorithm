package codeup;

import java.util.Scanner;

//소문자로 출력
public class 문제1032진수10입력받아16진수출력소문자 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(String.format("%x", num));
    }
}
