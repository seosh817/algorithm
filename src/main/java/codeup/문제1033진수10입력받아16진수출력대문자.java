package codeup;

import java.util.Scanner;

//대문자
public class 문제1033진수10입력받아16진수출력대문자 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(String.format("%X", num));
    }
}
