package codeup;

import java.util.Scanner;

public class 문제1037정수입력받아아스키코드출력 {


    // %d 입력 -> %c로 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char ascii = (char) num;
        System.out.println(ascii);
    }
}
