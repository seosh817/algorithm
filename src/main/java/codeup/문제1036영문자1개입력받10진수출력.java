package codeup;

import java.util.Scanner;

public class 문제1036영문자1개입력받10진수출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        // %c로 입력받고 -> %d로 출력
        char ascii = string.charAt(0);
        int num = (int) ascii;
        System.out.println(num);

    }
}
