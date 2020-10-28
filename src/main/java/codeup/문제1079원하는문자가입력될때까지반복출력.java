package codeup;

import java.util.Scanner;

public class 문제1079원하는문자가입력될때까지반복출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char word = sc.next().charAt(0);
            System.out.println(word);
            if (word == 'q') {
                break;
            }
        }
    }
}